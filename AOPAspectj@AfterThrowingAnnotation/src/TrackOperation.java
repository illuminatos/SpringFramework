import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterThrowing(
			pointcut="execution(* Operation.*(..))",
			throwing="error"
			)
	public void myadvice(JoinPoint jp, Throwable error) {
		
		System.out.println("Additional Concern");
		System.out.println("Exception " + error);
	}
		
}

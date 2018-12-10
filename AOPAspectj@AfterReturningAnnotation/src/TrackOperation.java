import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterReturning(
			pointcut="execution(* Operation.*(..))",
			returning="result"
			)
	public void myadvice(JoinPoint jp, Object result) {
		
		System.out.println("Additional Concern");
		System.out.println("Method signature" + jp.getSignature());
		System.out.println("Result in advice" + result);
		System.out.println("end of after returnin advice...");
	}

}


public class PrintableFactory {
	
	public Printable getPrintable() { //nonstatic
		
		return new PrintA();
		//or return new PrintB();
	}

}

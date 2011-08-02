package test;

public class ClassC extends ClassB{
	public void printme(){
		System.out.println("C");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new ClassC().printthis();
		
		
		// TODO Auto-generated method stub

	}
public void printthis(){
		ClassB b = new ClassC();
		ClassB ba= new ClassB();
		ba.printme();
	//	ClassC cb= (ClassC) new ClassB();
		//cb.printme();
	//	cb.printthis();
		b.printme();
	//	(new ClassB).super.printme();
	//	c.printthis();
		super.printme();
		//super.super.printme();
	}

}

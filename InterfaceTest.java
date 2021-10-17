package functional.interfase;




//@FunctionalInterface
interface Foo{
	//void m1();

	public default String helloWorld() { 
		return "Hello World"; 
		} 
	
	public default String newWorld() { 
		return "New World"; 
		} 
}

@FunctionalInterface
interface Interface1 extends Foo{

	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}
}

interface Interface2 {

	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}
}


public class InterfaceTest implements Interface1,Interface2{


	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface2.super.log(str);
	}

	public static void main(String[] args) {
		
		// Compile time error to override one of the Interface method
		
		InterfaceTest test= new InterfaceTest();
		test.log("Deepak");
	}

}

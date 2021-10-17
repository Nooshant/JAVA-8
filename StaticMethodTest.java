package functional.interfase;

@FunctionalInterface
interface FunctionalInterfaceTest
{
	void m1();
}

interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	default boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

public class StaticMethodTest implements MyData {
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");
		return str == null ? true : false;
	}
	
	public static void main(String[] args) {
		new StaticMethodTest().print("Duke.........");
	}

}

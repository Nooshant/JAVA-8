package reflection.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


class Reflection {

	private String name;

	public Reflection() {
		name = "thakur";
	}

	public Reflection(int age) {
		System.out.println("Parameterized constructor");
	}

	public void method1() {
		System.out.println("method1..name: " + name);
	}

	public void method2(int number) {
		System.out.println("method2 number:" + number);
	}

	private void method3() {
		System.out.println("Private method invoked.");
	}
}

public class ReflectionTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Reflection ref = new Reflection();

		// Get the Class name and package name
		Class<? extends Reflection> cls = ref.getClass();
		System.out.println("Class name is: " + cls.getName());
		System.out.println("Package is: " + cls.getPackageName());

		// get the construtor of Reflect class
		Constructor[] constructor = cls.getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println("Construtor:" + constructor[i].getName());
		}

		System.out.println("Get public method of Reflection class:->>>>>>>");

		// Get all the method of Reflect class
		Method[] methods = cls.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}

		// invoke the method at runtime
		java.lang.reflect.Method method2 = cls.getDeclaredMethod("method2", int.class);
		method2.invoke(ref, 100);

		//Make the private field accessible from other class at runtime.
		Field field = cls.getDeclaredField("name");
		System.out.println("Field can be accessed: "+field.canAccess(ref));
		field.setAccessible(true);
		//now change the default set parameter
		field.set(ref, "JAVA Reflection API");
		
		//now invoked the method1
		java.lang.reflect.Method method1 = cls.getDeclaredMethod("method1");
		method1.invoke(ref);
		
		// invoke the private method at runtime
		java.lang.reflect.Method method3 = cls.getDeclaredMethod("method3");
		method3.setAccessible(true);
		method3.invoke(ref);
		
		
	}

}

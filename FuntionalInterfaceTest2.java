package functional.interfase;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Deepak {}


@Deepak
@FunctionalInterface
interface FuncInterface {
	void m1(String str);
}

public class FuntionalInterfaceTest2 {

	public static void main(String[] args) {
		new Thread(()-> {
			System.out.println(Thread.currentThread().getName());
		}).start();
	}
	
}

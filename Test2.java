package basic.core;

class Base {
	public void add() {
		System.out.println("Base");
	}
}

class Child extends Base {
	public void add() {
		System.out.println("Child");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Base base = new Child();
		base.add();
	}
}

package chapter12;

class A {
	int a = 1;
}
class B extends A {
	int b = 2;
}
class C extends B {
	int c = 3;
}

public class TestCasting {

	public static void main(String[] args) {
		A obj = new C();
		System.out.println("obj��ü�� �Ӽ�  a = " +obj.a);

	}

}

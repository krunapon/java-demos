package coe.java.demos.c7;

class Super {}
class Sub1 extends Super {}
class Sub2 extends Super {}
interface Interface1 {}
class C1 implements Interface1 {}
class C2 implements Interface1 {}
public class OOP1 {
	public static void method1(Super s) {
	}
	public static void method2(Interface1 i) {
		
	}
	public static void main(String[] args) {
		method1(new Sub1());
		method1(new Sub2());
		method2(new C1());
		method2(new C2());
	}

}

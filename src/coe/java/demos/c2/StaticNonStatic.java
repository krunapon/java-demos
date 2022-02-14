package coe.java.demos.c2;
public class StaticNonStatic {
	public static void main(String[] args) {
		MathHelper m = new MathHelper();
		int a = 2;
		int b = 3;
		System.out.println(MathHelper.getMax(a,b));
		System.out.println(m.getMin(a,b));
		// we can do this, but not recommended
		// we should call static method
		// in the context of static reference
		// call it with class name
		System.out.println(m.getMax(a,b));
		System.out.println(m.i);
		System.out.println(MathHelper.j);
	}

}
class MathHelper {
		// non-static variable
		int i = 4;
		// static variable
		static int j = 5;
		// static method
		public static int getMax(int i1, int i2) {
			if (i1 > i2)
				return i1;
			else
				return i2;
		}
		public int getMin(int i1, int i2) {
			if (i1 < i2)
				return i1;
			else
				return i2;
		}
}

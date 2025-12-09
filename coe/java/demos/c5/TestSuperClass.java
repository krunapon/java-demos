package coe.java.demos.c5;
class KKUStudent3 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
class COEStudent extends KKUStudent3 {
	String comSkill;
	public String getSkill() {
		return comSkill;
	}
	public void setSkill(String skill) {
		comSkill = skill;
	}
}
public class TestSuperClass {
	public static void main(String[] args) {
		COEStudent  a = new COEStudent();
		a.setName("Piti");
		System.out.println(a.getName());
		KKUStudent3 b = new KKUStudent3();
		b.setName("Chujai");
		a.setSkill("PHP");
	}

}

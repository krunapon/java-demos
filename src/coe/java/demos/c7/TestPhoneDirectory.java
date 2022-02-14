package coe.java.demos.c7;

public class TestPhoneDirectory {
	public static void findNumber(PhoneDirectory pd, String name) {
		String phone;
		if ((phone = pd.getNumber(name)) != null) 
			System.out.println("The phone number of " + name 
					+ " is " + phone);
		else
			System.out.println("The phone number of " + name 
					+ " is unknown");
	}
	public static void main(String[] args) {
		PhoneDirectory pd = new PhoneDirectory();
		pd.putNumber("Abhisit", "1111");
		pd.putNumber("Apirak", "2222");
		pd.putNumber("Korn", "3333");
		findNumber(pd, "Abhisit");
		findNumber(pd, "Apirak");
		findNumber(pd, "Thaksin");
	}
}

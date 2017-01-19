package Package;

public class Ques05 {

	public static void main(String[] args) {
		PersonalInfo myInfo = new PersonalInfo();
		myInfo.setName("Karan Kumar");
		myInfo.setAddress("3408 19st edmonton T6T0M2");
		myInfo.setAge(21);
		myInfo.setPhoneNumber("780.716.4514");
		
		System.out.println("Name= "+myInfo.getName());
		System.out.println("Address= "+myInfo.getAddress());
		System.out.println("Age= "+myInfo.getAge());
		System.out.println("PhoneNumber= "+myInfo.getPhoneNumber());
		
		
	}

}

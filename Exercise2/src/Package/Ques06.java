package Package;
import java.util.ArrayList;
public class Ques06 {
public static void main(String[] args){
	ArrayList<PhoneBookEntry>phoneBook =new ArrayList<>();
	
	PhoneBookEntry entry1 = new PhoneBookEntry();
	entry1.setName("karan Kumar");
	entry1.setPhoneNumber("780-716-4514");
	phoneBook.add(entry1);
	
	PhoneBookEntry entry2 = new PhoneBookEntry();
	entry2.setName("Sam Wu");
	entry2.setPhoneNumber("780-716-4560");
	phoneBook.add(entry2);
	
	PhoneBookEntry entry3 = new PhoneBookEntry();
	entry3.setName("Vampsee");
	entry3.setPhoneNumber("780-720-5487");
	phoneBook.add(entry3);
	
	for(PhoneBookEntry entry : phoneBook)
	{
		System.out.println(entry);
	}
}
}

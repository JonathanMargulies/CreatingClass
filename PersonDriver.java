/**
* This class instantiates variables in the Person Class and compares them
*/
public class PersonDriver {
	/**
	*The Class PersonDriver uses Class Person in Person.java
	*/
	public static void main(String [] args) {
		Person person1 = new Person("David", 17);
		Person person2 = new Person("Samuel", 19);
		
		if(!person1.equals(person2)){
			System.out.println("These two people are not the same.");
		} else {
			System.out.println("These are the same person.");
		}
		
		if(!person1.getName().equals(person2.getName())) {
			System.out.println("These people have different names.");
		} else {
			System.out.println("These people have the same names.");
		}
		
		if((int)person1.getAge()==(int)person2.getAge()) {
			System.out.println("These people have the same age.");
		} else {
			System.out.println("These people have different ages.");
		}
		
		if((int)person1.getAge()<(int)person2.getAge()) {
			System.out.println(person2.getName() + " is older than " + person1.getName());
		} else if ((int)person1.getAge()>(int)person2.getAge()) {
			System.out.println(person1.getName() + " is older than " + person2.getName());
		} else {
			System.out.println(person1.getName() + " and " + person2.getName() + " are the same age.");
		}
		
		if((int)person1.getAge()<(int)person2.getAge()) {
			System.out.println(person1.getName() + " is younger than " + person2.getName());
		} else if ((int)person1.getAge()>(int)person2.getAge()) {
			System.out.println(person2.getName() + " is younger than " + person1.getName());
		} else {
			System.out.println(person1.getName() + " and " + person2.getName() + " are the same age.");
		}

	}
}

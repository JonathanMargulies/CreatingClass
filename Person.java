public class Person {
	public String name;
	public int age;

	public Person() {
		name = "John Doe";
		age = 25;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return this.name + " " + this.age;
	}
}

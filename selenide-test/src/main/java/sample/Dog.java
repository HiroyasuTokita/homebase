package sample;

public class Dog {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	private int age;

	public Dog() {

	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void run() {
		System.out.println(name + " is running.");
	}

}

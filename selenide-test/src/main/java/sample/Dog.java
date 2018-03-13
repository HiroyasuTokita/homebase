package sample;

public class Dog {

  private String name;
  private int age;

  public Dog() {

  }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }


  public void setName(final String _name) {
    this.name = _name;

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

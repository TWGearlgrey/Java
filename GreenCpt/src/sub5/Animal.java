package sub5;

public class Animal {
	private int age;
	private String name,sex;
	
	public Animal(int age, String name, String sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public void setAge(int n) {
		age = n;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSex(String n) {
		sex = n;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
}

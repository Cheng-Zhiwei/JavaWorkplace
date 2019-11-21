package chapter05;

public class Person {
	
	private String name;
	private int age;
	private String address;
	
	//构造方法，初始化对象的属性
	public  Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//默认构造方法
	public Person() {};

	
	public void setName(String name) {
		if(name.length()<3) {
			System.out.println("Please input the name");
			return;
		} else {
			this.name = name;
		}
	}
	
	public void setAge(int age) {
		if(age>100 || age<0) {
			System.out.println("The age must be more than 0 and less than 100！");
			return;
		} else {
			this.age = age;
		}
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void display() {
		System.out.println("Name:"+name+", Age:"+age+", Address:"+address);
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.display(); //打印出默认值
		
		
		Person person2 = new Person("jack", 20, "Wasnton");
//		person2.setName("ja");
//		person2.setAddress("America");
//		person2.setAge(600);
		person2.display();

	}

	}



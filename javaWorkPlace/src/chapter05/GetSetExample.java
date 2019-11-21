package chapter05;

public class GetSetExample {
    private String password;
    private int age;
    public String getPassword() {
	return password;
    }
    public void setPassword(String password) {
	if (password.length() != 6) {
	    System.out.println("密码位数不对要求六位密码");
	    return;
	} else {
	    this.password = password;
	}
    }
    public int getAge() {
	return age;
    }
    public void setAge(int age) {
	if (age >100 || age<0) {
	    System.out.println("你的年龄输入有误，要求0~120岁");
	    return;
	} else {
	    this.age = age;
	}
    }
    
    public static void main(String[] args) {
    	GetSetExample person = new GetSetExample();
    	person.setAge(200);
    }
}

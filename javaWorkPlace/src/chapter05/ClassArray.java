package chapter05;

public class ClassArray {
	
	public static void main(String[] args) {
		
		
		//-------------------01- 动态---------------------
		//定义数组的方式，数组的每个元素都是类
		Person[] arrayPerson = new Person[3];
		
		//对每一类进行实例化和初始化
		arrayPerson[0] = new Person("jack1", 20, "Nanan");
		arrayPerson[1] = new Person("jack2", 21, "Yanan");
		arrayPerson[2] = new Person("jack3", 22, "Nanan");
		
		//-------------------02- 静态---------------------
		Person[] arrayPerson2 = new Person[] {
				 						new Person("jack1", 20, "Nanan"),
				 						new Person("jack2", 21, "Yanan"),
				 						new Person("jack3", 22, "Nanan")
		};
		
		//静态初始化的简写方式
		Person[] arrayPerson3 =  {
					new Person("jack1", 20, "Nanan"),
					new Person("jack2", 21, "Yanan"),
					new Person("jack3", 22, "Nanan")
		};
		
		//对象数组初始化之后，每一个元素都是初始化后的对象
		for(Person e: arrayPerson) {
			e.display();
		}
		
		for(Person c: arrayPerson2) {
			c.display();
		}

		for(Person m: arrayPerson3) {
			m.display();
		}

	}

}

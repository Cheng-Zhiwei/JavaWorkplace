package chapter05;

public class ClassArray {
	
	public static void main(String[] args) {
		
		
		//-------------------01- ��̬---------------------
		//��������ķ�ʽ�������ÿ��Ԫ�ض�����
		Person[] arrayPerson = new Person[3];
		
		//��ÿһ�����ʵ�����ͳ�ʼ��
		arrayPerson[0] = new Person("jack1", 20, "Nanan");
		arrayPerson[1] = new Person("jack2", 21, "Yanan");
		arrayPerson[2] = new Person("jack3", 22, "Nanan");
		
		//-------------------02- ��̬---------------------
		Person[] arrayPerson2 = new Person[] {
				 						new Person("jack1", 20, "Nanan"),
				 						new Person("jack2", 21, "Yanan"),
				 						new Person("jack3", 22, "Nanan")
		};
		
		//��̬��ʼ���ļ�д��ʽ
		Person[] arrayPerson3 =  {
					new Person("jack1", 20, "Nanan"),
					new Person("jack2", 21, "Yanan"),
					new Person("jack3", 22, "Nanan")
		};
		
		//���������ʼ��֮��ÿһ��Ԫ�ض��ǳ�ʼ����Ķ���
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

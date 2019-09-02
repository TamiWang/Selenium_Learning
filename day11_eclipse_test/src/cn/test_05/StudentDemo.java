package cn.test_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("aaa");
		s1.setAge(18);
		System.out.println(s1.getName() + "---" + s1.getAge());
		s1.show();
	}

}

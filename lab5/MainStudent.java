class MainStudent{
	String name;
	String address;
	int age;
	String university;
	int rollno;
	public void goesto()
	{
		System.out.println(name + " goes to " +university+  " age " +age+ " address " +address+ " rollno " +rollno);
	}
}
class Student{
	public static void main(String[] args) {
		MainStudent std;
		std=new MainStudent();
		std.name="shumaila";
		std.address="kotri";
		std.age=18;
		std.university="mehran university";
		std.rollno=78;
		std.goesto();
	}
}
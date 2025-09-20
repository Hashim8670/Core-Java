package Polymorphism;

class Student{
	void studentid(String name, int rollno) {
		System.out.println("Student Name : "+name+"\n"+"Student Roll no : "+rollno);
	}
	void studentid(int rollno,String name) {
		System.out.println("Student Roll no : "+rollno+"\n"+"Student Name : "+name);
	}
} 
public class OverLoading {
    public static void main(String[] args) {
		Student s = new Student();
		s.studentid("Hashim Ansari",12);
	    s.studentid(12, "Hashim Ansari");
    }
}
 
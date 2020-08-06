package grade_management_system;

public class Student {
	private int _grade;
	private String _studentNumber;
	private String _name;
	
	//explicit constructor of super class
	public Student(){
	}

	//parameterized constructor
	public Student(String name, String studentNumber, int grade) {
		this._name = name;
		this._studentNumber = studentNumber;
		this._grade = grade;
	}

	public int getGrade() {
		return this._grade;
	}

	public void setGrade(int grade) {
		this._grade = grade;
	}

	public String getStudentNumber() {
		return this._studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this._studentNumber = studentNumber;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}

}

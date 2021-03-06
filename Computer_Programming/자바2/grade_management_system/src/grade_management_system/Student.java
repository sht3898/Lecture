package grade_management_system;

public class Student {
	private int _grade;
	private int _studentNumber;
	private String _name;
	private double score;
	private RuleOfAbsoluteEvaluation re;
	//explicit constructor of super class
	public Student(){
		re = new RuleOfAbsoluteEvaluation();
	}

	//parameterized constructor
	public Student(String name, int studentNumber, int grade) {
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

	public int getStudentNumber() {
		return this._studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this._studentNumber = studentNumber;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setRe(RuleOfAbsoluteEvaluation re) {
		this.re = re;
	}

	public RuleOfAbsoluteEvaluation getRe() {
		return re;
	}
	
}

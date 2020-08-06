package grade_management_system;

public class RuleOfAbsoluteEvaluation implements Evaluatable,Printable{
	private double _scoreOfExam;
	private double _scoreOfSecondExam;
	private String _gradeOfAttendance;
	private double _average;
	private String _gradeOfClass;
	private double _scoreOfAttendance;
	private int _gradeOfTermProject;
	int _studentInput[] = new int[5];
	
	public void setInput(double scoreOfExam, String gradeOfAttendance){
		this._scoreOfExam=scoreOfExam;
		this._gradeOfAttendance=gradeOfAttendance;
	}
	
	public double getScoreOfExam() {
		return this._scoreOfExam;
	}

	public void setScoreOfExam(int scoreOfExam) {
		if(scoreOfExam>100||scoreOfExam<0){
			System.out.println("입력값이 바르지 않습니다.");}
		else{		
		this._scoreOfExam = scoreOfExam;}
	}
	public void setScoreOfSecondExam(int scoreOfSecondExam) {
		if(scoreOfSecondExam>100||scoreOfSecondExam<0){
			System.out.println("입력값이 바르지 않습니다.");}
		else{		
		this._scoreOfSecondExam = scoreOfSecondExam;}
	}

	public int getGradeOfTermProject() {
		return this._gradeOfTermProject;
	}

	public void setGradeOfTermProject(int gradeOfTermProject) {
		
		if(gradeOfTermProject<=10||gradeOfTermProject>=0)
			this._gradeOfTermProject = gradeOfTermProject;
		else
			System.out.println("텀 프로젝트 입력이 바르지 않습니다.");
	}

	public String getGradeOfAttendance() {
		return this._gradeOfAttendance;
	}

	public void setGradeOfAttendance(String gradeOfAttendance) {
		this._gradeOfAttendance = gradeOfAttendance;
	}	

	public void evaluateOfExam(int scoreOfExam) {

	}

	public void evaluateOfFinalTerm(int scoreOfFinalTerm) {

	}
	
	public void SetOfAttendance(int TimesOfAttendance){
		if(TimesOfAttendance>=32)			_scoreOfAttendance=10;
		else if(TimesOfAttendance>=30&&TimesOfAttendance<32)			_scoreOfAttendance=9;
		else if(TimesOfAttendance>=28&&TimesOfAttendance<30)			_scoreOfAttendance=8;
		else if(TimesOfAttendance>=26&&TimesOfAttendance<28)			_scoreOfAttendance=7;
		else if(TimesOfAttendance>=24&&TimesOfAttendance<26)			_scoreOfAttendance=6;
		else if(TimesOfAttendance>=22&&TimesOfAttendance<24)			_scoreOfAttendance=5;
		else if(TimesOfAttendance>=20&&TimesOfAttendance<22)			_scoreOfAttendance=4;
		else			_scoreOfAttendance=0;
	}
	public double getScoreOfAttendance(){
		return _scoreOfAttendance;
	}
	
	public void SetAverage(){
		_average = 0.4*_scoreOfExam+0.4*_scoreOfSecondExam+_scoreOfAttendance+_gradeOfTermProject;
	}
	
	public double getAverage(){
		return _average;
	}

	public String getGradeOfSemester() {
		if(_scoreOfAttendance!=0){
		if(_average>=95&&_average<=100)			_gradeOfClass="A+";
		else if(_average>=90&&_average<95)			_gradeOfClass="A0";
		else if(_average>=85&&_average<90)			_gradeOfClass="B+";
		else if(_average>=80&&_average<85)			_gradeOfClass="B0";
		else if(_average>=75&&_average<80)			_gradeOfClass="C+";
		else if(_average>=70&&_average<75)			_gradeOfClass="C0";
		else if(_average>=65&&_average<70)			_gradeOfClass="D+";
		else if(_average>=60&&_average<65)			_gradeOfClass="D0";
		else			_gradeOfClass="F";
		return _gradeOfClass;
		}
		else return _gradeOfClass="F";
	}
	public void printRun(Student s){
		
		System.out.println("이름: "+s.getName());
		System.out.println("학번: "+s.getStudentNumber());
		System.out.println("시험 점수: "+this.getScoreOfExam());
		System.out.println("텀 프로젝트 점수: "+this.getGradeOfTermProject());
		System.out.println("출결 점수: "+this.getScoreOfAttendance());
		this.SetAverage();	System.out.println("환산 점수: "+this.getAverage());
		System.out.println("학점: "+this.getGradeOfSemester());
	}
	
}


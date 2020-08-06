package grade_management_system;

public class RuleOfAbsoluteEvaluation extends Student implements Evaluatable{
	private double _scoreOfExam;
	private String _gradeOfTermProject;
	private String _gradeOfAttendance;
	private double _totalScore;
	private double _average;
	private String _gradeOfClass;
	private double _scoreOfAttendance;
	private int _TimesOfAttendance;

	int _studentInput[] = new int[5];//배열
	
	
	public void setTimesOfAttendance(int ti){
		_TimesOfAttendance=ti;
	}

	public void setInput(double scoreOfExam, String gradeOfTermProject, String gradeOfAttendance){
		this._scoreOfExam=scoreOfExam;
		this._gradeOfTermProject=gradeOfTermProject;
		this._gradeOfAttendance=gradeOfAttendance;
	}
	
	public double getScoreOfExam() {
		return this._scoreOfExam;
	}

	public void setScoreOfExam(int scoreOfExam) {
		if(scoreOfExam>100){
			System.out.println("입력값이 바르지 않습니다.");}
		else{		
		this._scoreOfExam = scoreOfExam;}
	}

	public String getGradeOfTermProject() {
		return this._gradeOfTermProject;
	}

	public void setGradeOfTermProject(String gradeOfTermProject) {
		this._gradeOfTermProject = gradeOfTermProject;
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
	
	public String evaluateOfTermProject(int scoreOfTermProject){
//		int gradeOfTermProject=0; 필요없을것 같습니다
		if(scoreOfTermProject==10)
			_gradeOfTermProject="A+";
		else if(scoreOfTermProject<10&&scoreOfTermProject>=9)
			_gradeOfTermProject="A0";
		else if(scoreOfTermProject<9&&scoreOfTermProject>=8)
			_gradeOfTermProject="B+";
		else if(scoreOfTermProject<8&&scoreOfTermProject>=7)
			_gradeOfTermProject="B0";
		else if(scoreOfTermProject<7&&scoreOfTermProject>=6)
			_gradeOfTermProject="C+";
		else if(scoreOfTermProject<6&&scoreOfTermProject>=5)
			_gradeOfTermProject="C0";
		else if(scoreOfTermProject<5&&scoreOfTermProject>=4)
			_gradeOfTermProject="D+";
		else if(scoreOfTermProject<4&&scoreOfTermProject>=3)
			_gradeOfTermProject="D0";
		else
			_gradeOfTermProject="F";		
		return _gradeOfTermProject;
	}
	
	public String evaluateOfAttendance(int TimesOfAttendance){
//		int gradeOfTermProject=0; 이것도 필요없는듯!
		if(TimesOfAttendance>=32){
			_gradeOfAttendance="A+";}
		else if(TimesOfAttendance>=30&&TimesOfAttendance<32){
			_gradeOfAttendance="A0";_scoreOfAttendance=10;}
		else if(TimesOfAttendance>=28&&TimesOfAttendance<30){
			_gradeOfAttendance="B+";_scoreOfAttendance=9;}
		else if(TimesOfAttendance>=26&&TimesOfAttendance<28){
			_gradeOfAttendance="B0";_scoreOfAttendance=8;}
		else if(TimesOfAttendance>=24&&TimesOfAttendance<26){
			_gradeOfAttendance="C+";_scoreOfAttendance=7;}
		else if(TimesOfAttendance>=22&&TimesOfAttendance<24){
			_gradeOfAttendance="C0";_scoreOfAttendance=6;}
		else if(TimesOfAttendance>=20&&TimesOfAttendance<22){
			_gradeOfAttendance="D+";_scoreOfAttendance=5;}
		else{
			_gradeOfAttendance="F";_scoreOfAttendance=0;}
		return _gradeOfAttendance;
		//출결 총점 10점만점으로 산출했습니다.
	}
	public double getScoreOfAttendance(){
		return _scoreOfAttendance;
	}
	public double getTotalScore(){
		 _totalScore=0;
		for(int i=0;i<_studentInput.length;i++)
			_totalScore += _studentInput[i];
		return _totalScore;
	}
	
	public void calculateAverage(int scoreOfTermProject){
		_average = 0.8*_scoreOfExam+_scoreOfAttendance+scoreOfTermProject;
	}
	
	public double getAverage(){
		return _average;
	}

	public String gradeOfSemester() {
		if(_totalScore>=95&&_totalScore<=100)
			_gradeOfClass="A+";
		else if(_totalScore>=90&&_totalScore<95)
			_gradeOfClass="A0";
		else if(_totalScore>=85&&_totalScore<90)
			_gradeOfClass="B+";
		else if(_totalScore>=80&&_totalScore<85)
			_gradeOfClass="B0";
		else if(_totalScore>=75&&_totalScore<80)
			_gradeOfClass="C+";
		else if(_totalScore>=70&&_totalScore<75)
			_gradeOfClass="C0";
		else if(_totalScore>=65&&_totalScore<70)
			_gradeOfClass="D+";
		else if(_totalScore>=60&&_totalScore<65)
			_gradeOfClass="D0";
		else
			_gradeOfClass="F";
		return _gradeOfClass;
	}

}
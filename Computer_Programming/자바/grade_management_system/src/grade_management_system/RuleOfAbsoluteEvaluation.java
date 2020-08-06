package grade_management_system;

public class RuleOfAbsoluteEvaluation extends Student implements Evaluatable{
	private int _scoreOfExam;
	private String _gradeOfTermProject;
	private String _gradeOfAttendance;
	private int _totalScore;
	private double _average;
	private String _gradeOfClass;

	private int _studentInput[] = new int[5];

	public void setInput(int scoreOfExam, String gradeOfTermProject, String gradeOfAttendance){
		this._scoreOfExam=scoreOfExam;
		this._gradeOfTermProject=gradeOfTermProject;
		this._gradeOfAttendance=gradeOfAttendance;
	}
	
	public int getScoreOfExam() {
		return this._scoreOfExam;
	}

	public void setScoreOfExam(int scoreOfExam) {
		this._scoreOfExam = scoreOfExam;
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
		int gradeOfTermProject=0;
		
		
		return this._gradeOfTermProject=gradeOfTermProject;
	}
	
	public String evaluateOfAttendance(int scoreOfTermProject){
		int gradeOfTermProject=0;
		
		
		return this._gradeOfAttendance=gradeOfAttendance;
	}

}
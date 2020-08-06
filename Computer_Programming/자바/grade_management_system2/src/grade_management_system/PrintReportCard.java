package grade_management_system;

public class PrintReportCard extends RuleOfAbsoluteEvaluation implements Printable{
	public void printRun(){
		System.out.println("이름: "+this.getName());
		System.out.println("학번: "+this.getStudentNumber());
		System.out.println("시험 점수: "+this.getScoreOfExam());
		System.out.println("텀 프로젝트 점수: "+this.getGradeOfTermProject());
		System.out.println("출결 점수: "+this.getScoreOfAttendance());
		System.out.println("총점: "+this.getTotalScore());
		System.out.println("평균: "+this.getAverage());
		System.out.println("학점: "+this.gradeOfSemester());
	}
	
}

package grade_management_system;

public class PrintReportCard extends RuleOfAbsoluteEvaluation implements Printable{
	public void printRun(){
		System.out.println("�̸�: "+this.getName());
		System.out.println("�й�: "+this.getStudentNumber());
		System.out.println("���� ����: "+this.getScoreOfExam());
		System.out.println("�� ������Ʈ ����: "+this.getGradeOfTermProject());
		System.out.println("��� ����: "+this.getScoreOfAttendance());
		System.out.println("����: "+this.getTotalScore());
		System.out.println("���: "+this.getAverage());
		System.out.println("����: "+this.gradeOfSemester());
	}
	
}

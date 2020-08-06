public class Date {
	int year, month, day;
	String m;
	public void printEastern(){
		System.out.print(year+"."+month+"."+day);
	}
	public void printWestern(){
		switch(month){
		case 1:
			System.out.print("January "+day+","+year);
			break;
		case 2:
			System.out.print("February "+day+","+year);
			break;
		case 3:
			System.out.print("March "+day+","+year);
			break;
		case 4:
			System.out.print("April "+day+","+year);
			break;
		case 5:
			System.out.print("May "+day+","+year);
			break;
		case 6:
			System.out.print("June "+day+","+year);
			break;
		case 7:
			System.out.print("July "+day+","+year);
			break;
		case 8:
			System.out.print("August "+day+","+year);
			break;
		case 9:
			System.out.print("September "+day+","+year);
			break;
		case 10:
			System.out.print("October "+day+","+year);
			break;
		case 11:
			System.out.print("November "+day+","+year);
			break;
		case 12:
			System.out.print("December "+day+","+year);
			break;
	
		}
	}

}

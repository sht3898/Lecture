import java.util.Scanner;
public class year {

   public static void main(String[] args) {
      
      int year, month, day, totalday=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("연도 입력 : ");
      year = sc.nextInt();
      System.out.print("월 입력 : ");
      month = sc.nextInt();
      System.out.print("일 입력 : ");
      day = sc.nextInt();
      
      totalday += (year -1900)*365;
      totalday += (year-1900)/4;
      
      if((year%4==0)&&(year%100!=0)||(year%400==0)){
         if((month==1)||(month==2))
            totalday = totalday -1;
      }
      
      for(int i=1;i<=month;i++){
         if(i==2 || i==4 || i==6 ||i==8||i==9|| i==11)
            totalday+=31;
         else if (i==3) totalday += 28;
         else if(i==3||i==5||i==7||i==10) totalday +=30;
         
      }
      totalday+=day;
         
      switch(totalday%7){
      case 0:
         System.out.println("일요일"); break;
      case 1:
         System.out.println("월요일"); break;
      case 2:
         System.out.println("화요일"); break;
      case 3:
         System.out.println("수요일"); break;
      case 4:
         System.out.println("목요일"); break;
      case 5:
         System.out.println("금요일"); break;
      case 6:
         System.out.println("토요일"); break;
      default:
         System.out.println("오류"); break;
      }
      
      
   }
}
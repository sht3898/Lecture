import java.util.Scanner;
public class year {

   public static void main(String[] args) {
      
      int year, month, day, totalday=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("���� �Է� : ");
      year = sc.nextInt();
      System.out.print("�� �Է� : ");
      month = sc.nextInt();
      System.out.print("�� �Է� : ");
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
         System.out.println("�Ͽ���"); break;
      case 1:
         System.out.println("������"); break;
      case 2:
         System.out.println("ȭ����"); break;
      case 3:
         System.out.println("������"); break;
      case 4:
         System.out.println("�����"); break;
      case 5:
         System.out.println("�ݿ���"); break;
      case 6:
         System.out.println("�����"); break;
      default:
         System.out.println("����"); break;
      }
      
      
   }
}
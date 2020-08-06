import java.util.Scanner;

public class TestMovie {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Scanner input = new Scanner(System.in);
		
		System.out.print("영화제목 입력: ");
		movie1.title = input.nextLine();
		System.out.print("영화감독 입력: ");
		movie1.director = input.nextLine();
		System.out.print("영화개봉년도 입력: ");
		movie1.year = input.nextInt();
		System.out.print("영화평점 입력: ");
		movie1.rating = input.nextDouble();
		
		System.out.println("=========================");
		movie1.print();
	}
}

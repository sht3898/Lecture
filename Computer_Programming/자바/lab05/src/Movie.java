
public class Movie {

	// 제목 String
	// 평점 double
	// 감독 String
	// 개봉년도 int
	String title;
	double rating;
	String director;
	int year;

	/**
	 * print method 입력한 제목, 평점, 감독, 개봉년도 출력하는 함수.
	 */
	public void print() {
		System.out.println(
				"영화의 제목:  " + title + "\n영화의 평점:  " + rating + "점\n영화의 감독: " + director + "\n영화 개봉년도: " + year);
	}

}

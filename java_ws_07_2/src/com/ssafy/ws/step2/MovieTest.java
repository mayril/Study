package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {
		Movie m = new Movie(0, "기생충", "봉준호", "스릴러", 131);
		Movie m2 = new Movie(1, "이터널스", "클로이 자오", "액션", 156);
		Movie m3 = new Movie(4, "트랜스포터", "원규" , "액션" , 92);
		SeriesMovie sm = new SeriesMovie(2, "해리포터", "크리스 콜럼버스", "판타지", 152, 1, "마법사의 돌" );
		SeriesMovie sm2 = new SeriesMovie(3, "해리포터", "크리스 콜럼버스", "판타지", 162, 2, "비밀의 방" );
		
		IMovieManager mm = MovieManagerImpl.getInstance();
		mm.add(m);
		mm.add(m2);
		mm.add(m3);
		mm.add(sm);
		mm.add(sm2);
		System.out.println("===========일반영화 리스트만 받아와서 출력===========");
		Movie[] movieList = mm.getMovies();
		for(int i=0; i<movieList.length; i++) {
			System.out.println(movieList[i].toString());
		}
		
		System.out.println("===========시리즈영화 리스트만 받아와서 출력===========");
		SeriesMovie[] seriesMovieList = mm.getSeriesMovies();
		for(int i=0; i<seriesMovieList.length; i++) {
			System.out.println(seriesMovieList[i].toString());
		}
		
		
		System.out.println("===========포터 라는 단어를 포함한 영화리스트 찾아서 반환===========");
		for(Movie movie : mm.searchByTitle("포터")) {
			System.out.println(movie.toString());
		}
		
		System.out.println("===========전체 영화 상영 시간 평균 구해서 출력==========");
		System.out.println(mm.getRunningTimeAvg() + "분");
	}

}
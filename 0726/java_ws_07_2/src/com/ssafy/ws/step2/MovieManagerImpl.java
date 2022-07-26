package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {
	
	/**
	 * 관리할 최대 영화 수
	 */
	private static int MAX_SIZE = 100;
	
	/**
	 * 관리한 영화 리스트
	 */
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	/**
	 * 현재 등록된 영화 수
	 */
	private int size = 0;
	
	/**
	 * 싱글톤 디자인패턴을 위해 유지하는 객체 참조
	 * 클래스가 메모리에 로드될 때 객체를 1번만 생성하여 참조을 유지한다.
	 */
	private static IMovieManager instance = new MovieManagerImpl();
	
	/**
	 * 기본 생성자
	 */
	private MovieManagerImpl() {
		// 외부에서 객체생성을 하지 못하도록 생성자를 private 제어자로 선언
	}
	
	/**
	 * 내부에서 생성한 객체의 참조를 반환한다.
	 * @return 생성된 객체의 참조
	 */
	public static IMovieManager getInstance() {
		return instance;
	}
	
	/**
	 * 영화를 영화리스트에 추가한다.
	 * @param movie : 추가할 영화 정보
	 */
	public void add(Movie m) {
		if (size < MAX_SIZE) {
			movieList[size] = m;
			size++;
		} else {
			System.out.println(MAX_SIZE + " 이상 저장할 수 없습니다.");	
		}
	}
	
	/**
	 * 등록된 영화리스트를 반환한다.
	 * @return 등록된 전체 영화리스트
	 */
	public Movie[] getList() {
		return Arrays.copyOfRange(movieList, 0, size);
	}

	/**
	 * 등록된 영화중에 일반영화만 반환한다.
	 * @return 등록된 전체 일반 영화리스트
	 */
	public Movie[] getMovies() {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (!(movieList[i] instanceof SeriesMovie))
				count++;
		}
		Movie[] result = new Movie[count];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				result[idx] = movieList[i];
				idx++;
			}
		}
		return result;
	}

	/**
	 * 등록된 영화중에 시리즈영화만 반환한다.
	 * @return 등록된 전체 시리즈 영화리스트
	 */
	public SeriesMovie[] getSeriesMovies() {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i] instanceof SeriesMovie)
				count++;
		}
		SeriesMovie[] result = new SeriesMovie[count];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				result[idx] = (SeriesMovie) movieList[i];
				idx++;
			}
		}
		return result;
	}

	/**
	 * 도서 제목을 포함하고 있는 영화 리스트를 반환한다.
	 * @param title : 조회할 영화의 제목
	 * @return 제목을 포함한 영화리스트
	 */
	public Movie[] searchByTitle(String title) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				count++;
			}
		}
		Movie[] result = new Movie[count];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				result[idx] = movieList[i];
				idx++;
			}
		}

		return result;
	}

	/**
	 * 영화 상영시간의 평균을 반환한다.
	 * @return 모든 영화 상영시간의 평균
	 */
	public double getRunningTimeAvg() {
		int total = 0;
		for (int i = 0; i < size; i++) {
			total += movieList[i].getRunningTime();
		}
		return (double) total / size;
	}

}

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		
		//www.naver.com으로 가기
//		driver.get("http://www.naver.com");
//		#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(2) > a

		//뉴스를 찾아서 클릭하기
//		WebElement newsBtn = driver.findElement(By.cssSelector("#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(2) > a"));
//		newsBtn.click();
		
		//네이버 쇼핑페이지로 가기
		driver.get("https://shopping.naver.com/home/p/index.naver");
		WebElement inputSearch = driver.findElement(By.cssSelector("div._gnbSearch_search_area_3LAyd > form > fieldset > div > input"));
		System.out.print("검색할 상품 : ");
		String keyword = sc.next();
		inputSearch.sendKeys(keyword);
		inputSearch.sendKeys(Keys.ENTER);
	}
}




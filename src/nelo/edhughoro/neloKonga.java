package nelo.edhughoro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class neloKonga {
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate(). to("https://www.konga.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("konga.com"))
		System.out.println("Title Matches");
		else
			System.out.println("title");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/a[1]")).click();
		String tagname = " ";
		tagname = driver.findElement(By.cssSelector("#app-content-wrapper > div.e5dc4_DR8xw > nav > div._46ff9_Nvz9p._716d0_1mCht > div > a:nth-child(1)")).getText();
		System.out.println(tagname);
		
		WebElement AllCategories = driver.findElement(By.cssSelector("#app-content-wrapper > div.e5dc4_DR8xw > nav > div._46ff9_Nvz9p._716d0_1mCht > div > a:nth-child(1)"));
		AllCategories.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(AllCategories).perform();
		Thread.sleep(2000);
		WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/div[1]/div/div/div[1]/ul/li[3]"));
		action.moveToElement(Electronics);
		action.click();
		action.perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("DVD Players")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[2]/section/div/section/div[3]/div[2]/ul/li[1]/a/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section[2]/section/ul/li[1]/div/div/div[2]/form/div[4]/button")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
		
			

	}

}

package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://epp.solar/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
		
		WebElement balkon= driver.findElement(By.xpath("//li[@id='menu-item-55019162']//span[@class='nav-link-text'][normalize-space()='Balkonkraftwerk mit Speicher']"));
		Actions action=new Actions(driver);
		action.moveToElement(balkon).perform();
		System.out.println("hi");
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='e-con-inner']//*[@data-id='b03dcf3']"))).click().perform();
		
		
		
	}
	

}

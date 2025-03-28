package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//select[@id='country']"));
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();
		Select select= new Select(ele);
		select.selectByVisibleText("France");
		
		WebElement drag=driver.findElement(	By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		System.out.print("hi");

		actions.scrollToElement(drag).perform();
		System.out.print("hi");
		actions.dragAndDrop(drag,drop).perform();
		String str=drop.getText();
		System.out.print(str.equals("Dropped!"));
		
		
	}

}

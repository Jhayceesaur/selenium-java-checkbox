import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxAndGetSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Handling checkbox and get size
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //check if checbox is clicked (false result)
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); //checkbox was now clicked thru this code
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //check if checbox is clicked (true result)
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //check size of checkbox based on type with 'checkbox' value which is the same on all checkbox element
	}
}

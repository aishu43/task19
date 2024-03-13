package task19guvi;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.guvi.in/register");
driver.findElement(By.id("name")).sendKeys("name");	
driver.findElement(By.cssSelector("//input[@type=\"email\"]")).sendKeys("aishukaif43@gmail.com");
driver.findElement(By.className("//input[@class=\"form-control countrycode-left\"]")).sendKeys("97890654");
driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("43adr@c");
driver.findElement(By.tagName("input")).sendKeys("ais");
	}

}

package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmiCalculator {
	
	@Test
	public void emi()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		
		String title=driver.findElement(By.xpath("//*[name()='path' and @class='highcharts-point highcharts-color-0']"))
				.getText();
		System.out.println(title);
	}

}

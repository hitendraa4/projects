package user;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Kayak {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='vvTc-item-button']")).click();
		driver.findElement(By.xpath("//input[@class='k_my-input' and @placeholder='From?']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//span[.='Bengaluru, Karnataka, India']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Saturday 15 July, 2023']")).click();
		driver.findElement(By.xpath("//span[@aria-label='End date calendar input' and @role='button']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Monday 17 July, 2023']")).click();
		driver.findElement(By.xpath("//button[@class='Iqt3 Iqt3-mod-bold Button-No-Standard-Style Iqt3-mod-variant-solid Iqt3-mod-theme-progress Iqt3-mod-shape-rounded-medium Iqt3-mod-shape-mod-default Iqt3-mod-spacing-default Iqt3-mod-size-large Iqt3-mod-animation-search' and @type='submit']")).click();
		
		
		Thread.sleep(5000);
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs.size());
		String wh = driver.getWindowHandle();
		System.out.println("parent window handle:"+wh);
		
		Iterator<String> a=whs.iterator();
		String x = a.next();
		String y = a.next();
		System.out.println(y);
		
		
			
			driver.switchTo().window(y);
			
				driver.findElement(By.xpath("//div[@class='NITa NITa-travelersCabin NITa-hide-below-m NITa-hasValue']")).click();
				driver.findElement(By.xpath("//span[.='Adults']/../../child::div[@class='bCGf bCGf-mod-theme-default']/button[@class='bCGf-mod-theme-default']")).click();
				driver.findElement(By.xpath("//span[.='Update']")).click();
				
String pri = driver.findElement(By.xpath("//div[@class='ZGc- ZGc--mod-theme-default ZGc--mod-variant-action ZGc--mod-layout-inline ZGc--mod-padding-default ZGc--mod-size-default ZGc--mod-bold-text ZGc--mod-nowrap']/../../../../../div[@class='nrc6-price-section']/child::div[@class='Oihj']/descendant::div[@class='f8F1-price-text']")).getText();
	System.out.println(pri);   
	
	
	String price =pri.substring(2);
	System.out.println(price);
	
	String price1 = price.replace(",", "");
	

                             
	
	   int in = Integer.parseInt(price1);
	   System.out.println(in);
	   
	   if(in<20000)
	   {
		   System.out.println("passed :tilak you are pass to book the flight");
	   }
	   else
	   {
		   Assert.fail();
	   }
	  
	
	}
		
		
		
		
		

	

}

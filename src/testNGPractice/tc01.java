package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class tc01 {
		WebDriver opendriver;
		long starttiming ;
		long closetiming;
	
	@BeforeSuite
	public void openbrowser() {
	    starttiming =	System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		opendriver = new ChromeDriver();
			}
	
	

	@Test
	public void opengoogle() {	    
			opendriver.get("https://google.com/");
	}
	@Test
	public void openlocalfile() {	    
			opendriver.get("file:///C:/Users/Suki/Desktop/Firstproject.html");
	}
	@Test
	public void openlocalik() {	    
			opendriver.get("https://uplevel.interviewkickstart.com/resource/rc-instruction-972970-1911674-1032-6285");
	}
	
	
	@AfterSuite
     public void calculateexecutiontime()	{
		opendriver.quit();
	 closetiming = System.currentTimeMillis();
		long executiontime = ((closetiming-starttiming)/1000);
		System.out.println("Execution Time in:"+ executiontime + "Sec");
		
	}
	
	
	}

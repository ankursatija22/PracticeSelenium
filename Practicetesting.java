package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.Assert;

import net.sf.saxon.value.SecondsDurationValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


		 
//		 FirefoxDriver driver=new FirefoxDriver();
//		 System.out.println("driver"+driver);
//		 driver.get("https://www.naukri.com/");
//			
//			
//			Set<String> windowids = driver.getWindowHandles();
//			Iterator<String> iter= windowids.iterator();
//			System.out.println(iter);
//			String mainWindowId=iter.next();
//			 String firstchildWindowId=iter.next();
//			 String secondchildWindowId=iter.next();
//			 String thirdchildWindowId=iter.next();
//			// String fourthchildWindowId=iter.next();
//			 
//			 System.out.println(mainWindowId);
//			 System.out.println(firstchildWindowId);
//			 System.out.println(secondchildWindowId);
//			 System.out.println(thirdchildWindowId);
//			// System.out.println(fourthchildWindowId);
//			String k= driver.switchTo().window(secondchildWindowId).getTitle();
//			 System.out.println(k);
//			 driver.close();
//			 driver.switchTo().window(mainWindowId);
//			 driver.close();
//			 Thread.sleep(5000L);
//			 driver.quit();
//		String text="hello its (140)";
//		String temp[]=text.split("\\(");
//		System.out.println(temp[0]);
//		System.out.println(temp[1]);
//		String[] te=temp[1].split("\\)");
//		System.out.println(te[0]);

			
	
	
	public class Practicetesting 
	{
		
		WebDriver driver=null;
		
		ArrayList<String> al=new ArrayList<String>();
		
		@Parameters({"browser"})
		@Test
		public void openBrowser(String browser) throws Exception {
			try {
				if (browser.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"D:\\QATools\\practice\\BrowserExecutable\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							"D:\\QATools\\practice\\BrowserExecutable\\IEDriverServer.exe");
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					// this line of code is to resolve protected mode issue capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					driver = new InternetExplorerDriver(capabilities);
					//driver = new InternetExplorerDriver();
				}
				
				driver.get("https://www.google.co.in/?gfe_rd=cr&ei=u4rTWKigGYPW8AeQzov4BA&gws_rd=ssl");
				Thread.sleep(4000);
				System.out.println("aaa");
				System.out.println(driver.getTitle());
				//driver.findElement(By.className("gb_P")).click();
				Thread.sleep(4000);
			
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());
			}
		}
		
//		@Test
//		public void startTest()
//		{
//			 driver=new FirefoxDriver();
//			try{
//			driver.get("https://www.google.co.in/?gfe_rd=cr&ei=roDGWMryFe_x8AePipLoCA&gws_rd=ssl");
//			driver.findElement(By.className("gb_")).click();
//			   List<WebElement> links=driver.findElements(By.tagName("add"));
//		        System.out.println("no of links:" +links.size());
//
//		        for(int i=0;i<links.size();i++)
//		        {
//		        	
//		        	
//		            if(!(links.get(i).getText().isEmpty()))
//		            {
//		            	System.out.println(links.get(i).getAttribute("href"));
//		            links.get(i).click();
//		            driver.navigate().back();
//		            links=driver.findElements(By.tagName("dda"));
//		            }       
//		        }
//			}
//			catch(Exception e){
//				System.out.println(e.getMessage());
//				System.out.println("ccccccccccccccccElement not found.....");
//				Assert.fail("element not found");
//			}
//			
//		}
		
//		@Test
//		public void writing() throws Exception
//		{
//			driver=new FirefoxDriver();
//			driver.get("https://www.google.co.in/?gfe_rd=cr&ei=u4rTWKigGYPW8AeQzov4BA&gws_rd=ssl");
//			Thread.sleep(4000L);
//			System.out.println(driver.findElement(By.xpath(".//*[@id='menu-item-19462']/a")).getText());
//			WebElement ab=driver.findElement(By.id("menu-category-menu"));
//			List<WebElement> links=ab.findElements(By.tagName("a"));
//			 Actions action = new Actions(driver);
//			 action.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-top-navigation']/li[1]/a"))).build().perform();
//			System.out.println(links.size());
//			for(int i=0;i<links.size();i++) {
//				System.out.println(links.get(i).getText());
				//al.add(links.get(i).getText());
			}
//			Iterator<String> aa=al.iterator();
//			while(aa.hasNext()){
//				Object element = aa.next();
//				System.out.println(element+" ");
//				
//			}
//		}
		
//	    @Test
//	    public void simpleTest() throws Exception {
//	    	Thread.sleep(6000);
//	       driver.findElement(By.id("username")).sendKeys("asatija@svam.com");
//	       driver.findElement(By.id("password")).sendKeys("ankursatija");
//	       driver.findElement(By.id("login")).click();
//	       Thread.sleep(4000L);
//	    }
	    
//	    @Test
//	    public void simpleTesting() throws Exception {
//	    	
//	    	
//	    	Thread.sleep(4000L);
//	    	driver.findElement(By.id("username")).sendKeys("asatija@svam.com");
//		       driver.findElement(By.id("password")).sendKeys("ankursatija");
//		       driver.findElement(By.id("login")).click();
//		       Thread.sleep(4000L);
//	    	driver.findElement(By.id("create_link")).click();
//	    	Thread.sleep(3000L);
////	        System.out.println("Simple Test Methodssssssssssssssssssssssss."+ result.getStartMillis());
////	        System.out.println("Simple Test Methodssssssssssssssssssssssss."+ result.getTestName());
//	    	
//	    }
//	    @AfterMethod
//	    public void shut()
//	    {
//	    	driver.close();
//	    }
////	
//	 
//	
//	    @Factory
//	    public Object[] factoryMethod() {
//	        return new Object[] { new Practicetesting(), new Practicetesting() };
//	    }
//	    
//	}
	
//		@Factory
//	      public Object[] createTest() {
//	            Object[] res = new Object[5];
//	            res[0] = new FactoryImplTestAdd();
//	            res[1] = new FactoryImplTestAdd();
//	            res[2] = new FactoryImplTestAdd();
//	            res[3] = new FactoryImplTestSubtract();
//	            res[4] = new FactoryImplTestSubtract();
//	            return res;
//	      }
		
//		@Test(dataProvider="getData")
//		public void printData(String user,String userr)
//		{
//			System.out.println(user +" " + userr);
//		}
//		
//		
//		
//		@DataProvider
//		public Object[][] getData()
//		{
//			Object[][] data =new Object[2][2];
//			data[0][0]="ank";
//			data[0][1]="ankk";
//			
//			data[1][0]="ank1";
//			data[1][1]="ankk1";
//			return data;
//					
//		}
	
	
	



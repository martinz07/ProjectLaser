package org.WebDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmart\\eclipse-workspace\\org.WebDriver\\target\\Driver\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkq080hBLj_HOrNRcDY1ko7OT9LT0bglYMbV8_6ch8bOmxlKHGiR31NxoCXawQAvD_BwE&gclsrc=aw.ds");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[contains(text(),'experienced')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Upload Resume')]")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("\"D:\\martin.exe\"");
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		String URL = ("https://www.facebook.com/");
//		driver.navigate().to(URL);
//		driver.manage().window().maximize();
//		
//		
//		WebElement user = driver.findElement(By.id("email"));
//		WebElement element2 = driver.findElement(By.id("pass"));
//		WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
//		WebElement element = driver.findElement(By.xpath("//a[@title='Check out Facebook games.']"));
//		WebElement element4 = driver.findElement(By.xpath("//i[@class=\"x1b0d499 x1d69dk1\"]"));
//        
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','martin')", user,element2,element3);
//		js.executeScript("arguments[1].setAttribute('value','stanly')", user,element2,element3);
//		js.executeScript("arguments[1].setAttribute('style','background:yellow')", user,element2,element3);
//        
//		js.executeScript("arguments[0].click().scrollIntoView(true)", element);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> table = driver.findElements(By.tagName("table"));
//		for (int i = 0; i < table.size() ; i++) {
//			WebElement ttable = table.get(i);
//			WebElement tbody = ttable.findElement(By.tagName("tbody"));
//			List<WebElement> trows = tbody.findElements(By.tagName("tr"));
//			for (int j = 0; j < trows.size(); j++) {
//				WebElement rows = trows.get(j);
//				List<WebElement> tdata = rows.findElements(By.tagName("td"));
//				for (int k = 0; k < tdata.size(); k++) {
//					WebElement td = tdata.get(k);
//					String text = td.getText();
//					System.out.println(text);
//				}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		//Implict wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.id("mail")).sendKeys("martin");
		
		
		//Explict wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
//		until.sendKeys("martin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement element = driver.findElement(By.xpath("//select[@id='first']"));
//		Select s = new Select(element);
//		s.selectByIndex(1);
//		s.selectByValue("Apple");
//		s.selectByVisibleText("Yahoo");
//		
//		boolean multiple = s.isMultiple();
//		System.out.println(multiple);
//		
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			WebElement webElement = options.get(i);
//			String text = webElement.getText();
//			System.out.println(text);
//		}
//		
//		WebElement element2 = driver.findElement(By.xpath("//select[@id=\"second\"]"));
//		Select s1 = new Select(element2);
//		s1.selectByIndex(0);
//		s1.selectByIndex(1);
//		s1.selectByIndex(2);
//		s1.selectByIndex(3);
//		s1.deselectByIndex(1);
//		s1.deselectByIndex(2);
//		
//		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
//		for (int j = 0; j < allSelectedOptions.size(); j++) {
//			WebElement webElement1 = allSelectedOptions.get(j);
//			String text2 = webElement1.getText();
//			System.out.println(text2);
//		}
//		WebElement firstSelectedOption = s1.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.name("q")).sendKeys("Redmi Mobiles",Keys.ENTER);
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
//		String currentWindow = driver.getWindowHandle();
//		
//		Set<String> allWindow = driver.getWindowHandles();
//		for (String all : allWindow) {
//			if (!currentWindow.equals(all)) {
//				driver.switchTo().window(all);
//				String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
//				System.out.println(text);	
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.switchTo().frame("frame1");
//		driver.switchTo().frame("frame3");
//		driver.findElement(By.xpath("//input[@id='a']")).click();
//		driver.switchTo().parentFrame();
//		String element = driver.findElement(By.xpath("//b[@id='topic']")).getText();
//		System.out.println(element);
//		driver.switchTo().defaultContent();
//		String text = driver.findElement(By.xpath("//span[text()=\"Not a Friendly Topic\"]")).getText();
//		System.out.println(text);
		
		
		
		
		
		
		

		
//		Alert a = driver.switchTo().alert();
//		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
//		String text = a.getText();
//		System.out.println(text);
//		a.accept();
//		
//		
//		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
//		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
//		String text2 = a.getText();
//		System.out.println(text2);
//		a.dismiss();
//		
//		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
//		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
//		String text3 = a.getText();
//		System.out.println(text3);
//		a.sendKeys("martin");
//		a.accept();
		
//		  driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
//	         Alert a = driver.switchTo().alert();
//	         a.accept();
//	       
//	         Thread.sleep(2000);
//	         driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
//	         driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
//	         String text =a.getText();
//	         System.out.println(text);
//	        a.accept();
//	         
//	         driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
//	         driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
//	         String text1 =a.getText();
//	         System.out.println(text1);
//	         a.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement user = driver.findElement(By.id("email"));
//		WebElement element2 = driver.findElement(By.id("pass"));
//		WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
//		WebElement element = driver.findElement(By.xpath("//a[@title=\"Check out Facebook games.\"]"));
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','martin')", user,element2,element3);
//		js.executeScript("arguments[1].setAttribute('value','stanly')", user,element2,element3);
//		js.executeScript("arguments[1].setAttribute('style','background:yellow')", user,element2,element3);
//
//		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
//		WebElement element3 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
//		
//		WebElement element = driver.findElement(By.xpath("//li[@id='fourth']"));
//		WebElement element4 = driver.findElement(By.xpath("//ol[@id='amt7']"));
//		
//		WebElement element5 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
//		WebElement element6 = driver.findElement(By.xpath("//ol[@id='loan']"));
//		
//		WebElement element7 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
//		WebElement element8 = driver.findElement(By.xpath("//ol[@id='amt8']"));
//	
//		
//		Actions at = new Actions(driver);
//		at.dragAndDrop(element2, element3).perform();
//		at.dragAndDrop(element, element4).perform();
//		at.dragAndDrop(element5, element6).perform();
//		at.dragAndDrop(element7, element8).perform();
//		
//		TakesScreenshot mk = (TakesScreenshot)driver;
//		File scr = mk.getScreenshotAs(OutputType.FILE);
//		File dis = new File ("C:\\Users\\nmart\\eclipse-workspace\\org.WebDriver\\src\\test\\resources\\selenium.png");
//		FileUtils.copyFile(scr, dis);

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Actions at = new Actions(driver);
//		at.sendKeys(element, "martin").build().perform();
//		at.doubleClick(element).build().perform();
//		at.contextClick(element).build().perform();
//		
//		Robot jk = new Robot();
//		for(int i = 0; i<3; i++){
//		jk.keyPress(KeyEvent.VK_DOWN);
//		jk.keyRelease(KeyEvent.VK_DOWN);
//		}
//		jk.keyPress(KeyEvent.VK_ENTER);
//		jk.keyRelease(KeyEvent.VK_ENTER);
//		
//		jk.keyPress(KeyEvent.VK_TAB);
//		jk.keyRelease(KeyEvent.VK_TAB);
//		jk.keyPress(KeyEvent.VK_CONTROL);
//		jk.keyPress(KeyEvent.VK_V);
//		jk.keyRelease(KeyEvent.VK_CONTROL);
//		jk.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement element = driver.findElement(By.id("email"));
//		element.sendKeys("nmartinstanly");
//		WebElement element2 = driver.findElement(By.name("pass"));
//		element2.sendKeys("283734298");
//		WebElement element3 = driver.findElement(By.className("_6ltj"));
//		element3.click();
//		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("nmartin");
//		WebElement element4 = driver.findElement(By.xpath("//button[@id='did_submit']"));
//		element4.click();
//		WebElement element5 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/ul/li[2]/a"));
//		element5.click();
//		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]"));
//		element6.click();
//		WebElement element7 = driver.findElement(By.name("firstname"));
//		element7.sendKeys("martin");
//		WebElement element8 = driver.findElement(By.name("lastname"));
//		element8.sendKeys("stanly");
//		boolean displayed = driver.findElement(By.xpath("//input[@name='reg_email__']")).isDisplayed();
//		System.out.println(displayed);
//		boolean enabled = driver.findElement(By.xpath("//button[@name='websubmit']")).isEnabled();
//		System.out.println(enabled);
//		boolean element9 = driver.findElement(By.xpath("//input[@name='sex']")).isSelected();
//		System.out.println(element9);
	}

}

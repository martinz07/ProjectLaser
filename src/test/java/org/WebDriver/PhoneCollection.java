package org.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhoneCollection {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String URL = ("https://www.flipkart.com/");
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi Mobiles",Keys.ENTER);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			WebElement webElement1 = elements2.get(i);
			String text1 = webElement1.getText();
			String text = webElement.getText();			
			Map<String,String> g = new HashMap<String,String>();
			g.put(text, text1);
			int rowno = 0;
			for (Map.Entry<String, String> entry : g.entrySet()) {
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println(entry);
	            
	            File t = new File("C:\\Users\\nmart\\eclipse-workspace\\org.WebDriver\\target\\Phone.xlsx");
	    		FileOutputStream u = new FileOutputStream(t);
	    		XSSFWorkbook work = new XSSFWorkbook();
	    		XSSFSheet sheet = work.createSheet("Phone Collecetion");
	    		XSSFRow row = sheet.createRow(rowno++);
	    		row.createCell(0).setCellValue(entry.getKey());
	            row.createCell(1).setCellValue(entry.getValue());
//	    		XSSFCell cell = row.createCell(1);
	    	work.write(u);	
	    		
	        }
		   
					
			
		}
		
//		File t = new File("C:\\Users\\nmart\\eclipse-workspace\\org.WebDriver\\target\\Phone.xlsx");
//		FileOutputStream u = new FileOutputStream(t);
//		XSSFWorkbook work = new XSSFWorkbook();
//		XSSFSheet sheet = work.createSheet("Phone Collecetion");
//		XSSFRow row = sheet.createRow(0);
//		XSSFCell cell = row.createCell(0);
//		work.write(u);
//		row.createCell(0).setCellValue("Mobile");
//	    
	    
	}

}

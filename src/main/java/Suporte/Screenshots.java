package Suporte;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public static void tirar(WebDriver navegador, String arquivo){
		File screenshots = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try{
				
		FileUtils.copyFile(screenshots, new File(arquivo));
		
		}catch (Exception e) {
			System.out.println("Não foi possivel tirar print" + e.getMessage());
		}
	}
		

}

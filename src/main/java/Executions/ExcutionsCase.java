package Executions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Suporte.Generator;
import Suporte.Screenshots;

public class ExcutionsCase {
	
	@Rule
	public TestName test = new TestName();

	@Test
	public void test() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jpassos\\Documents\\Driver\\chromedriver.exe");
		ChromeDriver navegador = new ChromeDriver();
		navegador.get("https://www.facebook.com/");
		navegador.manage().window().maximize();
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.findElement(By.xpath("//input[@id='email']")).click();
		WebElement InsereEmail = navegador.findElement(By.xpath("//input[@id='email']"));
		InsereEmail.sendKeys("jhow.barca10@hotmail.com");
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.findElement(By.xpath("//input[@id='pass']")).click();
		WebElement InsereSenha = navegador.findElement(By.xpath("//input[@id='pass']"));
		InsereSenha.sendKeys("H3rm4n0s10telefonesemfio");
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.findElement(By.xpath("//*[@value='Entrar']")).click();	
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.close();
		
	}
	@Test
	public void newTestCase(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jpassos\\Documents\\Driver\\chromedriver.exe");
		ChromeDriver navegador = new ChromeDriver();
		navegador.get("https://www.mercadolivre.com.br/");
		navegador.manage().window().maximize();
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\SegundoTeste\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.findElement(By.xpath("//input[@name='as_word']")).click();
		WebElement CampoPesquisa = navegador.findElement(By.xpath("//input[@name='as_word']"));
		CampoPesquisa.sendKeys("power bank");
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\SegundoTeste\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\SegundoTeste\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		JavascriptExecutor js1 = ((JavascriptExecutor) navegador);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		navegador.findElement(By.xpath("//*[@id='MLB789132924-I']")).click();
		Screenshots.tirar(navegador, "C:\\Users\\Jpassos\\Documents\\PageObjectEvid\\SegundoTeste\\" + Generator.dataHoraParaAquivo() + test.getMethodName() + ".png");
		
		navegador.close();
		
	}
	

}

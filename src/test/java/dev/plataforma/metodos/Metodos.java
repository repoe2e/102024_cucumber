package dev.plataforma.metodos;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Metodos {
	
	private WebDriver driver;
	
	public Metodos(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicar(By locator) {
		try { // tratamento de exceção
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

}

package dev.plataforma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.plataforma.metodos.Metodos;

public class LoginPage {
	
	private WebDriver driver;
	private Metodos metodos;
	
	
	By btnEntrar = By.xpath("//button[@class='btn-entrar']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
	}
	
	public void acessarFormularioDeLogin() {
		metodos.clicar(btnEntrar);
	}
	
	public void preencherCredenciaisDeLogin(String email, String senha) {
		
	}

}

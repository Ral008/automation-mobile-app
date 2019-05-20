package com.pe.automation.pageobject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginScreen extends PageObject {
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"username\"]")
	private WebElementFacade txtUserName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"password\"]")
	private WebElementFacade txtPassword;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"login\"]")
	private WebElementFacade btnLogin;
	
	public void iniciarApp(){}
	
	public void ingresarUsuario(String userName) {
		txtUserName.type(userName);
	}
	
	public void ingresarPassword(String password) {
		txtPassword.type(password);
	}
	
	public void darClickBotonIngresar() {
		btnLogin.click();
	}
	

}

package com.pe.automation.steps;

import com.pe.automation.pageobject.LoginScreen;
import com.pe.automation.pageobject.ResultScreen;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	LoginScreen loginScreen;
	ResultScreen resultScreen;
	
	@Step
	public void iniciarApp() {
		loginScreen.iniciarApp();	
	}
	
	@Step
	public void iniciarSesion(String userName, String password) {
		loginScreen.ingresarUsuario(userName);
		loginScreen.ingresarPassword(password);
		loginScreen.darClickBotonIngresar();
	}
	
	@Step
	public void seleccionarObjectoDeLaLista(String option) {
		resultScreen.seleccionarObjectoDeLaLista(option);
	}
	
	@Step
	public void moverScroll() {
		resultScreen.moverScroll();
	}
	
	public String obtenerPrimerElementoMostrado(String valor) {
		return resultScreen.obtenerPrimerElementoMostrado(valor);
		
	}

}

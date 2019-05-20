package com.pe.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;

public class ResultScreen extends PageObject {

	public void seleccionarObjectoDeLaLista(String option) {
		findBy("//android.widget.TextView[@text='{0}']", option).click();
	}

	public void moverScroll() {
		/*TouchActions action = new TouchActions(getDriver());
		action.scroll(10, 100);
		action.perform();*/
		System.out.println("Mover scroll");
	}
	
	public String obtenerPrimerElementoMostrado(String valor) {
		return findBy("//android.widget.TextView[@text='{0}']", valor).getText();
	}

}

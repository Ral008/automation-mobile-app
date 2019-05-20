package com.pe.automation.definition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import com.pe.automation.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
	
	@Steps
	LoginSteps loginSteps;
	
	@Given("^iniciar la app$")
	public void iniciar_la_app() {
		loginSteps.iniciarApp();
	}

	@When("^ingresamos con las credenciales con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
	public void ingresamos_con_las_credenciales_con_usuario_y_password(String userName, String password) {
		loginSteps.iniciarSesion(userName, password);
	}

	@Then("^mover el scroll hacia abajo hasta encontrar la opcion Carousel$")
	public void mover_el_scroll_hacia_abajo_hasta_encontrar_la_opcion() {
		loginSteps.moverScroll();
	}

	@Then("^hacer tap en \"([^\"]*)\"$")
	public void hacer_tap_en(String option) {
		loginSteps.seleccionarObjectoDeLaLista(option);
	}

	@Then("^que el primer elemento mostrado es aquel que dice \"([^\"]*)\"$")
	public void que_el_primer_elemento_mostrado_es_aquel_que_dice(String valor) {
		assertThat(loginSteps.obtenerPrimerElementoMostrado(valor), is("1"));
	}

}

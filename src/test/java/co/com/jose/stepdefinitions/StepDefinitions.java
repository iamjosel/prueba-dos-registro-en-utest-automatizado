package co.com.jose.stepdefinitions;

import co.com.prueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jose espera aprender mucho de pruebas de software$")
    public void joseEsperaAprenderMuchoDePruebasDeSoftware() throws Exception{
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage());
    }


    @When("^Completara el formulario completo con sus datos$")
    public void completaraElFormularioCompletoConSusDatos() throws Exception{

    }

    @Then("^Finaliza el registro al completar los formularios$")
    public void finalizaElRegistroAlCompletarLosFormularios() throws Exception{

    }
}

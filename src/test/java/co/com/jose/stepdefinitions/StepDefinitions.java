package co.com.jose.stepdefinitions;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.tasks.LLenarDevices;
import co.com.prueba.tasks.LlenarInfoPersonal;
import co.com.prueba.tasks.LlenarUbication;
import co.com.prueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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
    public void completaraElFormularioCompletoConSusDatos(List<UtestInformation> info) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarInfoPersonal.thePage(info), LlenarUbication.thePage(info),
                LLenarDevices.thePage(info));

    }

    @Then("^Finaliza el registro al completar los formularios$")
    public void finalizaElRegistroAlCompletarLosFormularios() throws Exception{

    }
}

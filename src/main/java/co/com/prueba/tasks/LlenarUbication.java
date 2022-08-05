package co.com.prueba.tasks;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.userinterface.PageUbication;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class LlenarUbication implements Task {

    private List<UtestInformation> info;

    public LlenarUbication(List<UtestInformation> info) {
        this.info = info;
    }

    public static LlenarUbication thePage(List<UtestInformation> info) {
        return Tasks.instrumented(LlenarUbication.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(info.get(0).getStrCity()).into(PageUbication.CITY),
                Hit.the(Keys.ARROW_DOWN).into(PageUbication.CITY),
                Hit.the(Keys.ENTER).into(PageUbication.CITY),
                Enter.theValue(info.get(0).getStrCodePostal()).into(PageUbication.CODE_POSTAL),
                Click.on(PageUbication.CONTENEDOR_COUNTRY),
                Enter.theValue(info.get(0).getStrCountry()).into(PageUbication.COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on((PageUbication.DEVICES_BUTTON))
        );

    }
}

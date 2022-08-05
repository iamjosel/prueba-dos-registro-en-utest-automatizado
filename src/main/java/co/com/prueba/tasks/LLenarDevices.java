package co.com.prueba.tasks;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.userinterface.PageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class LLenarDevices implements Task {

    private List<UtestInformation> info;

    public LLenarDevices(List<UtestInformation> info) {
        this.info = info;
    }

    public static LLenarDevices thePage(List<UtestInformation> info) {
        return Tasks.instrumented(LLenarDevices.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageDevices.CONTAINER_COMPUTER),
                Enter.theValue(info.get(0).getStrComputer()).into(PageDevices.COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PageDevices.CONTAINER_VERSION),
                Enter.theValue(info.get(0).getStrVersion()).into(PageDevices.VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PageDevices.CONTAINER_LANGUAGE),
                Enter.theValue(info.get(0).getStrLanguage()).into(PageDevices.LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PageDevices.CONTAINER_MOBILE_DEVICE),
                Enter.theValue(info.get(0).getStrMobileDevice()).into(PageDevices.MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PageDevices.CONTAINER_MOBILE_MODEL),
                Enter.theValue(info.get(0).getStrMobileModel()).into(PageDevices.MOBILE_MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PageDevices.CONTAINER_OPERATING_SYSTEM),
                Enter.theValue(info.get(0).getStrSystem()).into(PageDevices.SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on((PageDevices.BUTTON_FINISH))
                );
    }


}

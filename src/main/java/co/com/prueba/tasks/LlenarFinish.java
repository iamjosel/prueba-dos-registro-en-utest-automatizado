package co.com.prueba.tasks;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.userinterface.PageFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LlenarFinish implements Task {

    private List<UtestInformation> info;

    public LlenarFinish(List<UtestInformation> info) {
        this.info = info;
    }

    public static LlenarFinish thePage(List<UtestInformation> info) {
        return Tasks.instrumented(LlenarFinish.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(info.get(0).getStrPassword()).into(PageFinish.PASSWORD),
                Enter.theValue(info.get(0).getStrPassword()).into(PageFinish.CONFIRM_PASSWORD),
                        Click.on(PageFinish.CHECKBOX_ONE),
                        Click.on(PageFinish.CHECKBOX_TWO),
                        Click.on(PageFinish.CHECKBOX_THREE),
                        Click.on(PageFinish.BUTTON_FINISH));

    }
}

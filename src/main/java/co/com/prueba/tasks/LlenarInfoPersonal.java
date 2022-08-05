package co.com.prueba.tasks;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.userinterface.PagePersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class LlenarInfoPersonal implements Task {

    private List<UtestInformation> info;

    public LlenarInfoPersonal(List<UtestInformation> info) {
        this.info = info;
    }

    public static LlenarInfoPersonal thePage(List<UtestInformation> info) {
        return Tasks.instrumented(LlenarInfoPersonal.class, info);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(info.get(0).getStrFirstName()).into(PagePersonal.FIRSTNAME),
                Enter.theValue(info.get(0).getStrLastName()).into(PagePersonal.LASTNAME),
                Enter.theValue(info.get(0).getStrEmail()).into(PagePersonal.EMAIL),
                SelectFromOptions.byVisibleText(info.get(0).getStrBirthMonth()).from(PagePersonal.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(info.get(0).getStrBirthDay()).from(PagePersonal.BIRTH_DAY),
                SelectFromOptions.byVisibleText(info.get(0).getStrBirthYear()).from(PagePersonal.BIRTH_YEAR),
                Click.on(PagePersonal.BUTTON_NEXT)
                );

    }
}

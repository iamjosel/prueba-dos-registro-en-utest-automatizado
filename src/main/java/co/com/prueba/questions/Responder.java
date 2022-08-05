package co.com.prueba.questions;

import co.com.prueba.model.UtestInformation;
import co.com.prueba.userinterface.PageFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {
    private List<UtestInformation> info;

    public Responder(List<UtestInformation> info) {
        this.info = info;
    }

    public static Responder toThe(List<UtestInformation> info) {
        return new Responder(info);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String button_finish = Text.of(PageFinish.BUTTON_FINISH).viewedBy(actor).asString();
        return info.get(0).getStrTextFinish().equals(button_finish);
    }
}

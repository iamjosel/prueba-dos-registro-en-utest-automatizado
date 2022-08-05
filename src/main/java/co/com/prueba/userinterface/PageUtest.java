package co.com.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class PageUtest extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Botón para iniciar registro")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}

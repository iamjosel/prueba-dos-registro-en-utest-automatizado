package co.com.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagePersonal {
    public static final Target FIRSTNAME = Target.the("First name")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Birth Month")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Birth Day")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Birth Year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Button next")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}

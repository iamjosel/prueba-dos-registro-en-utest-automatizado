package co.com.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageFinish {
    public static final Target PASSWORD = Target.the("Password user")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password user")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_ONE = Target.the("Checkbox One")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TWO = Target.the("Checkbox Two")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_THREE = Target.the("Checkbox Three")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINISH = Target.the("Button finish")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}

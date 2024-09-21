package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomePage extends PageObject {

    public static final Target BTN_AMOR = Target.the("Boton categoria Amor").located(By.xpath("//ul[@id='primary-menu']//a[normalize-space()='Amor']"));
    public static final Target BTN_CUMPLEANOS = Target.the("Boton categoria Cumpleaños").located(By.xpath("//ul[@id='primary-menu']//a[normalize-space()='Cumpleaños']"));
}

package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.AmorPage.CONTAINER_ITEMS;
import static co.com.serenity.project.ui.CartShopPage.TABLE_ITEMS;
import static co.com.serenity.project.ui.HomePage.BTN_AMOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ViewPurchase implements Task {
    public static ViewPurchase choose() {
        return Tasks.instrumented(ViewPurchase.class);
    }

    @Override
    @Step("{0} hace scroll hasta la tabla de items en el carrito de compras")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TABLE_ITEMS));
    }

}
package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.CartShopPage.BTN_DELETE;
import static co.com.serenity.project.ui.HomePage.BTN_AMOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DeleteItemCartShop implements Task {
    public static DeleteItemCartShop choose() {
        return Tasks.instrumented(DeleteItemCartShop.class);
    }

    @Override
    @Step("{0} Espera que el botón borrar se haga visible y lo clickea")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_DELETE, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_DELETE));
    }

}

package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.HomePage.BTN_AMOR;
import static co.com.serenity.project.ui.HomePage.BTN_CUMPLEANOS;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GoPageCumpleanos implements Task {
    public static GoPageCumpleanos choose() {
        return Tasks.instrumented(GoPageCumpleanos.class);
    }

    @Override
    @Step("{0} selecciona la categoría de cumpleaños")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_CUMPLEANOS, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_CUMPLEANOS));
    }

}

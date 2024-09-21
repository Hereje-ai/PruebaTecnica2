package co.com.serenity.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.serenity.project.ui.HomePage.BTN_AMOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class GoPageAmor implements Task {
    public static GoPageAmor choose() {
        return Tasks.instrumented(GoPageAmor.class);
    }

    @Override
    @Step("{0} selecciona la opcón de amor")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_AMOR, isEnabled()).forNoMoreThan(TIME_SHORT).seconds(), Click.on(BTN_AMOR));
    }

}

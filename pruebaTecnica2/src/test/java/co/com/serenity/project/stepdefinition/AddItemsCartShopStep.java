package co.com.serenity.project.stepdefinition;

import co.com.serenity.project.tasks.ChooseOptionShop;
import co.com.serenity.project.tasks.GoPageAmor;
import co.com.serenity.project.tasks.ViewPurchase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.serenity.project.utils.Constants.ACTOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static co.com.serenity.project.utils.DataFaker.fakerNumberOneAndSix;
import static co.com.serenity.project.utils.Time.waiting;

public class AddItemsCartShopStep {
    @And("selecciona la categoria amor, elige aleatoriamente el primer producto")
    public void seleccionaLaCategoriaAmorEligeAleatoriamenteElPrimerProducto() {
        OnStage.theActorCalled(ACTOR).attemptsTo(GoPageAmor.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseOptionShop.withParams(fakerNumberOneAndSix()));
        waiting(TIME_SHORT);
    }

    @When("regresa a la categoria amor, elige aleatoriamente el segundo producto")
    public void regresaALaCategoriaAmorEligeAleatoriamenteElSegundoProducto() {
        OnStage.theActorCalled(ACTOR).attemptsTo(GoPageAmor.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseOptionShop.withParams(fakerNumberOneAndSix()));
    }

    @Then("visualizara en el CARRITO los dos productos seleccionados")
    public void visualizaraEnElCARRITOLosDosProductosSeleccionados() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ViewPurchase.choose());
        waiting(TIME_SHORT);
    }
}

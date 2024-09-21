package co.com.serenity.project.stepdefinition;

import co.com.serenity.project.tasks.ChooseOptionShop;
import co.com.serenity.project.tasks.DeleteItemCartShop;
import co.com.serenity.project.tasks.GoPageCumpleanos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.serenity.project.utils.Constants.ACTOR;
import static co.com.serenity.project.utils.Constants.TIME_SHORT;
import static co.com.serenity.project.utils.DataFaker.fakerNumberOneAndSix;
import static co.com.serenity.project.utils.Time.waiting;

public class AddRemoveItemCartShopStep {
    @And("selecciona la categoria cumpleaños, elige aleatoriamente un producto")
    public void seleccionaLaCategoriaCumpleañosEligeAleatoriamenteUnProducto() {
        OnStage.theActorCalled(ACTOR).attemptsTo(GoPageCumpleanos.choose());
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseOptionShop.withParams(fakerNumberOneAndSix()));
        waiting(TIME_SHORT);
    }

    @When("eliminar el producto seleccionado anteriormente")
    public void eliminarElProductoSeleccionadoAnteriormente() {
        OnStage.theActorCalled(ACTOR).attemptsTo(DeleteItemCartShop.choose());

    }

    @Then("validar que en el CARRITO se haya eliminado correctamente")
    public void validarQueEnElCARRITOSeHayaEliminadoCorrectamente() {
        waiting(TIME_SHORT);
    }
}

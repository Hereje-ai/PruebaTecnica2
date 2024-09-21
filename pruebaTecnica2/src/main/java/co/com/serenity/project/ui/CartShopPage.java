package co.com.serenity.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class CartShopPage extends PageObject {
    public static final Target TABLE_ITEMS = Target.the("tabla las opciones de compra añadidas al carrito").located(By.xpath("//ol[@class='breadcrumb']"));
    public static final Target BTN_DELETE = Target.the("botón para eliminar opcion del carrito").located(By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]"));
}

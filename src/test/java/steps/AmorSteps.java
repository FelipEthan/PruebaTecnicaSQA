package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmorPage;
import pages.BasePage;

public class AmorSteps {
    private WebDriver driver;
    private AmorPage amorPage;

    public AmorSteps() {
        this.driver = BasePage.initDriver();
        this.amorPage = new AmorPage(this.driver);
    }
    @Given("Que estoy en la página de un producto")
    public void navigateToAmorPage() {
        this.amorPage.navegarPagina();
        this.amorPage.clickPageAmor();
    }
    @When("Selecciono el producto y agrego al carrito")
    public void seleccionarProducto() {
        this.amorPage.clickProductoComprar();
        this.amorPage.ToCarrito();
    }
    @And("Selecciono un nuevo producto y lo agrego al carrito")
    public void seleccionarNuevoProducto() {
        this.amorPage.clickProductoComprar2();
    }
    @Then("Entonces el carrito debe contener 2 unidades del producto")
    public void productoCarrito() {
        this.amorPage.capturaAtributoValor();
        this.amorPage.cerrarNavegador();
    }
}

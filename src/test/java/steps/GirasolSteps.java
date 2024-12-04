package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmorPage;
import pages.BasePage;
import pages.GirasolPage;

public class GirasolSteps {
    private WebDriver driver;
    private GirasolPage girasolPage;

    public GirasolSteps() {
        this.driver = BasePage.initDriver();
        this.girasolPage = new GirasolPage(this.driver);
    }
    @Given("Que estoy en la página de un producto de girasoles")
    public void navigateToAmorPage() {
        this.girasolPage.navegarPagina();
        this.girasolPage.clickPageGirasol();
    }
    @When("Selecciono el producto girasol")
    public void seleccionarProducto() {
        this.girasolPage.clickProductoComprar();
    }
    @And("Lo agrego al carrito y lo elimino del carrito")
    public void seleccionarNuevoProducto() {
        this.girasolPage.toCarrito();
        this.girasolPage.clicConJavas();
    }
    @Then("Entonces el carrito debe estar vacío")
    public void productoCarrito() {
        this.girasolPage.capturaAtributoValor();
        this.girasolPage.cerrarNavegador();
    }
}

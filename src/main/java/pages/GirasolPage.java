package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GirasolPage  extends BasePage{
    String elemento1 = "//a[@href='https://sanangel.com.co/categoria/13-ella/23-girasoles-flores-san-angel-floristeria-medellin/']";
    String elemento2 = "//img[@src='https://sanangel.com.co/wp-content/uploads/2023/07/manarola-300x300.jpg']";
    String elemento3 = "//button[@type='submit']";
    String elemento4 = "//*[@id='order_review']/table/tbody/tr/td[1]/a";
    String elemento5 = "//span[@class='navmenu__circle']";

    public GirasolPage(WebDriver driver) {
        super(driver);
    }
    public void navegarPagina(){
        navigateTo("https://sanangel.com.co/");
    }
    public void clickPageGirasol(){
        clicElement(elemento1);
    }
    public void clickProductoComprar(){
        clicElement(elemento2);
    }
    public void toCarrito(){
        clicElement(elemento3);
    }
    public void clicConJavas() {
        clicJavas(elemento4);
    }
    public void capturaAtributoValor(){
        String valorCaptura = capturaAtributo(elemento5);
        Assertions.assertThat(valorCaptura).isEqualTo("0");
    }
    public void cerrarNavegador(){
        closeBrowser();
    }
}

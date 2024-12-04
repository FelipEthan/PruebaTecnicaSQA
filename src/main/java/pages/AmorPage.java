package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AmorPage extends BasePage{
    String elemento1 = "//a[text()='Amor']";
    String elemento2 = "//img[@src='https://sanangel.com.co/wp-content/uploads/2019/02/presente-new-300x300.jpg.webp']";
    String elemento3 = "//button[@type='submit']";
    String urlSeguirCompra = "https://sanangel.com.co/categoria/4-amor-y-romance-flores-san-angel-floristerias/";
    String elemento4 = "//img[@src='https://sanangel.com.co/wp-content/uploads/2019/02/reino-de-sueños-300x300.jpg']\n";
    String elemento5 = "//span[@class='navmenu__circle']";


    public AmorPage(WebDriver driver) {
        super(driver);
    }
    public void navegarPagina(){
        navigateTo("https://sanangel.com.co/");
    }
    public void clickPageAmor(){
        clicElement(elemento1);
    }
    public void clickProductoComprar(){
        clicElement(elemento2);
    }
    public void ToCarrito(){
       clicElement(elemento3);
    }
    public void clickProductoComprar2(){
        driver.navigate().to(urlSeguirCompra);
        clicElement(elemento4);
        clicElement(elemento3);
    }
    public void capturaAtributoValor(){
        String valorCaptura = capturaAtributo(elemento5);
        Assertions.assertThat(valorCaptura).isEqualTo("2");
    }
    public void cerrarNavegador(){
        closeBrowser();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
public class HomeWork2XPath {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators() {

        //<body>
        WebElement bodyXPath = wd.findElement(By.xpath("//body"));//by XPath

        //<div>
        WebElement divHeader = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']")); //by XPath
        WebElement divLogin = wd.findElement(By.xpath("//div/div[2]")); //by XPath


        //<h1>
        WebElement h1 = wd.findElement(By.xpath("//h1")); //by XPath
        Assert.assertEquals(h1.getText(), "PHONEBOOK");

        //<a>
        List<WebElement> headerTitles = wd.findElements((By.xpath("//div/div/a"))); // by XPath
        Assert.assertTrue(headerTitles.size()==3);

        WebElement titleHome = wd.findElement(By.xpath("//a[1]")); // by XPath
        Assert.assertEquals(titleHome.getText(), "HOME");

        WebElement titleAbout = wd.findElement(By.xpath("//a[contains(@href, 'ab')]"));
        Assert.assertEquals(titleAbout.getText(), "ABOUT");

        WebElement titleLogin = wd.findElement(By.xpath("//a[text()='LOGIN']"));
        Assert.assertEquals(titleLogin.getText(), "LOGIN");

        //<form>
        WebElement form = wd.findElement(By.xpath("//form"));

        //field "Input"
        WebElement inputEmail = wd.findElement(By.xpath("//*[@placeholder][1]"));
        Assert.assertEquals(inputEmail.getAttribute("name"), "email");

        WebElement inputPass = wd.findElement(By.xpath("//*[@name='password']"));
        Assert.assertEquals(inputPass.getAttribute("name"), "password");

        List<WebElement> fields = wd.findElements(By.xpath("//input"));
        Assert.assertTrue(fields.size() == 2);
        List<WebElement> fields1 = wd.findElements(By.xpath("//*[@placeholder]"));
        Assert.assertTrue(fields1.size() == 2);

        // Button
        List<WebElement> buttons = wd.findElements(By.xpath("//button"));
        Assert.assertTrue(buttons.size() == 2);

        WebElement buttonLogin = wd.findElement(By.xpath("//button[1]"));
        Assert.assertEquals(buttonLogin.getText(), "Login");

        WebElement buttonReg = wd.findElement(By.xpath("//button[contains(@name, 'reg')]"));
        Assert.assertEquals(buttonReg.getText(), "Registration");

        // <div id="root" class="container"
        WebElement el1 = wd.findElement(By.xpath("//*[@class='container']"));// by XPath

        // <div class="navbar-component_nav__1X_4m">
        WebElement el2 = wd.findElement(By.xpath("//*[contains(@class, 'nav__1X_4m')]"));

        // <div class="login_login__3EHKB">
        WebElement al19 = wd.findElement(By.xpath("//*[contains(@class, '3EHKB')]"));

        //by id
        WebElement el19 = wd.findElement(By.xpath("//div[@id='root']"));

        //by attribute
        WebElement el20 = wd.findElement(By.xpath("//*[@id='root']"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement el21 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement header = wd.findElement(By.xpath("//*[starts-with(@class, 'navbar-')]"));
        Assert.assertEquals(header.getAttribute("class"), "navbar-component_nav__1X_4m");
        WebElement el22 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        //end
        WebElement el23 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        //contains
        WebElement el24 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));
        WebElement regButton = wd.findElement(By.xpath("//*[contains(text(), 'stra')]"));
        Assert.assertEquals(regButton.getText(), "Registration");

        //by text
        WebElement el25 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
        WebElement logo = wd.findElement(By.xpath("//*[text()='PHONEBOOK']"));
    }

}

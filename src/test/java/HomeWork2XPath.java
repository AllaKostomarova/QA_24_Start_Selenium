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
        //by tag name
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement bodyXPath = wd.findElement(By.xpath("//body"));//by XPath

        //<div>
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement divHeader = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']")); //by XPath
        WebElement divLogin = wd.findElement(By.xpath("//div/div[2]")); //by XPath


        //<h1>
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_2 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));
        WebElement h1Logo = wd.findElement(By.xpath("//h1")); //by XPath
        Assert.assertEquals(h1Logo.getText(), "PHONEBOOK");

        //<a>
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a_1 = wd.findElement(By.cssSelector("a"));
        List<WebElement>list = wd.findElements(By.tagName("a"));

        List<WebElement> headerTitles = wd.findElements((By.xpath("//div/div/a"))); // by XPath
        Assert.assertTrue(headerTitles.size()==3);

        WebElement titleHome = wd.findElement(By.xpath("//a[1]")); // by XPath
        Assert.assertEquals(titleHome.getText(), "HOME");

        WebElement titleAbout = wd.findElement(By.xpath("//a[contains(@href, 'ab')]"));
        Assert.assertEquals(titleAbout.getText(), "ABOUT");

        WebElement titleLogin = wd.findElement(By.xpath("//a[text()='LOGIN']"));
        Assert.assertEquals(titleLogin.getText(), "LOGIN");

        //<form>
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement formXPath = wd.findElement(By.xpath("//form"));

        //field "Input"
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement inputEmail = wd.findElement(By.xpath("//*[@placeholder][1]"));
        Assert.assertEquals(inputEmail.getAttribute("name"), "email");

        WebElement inputPass = wd.findElement(By.xpath("//*[@name='password']"));
        Assert.assertEquals(inputPass.getAttribute("name"), "password");

        List<WebElement> fields = wd.findElements(By.xpath("//input"));
        Assert.assertTrue(fields.size() == 2);
        List<WebElement> fields1 = wd.findElements(By.xpath("//*[@placeholder]"));
        Assert.assertTrue(fields1.size() == 2);

        // Button
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));

        List<WebElement> buttons = wd.findElements(By.xpath("//button"));
        Assert.assertTrue(buttons.size() == 2);

        WebElement buttonLogin = wd.findElement(By.xpath("//button[1]"));
        Assert.assertEquals(buttonLogin.getText(), "Login");

        WebElement buttonReg = wd.findElement(By.xpath("//button[contains(@name, 'reg')]"));
        Assert.assertEquals(buttonReg.getText(), "Registration");

        // <div id="root" class="container"
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el2 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el3 = wd.findElement(By.xpath("//*[@class='container']"));// by XPath

        // <div class="navbar-component_nav__1X_4m">
        WebElement el4 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el6 = wd.findElement(By.xpath("//*[contains(@class, 'nav__1X_4m')]"));

        // <div class="login_login__3EHKB">
        WebElement el7 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el8 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement el9 = wd.findElement(By.xpath("//*[contains(@class, '3EHKB')]"));

        //by id
        WebElement el10 = wd.findElement(By.id("root"));
        WebElement el11 = wd.findElement(By.cssSelector("#root"));

        WebElement el12 = wd.findElement(By.xpath("//div[@id='root']"));
        WebElement el13 = wd.findElement(By.xpath("//div[@id='root']"));

        //by attribute
        WebElement el14 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement el15 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement el16 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el17 = wd.findElement(By.cssSelector("[href='/about']"));

        WebElement el18 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el19 = wd.findElement(By.name("email"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement el20 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el21 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement el22 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));

        WebElement header = wd.findElement(By.xpath("//*[starts-with(@class, 'navbar-')]"));
        Assert.assertEquals(header.getAttribute("class"), "navbar-component_nav__1X_4m");

        WebElement el23 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        //end
        WebElement el24 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement el25 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        //contains
        WebElement el26 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el27 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        WebElement regButton = wd.findElement(By.xpath("//*[contains(text(), 'stra')]"));
        Assert.assertEquals(regButton.getText(), "Registration");

        //by text
        WebElement el28 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
        WebElement logo = wd.findElement(By.xpath("//*[text()='PHONEBOOK']"));
    }

}

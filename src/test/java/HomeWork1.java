import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class HomeWork1 {
    WebDriver webdriver;

    @BeforeClass
    public void start(){
        webdriver = new ChromeDriver();
        webdriver.get("https://telranedu.web.app/login");
    }

    @Test
    public void findHeaderBySelectors() {
        //find header's elements: logo, HOME, ABOUT, LOGIN
        //header
        System.out.println("=== header ===");
        WebElement header = webdriver.findElement(By.cssSelector(".navbar-component_nav__1X_4m")); // by CSS Selector/class
        List<WebElement> headerTitles = webdriver.findElements(By.cssSelector("div[class='navbar-component_nav__1X_4m'] a"));//by CSSLocator
        Boolean isThreeTitles = headerTitles.size() == 3;
        System.out.println("There are three titles in the header --> " + isThreeTitles);
    }
    @Test
    public void findLogoBySelectors() {
        // logo
        System.out.println("=== logo ===");
        WebElement logoPhonebook = webdriver.findElement(By.tagName("h1")); // by tag name
        System.out.println("Logo name in the header: PHONEBOOK --> " + logoPhonebook.getText().equals("PHONEBOOK"));
        Boolean noHref = logoPhonebook.getAttribute("href") == null;
        System.out.println("The logo is not clickable and does not have an href attribute --> " + noHref);
//        logoPhonebook.click();
//        webdriver.navigate().refresh();
    }

    @Test
    public void findTitleHomeBySelectors() {
        // title HOME
        System.out.println("=== HOME ===");
        WebElement titleHome = webdriver.findElement(By.linkText("HOME")); // by linkText
        System.out.println("The name of the first title in the header: HOME --> " + titleHome.getText().equals("HOME"));
        titleHome.click();
        webdriver.navigate().back();
        webdriver.navigate().refresh();
    }

    @Test
    public void findTitleAboutBySelectors() {
        // title ABOUT
        System.out.println("=== ABOUT ===");
        WebElement titleAbout = webdriver.findElement(By.cssSelector("[href='/about']")); // by CSSLocator/attribute
        System.out.println("The name of the second title in the header: ABOUT --> " + titleAbout.getText().equals("ABOUT"));
        titleAbout.click();
        webdriver.navigate().back();
        webdriver.navigate().refresh();
    }

    @Test
    public void findTitleLoginBySelectors() {
        // title LOGIN
        System.out.println("=== title LOGIN ===");
        WebElement titleLogin = webdriver.findElement(By.className("active")); // by class
        System.out.println("The name of the third title in the header: LOGIN --> " + titleLogin.getText().equals("LOGIN"));
        titleLogin.click();
        //webdriver.navigate().back();
        webdriver.navigate().refresh();
    }

    @Test
    public void findLoginFormBySelectors() {
        //find elements of form
        // form
        System.out.println("=== form ===");
        WebElement regForm = webdriver.findElement(By.tagName("form")); // by tag name
        //System.out.println("Class name of registration form contains \"login\" --> class = " + regForm.getAttribute("class"));

        WebElement regForm1 = webdriver.findElement(By.tagName("form"));// by Tag Name

        List<WebElement> elementsOfForm = webdriver.findElements(By.cssSelector("form [name]")); //CssSelector/tag & attribute "name"
        Boolean containsFourElements = elementsOfForm.size() == 4;
        System.out.println("The Login Form contains 4 elements --> " + containsFourElements);

        List<WebElement> elementsForInput = webdriver.findElements(By.cssSelector("form input[placeholder]")); //CssSelector/form/input
        Boolean containsTwoInputs = elementsForInput.size() == 2;
        System.out.println("The Login Form contains 2 fields for input --> " + containsTwoInputs);

        List<WebElement> buttons = webdriver.findElements(By.cssSelector("form button[type ^='sub']")); //CssSelector/form/button ->attribute "type" contains part of a text
        Boolean containsTwoButtons = buttons.size() == 2;
        System.out.println("The Login Form contains 2 buttons --> " + containsTwoButtons);
    }
    @Test
    public void findEmailFieldBySelectors() {
        // Field Email
        System.out.println("=== field email ===");
        WebElement fieldEmail = webdriver.findElement(By.name("email"));
        fieldEmail.clear();
        fieldEmail.click();
    }

    @Test
    public void findPasswordFieldBySelectors() {
        // Field Password
        System.out.println("=== field passsword ===");
        WebElement fieldPassword = webdriver.findElement(By.cssSelector("form input[placeholder='Password']"));
        fieldPassword.clear();
        fieldPassword.click();
    }

    @Test
    public void findLoginButtonBySelectors() {
        // Button "Login"
        System.out.println("=== button login ===");
        WebElement loginButton = webdriver.findElement(By.name("login"));
//        loginButton.click();
//        webdriver.navigate().refresh();
    }

    @Test
    public void findRegistrationButtonBySelectors(){
        // Button "Registration"
        System.out.println("=== button registration ===");
        WebElement registrationButton = webdriver.findElement(By.cssSelector("form button[name *='gis']"));// by CssSelector tag tag[attribute -> part of text]
//        registrationButton.click();
//        webdriver.navigate().refresh();
    }

    @AfterClass
    public void finish(){
      webdriver.quit();
    }
}

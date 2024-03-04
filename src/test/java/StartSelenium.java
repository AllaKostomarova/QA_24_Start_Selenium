import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @Test
    public void test(){
        wd = new ChromeDriver();
        //       wd.get("https://telranedu.web.app/");// не сохраняется история переходов по сайту, по страницам
        wd.navigate().to("https://telranedu.web.app/"); // сохраняется история переходов по сайту, по страницам

        wd.navigate().back();//вернуться назад
        wd.navigate().forward();//перейти вперед
        wd.navigate().refresh();//обновить

        //       wd.close();//закрывает только один таб, если открыт только один таб, то заероет и сам браузер
        wd.quit();//заерывает браузер
    }
}

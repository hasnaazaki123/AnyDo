import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ANYDOHome {
    private WebDriver driver;
    By getStarted  = By.xpath("(//div /div /a[contains(text(),'Get Started')])[1]");
    By EmailField = By.xpath("//input[@type='text']");
    By  Arrow = By.xpath("//button[@type='submit']");
    public ANYDOHome(WebDriver driver){
        this.driver=driver;
    }
    public SignUp GetRegisterPage(String email){
        driver.findElement(getStarted).click();
        driver.findElement(EmailField).sendKeys(email);
        driver.findElement(Arrow).click();
        return new SignUp(driver);
    }
    public Login GetLoginPage(String email){
        driver.findElement(getStarted).click();
        driver.findElement(EmailField).sendKeys(email);
        driver.findElement(Arrow).click();
        return new Login(driver);
    }
}

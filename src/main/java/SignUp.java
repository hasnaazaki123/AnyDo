import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SignUp {
    private WebDriver driver;
    By FullName = By.xpath("//input[@name='displayName']");
    By Password = By.xpath("//input[@type='password']");
    By CreateAccount = By.xpath("//button[contains(text(),'Create Account')]");
    By RegisterMessage =By.xpath("//div[contains(text(),\"We'll streamline your setup experience accordingly\")]");

    public SignUp(WebDriver driver){
        this.driver=driver;
    }
    public void fullName(String flName){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(FullName).sendKeys(flName);
    }
    public void password(String passWord){driver.findElement(Password).sendKeys(passWord);}
    public void ClickAccountButton(){driver.findElement(CreateAccount).click();}
    public String ShowMessage(){return driver.findElement(RegisterMessage).getText();}
}

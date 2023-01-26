import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login {
    private WebDriver driver;
    By PassWORD = By.xpath("//input[@type='password']");
    By SignInButton = By.xpath("//button[contains(text(),'Sign In')]");
   // By RegisterMessage =By.xpath("//div[contains(text(),\"We'll streamline your setup experience accordingly\")]");
    public Login(WebDriver driver){
        this.driver=driver;
    }
    public void Pw(String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(PassWORD).sendKeys(password);}
    public void SignInCLick (){driver.findElement(SignInButton).click();}
    //public String ShowMessage(){return driver.findElement(RegisterMessage).getText();}
}

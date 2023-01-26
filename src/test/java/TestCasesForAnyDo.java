import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCasesForAnyDo {
    private WebDriver driver;
    ANYDOHome homepage;
    SignUp SignUpPage;
    Login loginPage;
    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.get("https://www.any.do/");
        driver.manage().window().maximize();
        homepage=new ANYDOHome(driver);
    }
    @Test
    public void RegisterWithValidData(){
        SignUpPage=homepage.GetRegisterPage("ahmed13@gmail.com");
        SignUpPage.fullName("ahmed mostafa");
        SignUpPage.password("Ahmed12345");
        SignUpPage.ClickAccountButton();
        Assert.assertEquals(SignUpPage.ShowMessage(),"We'll streamline your setup experience accordingly");
    }

    @Test
    public void SignInWithValidData(){
        loginPage=homepage.GetLoginPage("ahmed13@gmail.com");
        loginPage.Pw("Ahmed12345");
        loginPage.SignInCLick();
        //Assert.assertEquals(loginPage.ShowMessage(),"We'll streamline your setup experience accordingly");
    }
    @AfterMethod
    public void Quit(){driver.quit();}
}

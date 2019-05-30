package pages;


import libs.ConfigData;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends ParentPage{
    WebDriver driver;
    Logger log;
    ParentPage parentPage;

    @FindBy(name = "username")
    WebElement usernameFieldByName3;

    @FindBy(id="password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement button;

    @FindBy(xpath="//div[1]/input[1]")
    WebElement loginInput;

    @FindBy(xpath="//div[2]/input[1]")
    WebElement passwordInput;

    @FindBy(xpath="//div[2]/a[1]")
    WebElement rememberPasswordLink;

    @FindBy(xpath="//div[2]/a[2]")
    WebElement registerLink;

    public LoginPage(WebDriver driver) {
        super(driver);
        log = Logger.getLogger(getClass());
    }

    public void OpenPageLogin(){
        try{
            //driver.get(ConfigData.getCfgValue("base_url")+"/login");
            log.info(driver);
            driver.get("http://v3.test.itpmgroup.com/login");
        }catch (Exception ex){
            ex.printStackTrace();
            Assert.fail("Can not open URL");
        }
    }

    public void OpenLoginPage(String link)
    {
        try {
            driver.get(link);
            log.info("Page was opened");
        } catch (Exception ex)
        {
            ex.printStackTrace();
            log.error("Page does not open" + ex);
        }
    }


    public void InputLoginName(String username){

        parentPage.actionsWithWebElements.inputTextToField(usernameFieldByName3, username);
    }

    public void InputPassword(String pass){
        parentPage.actionsWithWebElements.inputTextToField(password,pass);
    }

    public void ClickSubmitButton(){
        parentPage.actionsWithWebElements.clickToElements(button);
    }

    public void ClickRegisterLink(WebElement rememberPasswordLink){
        parentPage.actionsWithWebElements.clickToElements(registerLink);
    }

    public void ClickRememberPasswordLink(WebElement registerLink){
        parentPage.actionsWithWebElements.clickToElements(rememberPasswordLink);
    }

    public void loginUser(String login, String password){
        OpenPageLogin();
        InputLoginName(login);
        InputPassword(password);
        ClickSubmitButton();
    }


}

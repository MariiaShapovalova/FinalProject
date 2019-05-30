package loginTest;

import libs.ConfigData;
import org.junit.Test;
import pages.LoginPage;
import parrentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLoginDataFromExel extends ParentTest {

    public ValidLoginDataFromExel(String browser) {
        super(browser);
    }
    @Test
    public void validLogin() throws IOException{
        Map dataFromExelForValidLoginTest=excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");
        loginPage.OpenPageLogin();
        loginPage.InputLoginName(dataFromExelForValidLoginTest.get("login").toString());
        loginPage.InputPassword(dataFromExelForValidLoginTest.get("pass").toString());
        loginPage.ClickSubmitButton();
        checkAcceptanceCriteria("Login is happend",homePage.isAvatarPresent(),true);

    }
}

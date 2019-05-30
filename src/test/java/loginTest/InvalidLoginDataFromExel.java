package loginTest;

import libs.ConfigData;
import libs.SpreadsheetData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parrentTest.ParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class InvalidLoginDataFromExel extends ParentTest {


    String login,password;
    public InvalidLoginDataFromExel(String browser, String login, String password) {
        super(browser);
        this.login=login;
        this.password=password;
    }

@Parameterized.Parameters
public static Collection testData() throws IOException{
    InputStream spreadsheet=new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH")+"testDataSuit.xls");
    return new SpreadsheetData(spreadsheet,"InvalidLogOn").getData();
}

@Test
    public void invalodLogin(){
        loginPage.loginUser(login,password);
        checkAcceptanceCriteria("Title isn't match",loginPage.getTitle(),"Account of spare:Авторизация");
    }

}

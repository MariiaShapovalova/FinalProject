package loginTest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parrentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

public class InvalidLoginThisParam extends ParentTest {
    String login,password;

    public InvalidLoginThisParam(String browser,String login, String password) {
        super(browser);
        this.login=login;
        this.password=password;
    }

@Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"chrome","Student","906090"},
                {"chrome","tudent","909090"}

        });
    }

@Test
    public void invalidLogin(){
        loginPage.loginUser(login,password);
        checkAcceptanceCriteria("Title not macth",loginPage.getTitle(),"Account of spare:Авторизация");
}

}

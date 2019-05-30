package loginTest;

import org.junit.Test;
import parrentTest.ParentTest;

public class ValidTest extends ParentTest {

    public ValidTest(String browser){
        super (browser);
    }

   /* @FindBy(name="Student")
    WebElement username;

    @FindBy(id="909090")
    WebElement password;
    @FindBy(xpath="//*[@class='btn btn-primary btn-block btn-flat']")
    WebElement button;*/

    @Test
    public void logInWithValidCredentials(){
        loginPage.OpenPageLogin();
        loginPage.InputLoginName("Student");
        loginPage.InputPassword("909090");
        loginPage.ClickSubmitButton();
        checkAcceptanceCriteria("Avatar is not present",homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Avatar is not expected",homePage.getTitle(),"Учет запчасей");
        homePage.isAvatarPresent();
        // homePage.clickOnsubMenuSpare();
        // homePage.clickOnsubMenuTypeSdelki();
        homePage.checkTitle("Учет запчастей");
        homePage.isAvatarStudentPresent();

        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuApparat();
        homePage.clickOnsubAddButton();
        homePage.inputTextToApparatNumberField("1234");
        homePage.inputTextToApparatCommentField("This is test");
        homePage.clickOnsubCreateButton();

        homePage.clickOnAvatarStudent();
        homePage.clickOnbuttonLogout();
    }



}

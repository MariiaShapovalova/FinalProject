package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    WebDriver driver;
    Logger log;
    ParentPage parentPage;

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy (xpath = ".//li[@id='deal']")
    WebElement sdelki;

    @FindBy(xpath =".//*[@id='dictionary']/a")
    private WebElement menuDictionary;

    @FindBy(id = "spares")
    private WebElement subMenuSpare;

    @FindBy(id="apparat")
    private WebElement subMenuApparat;

    @FindBy(xpath = ".//a[@class='dropdown-toggle']")
    private WebElement avatarStudent;

    @FindBy(xpath = ".//a[@href='/logout']")
    private WebElement buttonLogout;

    @FindBy(xpath = ".//a[@ href='/dictionary/deal_type']")
    private WebElement subMenuTypeSdelki;

    @FindBy(xpath = "//a[@class='logo']")
    protected WebElement TitleLogo;


    //----------

    @FindBy(xpath = ".//div[@class='content-wrapper']//a[1]")
    private WebElement breadCrumb1;

    @FindBy(xpath = ".//li[@class='active']")
    private WebElement breadCrumbActual;

    @FindBy(xpath = ".//ol[@class='breadcrumb']")
    private WebElement breadCrumbs;

    @FindBy(xpath = ".//h3[@class='box-title']")
    private WebElement textTitle;

    @FindBy(xpath = ".//div[@class='box-body']//div[@class='box-body']")
    private WebElement footerBlock;

    @FindBy(xpath = ".//div[1]/footer[1]/strong[1]")
    private WebElement copiritingText;

    @FindBy(xpath = ".//div[1]/footer[1]/strong[1]/a[1]")
    private WebElement companyLink;

    @FindBy(xpath = ".//div[1]/div[1]/section[1]/h1[1]")
    private WebElement pageTitle;

    @FindBy(xpath = "./html[1]/body[1]/div[1]/footer[1]/strong[1]/a[1]")
    private WebElement burgerButton;

    @FindBy(xpath = ".//a[@class='logo']")
    private WebElement logoTitle;

    @FindBy (xpath = "//input[@id='apparat_apparatNumber']")
    protected WebElement ApparatNumberTextField;

    @FindBy (xpath = "//input[@id='apparat_apparatComment']")
    protected WebElement ApparatCommentTextField;

    @FindBy (xpath = "//button[@name='add']")
    protected WebElement subCreateButton;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement subAddButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /*@FindBy(xpath = ".//div[@class='box-body']//div[@class='box-body']")
    private WebElement footerBlock;

    @FindBy(xpath = ".//div[1]/footer[1]/strong[1]")
    private WebElement copiritingText;

    @FindBy(xpath = ".//div[1]/footer[1]/strong[1]/a[1]")
    private WebElement companyLink;

    @FindBy(xpath = ".//div[1]/div[1]/section[1]/h1[1]")
    private WebElement pageTitle;

    @FindBy(xpath = "./html[1]/body[1]/div[1]/footer[1]/strong[1]/a[1]")
    private WebElement burgerButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }


   public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
        log = Logger.getLogger(getClass());
    }*/

    public boolean isAvatarPresent() {

        return parentPage.actionWithWebElements.isElementPresent(avatar);
    }


    public boolean isAvatarStudentPresent() {

        return actionsWithWebElements.isElementPresent(avatarStudent);
    }

    public void clickOnAvatarStudent() {

        actionsWithWebElements.clickToElements(avatarStudent);
    }

    public void clickOnsubMenuSpare() {

        actionsWithWebElements.clickToElements(subMenuSpare);
    }

    public void clickOnbuttonLogout() {

        actionsWithWebElements.clickToElements(buttonLogout);
    }

    public void clickOnsubMenuTypeSdelki() {

        actionsWithWebElements.clickToElements(subMenuTypeSdelki);
    }

    public void checkTitle(String uchetZapchastey)
    {
        Assert.assertEquals("UchetnayaZapis is not matched", TitleLogo.getText(), uchetZapchastey);
    }

    public void clickOnMenuDictionary() {
        actionWithWebElements.clickToElements(menuDictionary);
    }

    public void clickOnSubMenuApparat() {
        actionWithWebElements.clickToElements(subMenuApparat);
    }

    public void clickOnsubAddButton() {
        actionsWithWebElements.clickToElements(subAddButton);
    }

    public void inputTextToApparatNumberField(String apparatNumberText){
        actionsWithWebElements.inputTextToField(ApparatNumberTextField, apparatNumberText);
    }

    public void inputTextToApparatCommentField(String apparatCommentText){
        actionsWithWebElements.inputTextToField(ApparatCommentTextField, apparatCommentText);
    }

    public void clickOnsubCreateButton() {
        actionsWithWebElements.clickToElements(subCreateButton);
    }

}


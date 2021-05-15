import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.jq.Main;

public class MainPage extends PageObject{
    //Class constructor
    public MainPage(WebDriver driver){
        super(driver);
    }
    private final String Website_Name = "Emag";
    private final String VALID_URL = "www.emag.com";

    @FindBy(xpath = "//*[@id=\"siteName\"]")
    private WebElement websiteName;

    @FindBy(xpath = "//*[@id=\"urlName\"]")
    private WebElement websiteUrl;

    @FindBy(xpath = "//*[@id=\"myForm\"]/button")
    private WebElement submitButton;
    @FindBy(xpath= "//*[@id=\"bookmarksOutput\"]/div[4]/h3/a[2]")
    private WebElement deleteThirdLine3;
    @FindBy(xpath = "//*[@id=\"bookmarksOutput\"]/div[1]/h3/a[1]")
    private WebElement visitSite;

    public void visitingSite(){this.visitSite.click();}
    public void deleteThirdLine(){this.deleteThirdLine3.click();}
    public void populateWebsiteName(){
        this.websiteName.sendKeys(Website_Name);
    }
    public void populateWebsiteUrl(){
        this.websiteUrl.sendKeys(VALID_URL);
    }
    public void submitItemUsingButton(){
        this.submitButton.click();
    }
}

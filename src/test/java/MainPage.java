import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.jq.Main;

public class MainPage extends PageObject{
    //Class constructor
    public MainPage(WebDriver driver){
        super(driver);
    }
    private final String Game_Name = "Iphone XR";
    private final String VALID_URL = "www.emag.com";


    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement  SearchField;



    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    private WebElement useingButton;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    private WebElement TodaysDeals;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    private WebElement CostumerService;

    @FindBy (xpath = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[6]/div/label/input")
    private WebElement Book;

    @FindBy (xpath = "//*[@id=\"dealImage\"]/div/div/div[2]")
    private WebElement FirstPick;

    public void First(){this.FirstPick.click();}
    public void Books(){this.Book.click();}
    public void forCostumerService(){this.CostumerService.click();}
    public void settodaysDeals(){this.TodaysDeals.click(); }
    public void searchField(){this.SearchField.sendKeys(Game_Name);}
    public void ItemUsingButton(){ this.useingButton.click(); }
}

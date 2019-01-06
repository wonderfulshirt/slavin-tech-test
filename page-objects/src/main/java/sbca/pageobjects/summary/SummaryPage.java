package sbca.pageobjects.summary;

import sbca.pageobjects.framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement header;

    public SummaryPage(WebDriver driver) {
        super(driver);
    }

}

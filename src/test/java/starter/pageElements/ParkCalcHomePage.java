package starter.pageElements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ParkCalcHomePage extends PageObject {

    @FindBy(id = "ParkingLot")
    public WebElementFacade parkingLotCbx;

    @FindBy(id = "StartingDate")
    public WebElementFacade entryDateTbx;

    @FindBy(id = "LeavingDate")
    public WebElementFacade leavingDateTbx;

    @FindBy(id = "LeavingTime")
    public WebElementFacade leavingTimeTbx;

    @FindBy(id = "StartingTime")
    public WebElementFacade entryTimeTbx;

    @FindBy(xpath = "//tbody/tr[3]/td[2]/input[4]")
    public WebElementFacade pmLeaveTimeBtn;



    @FindBy(xpath = "//body/form[1]/input[2]")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/b[1]")
    public WebElementFacade totalAmountTxt;





}

package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import starter.pageElements.ParkCalcHomePage;

public class  HomePage extends PageObject {

    ParkCalcHomePage parkCalcHomePage;


    @Step
    public void chooseParkingLot(String parkLot){

        parkCalcHomePage.parkingLotCbx.selectByVisibleText(parkLot);
    }

    @Step
    public void putEntryDate(String date){
        parkCalcHomePage.entryDateTbx.clear();
        waitABit(1000);
        parkCalcHomePage.entryDateTbx.sendKeys(date);
    }

    @Step
    public void putLeavingDate(String date){
        parkCalcHomePage.leavingDateTbx.clear();
        waitABit(1000);
        parkCalcHomePage.leavingDateTbx.sendKeys(date);
    }

    @Step
    public void putLeavingTime(String time){
        parkCalcHomePage.leavingTimeTbx.clear();
        parkCalcHomePage.leavingTimeTbx.sendKeys(time);
    }

    @Step
    public void putEntryTime(String time){
        parkCalcHomePage.entryTimeTbx.sendKeys(time);
    }

    @Step
    public void submitCalculation(){
        parkCalcHomePage.submitBtn.click();
    }

    @Step
    public void calcTime(int hours, String parkType){
        int parkCalculation = 0;
        if (parkType.equals("Valet Parking") && hours <= 5){
             parkCalculation = (hours * 12) * 100;
        } else if (parkType.equals("Valet Parking")){
            parkCalculation = (hours * 18) * 100;
        }
        else if (parkType.equals("Short-Term Parking")){
            parkCalculation = (hours * 2) * 100;
        }
        else if (parkType.equals("Economy Parking")){
            parkCalculation = (hours * 2) * 100;
        }
        String calcValue = parkCalcHomePage.totalAmountTxt.getText();
        String defObtCalcValue = calcValue.replaceAll("[^0-9]", "");
        System.out.println(calcValue);
        System.out.println(defObtCalcValue);
        Assert.assertEquals(defObtCalcValue, String.valueOf(parkCalculation));
    }

    @Step
    public void switchToPmLeavingTime(){
        parkCalcHomePage.pmLeaveTimeBtn.click();
    }

    @Step
    public void checkLeavingTimebox(){
        waitABit(2000);
        String expValue = "1:00";
        String obtValue = parkCalcHomePage.leavingTimeTbx.getValue();
        Assert.assertEquals(expValue,obtValue);
    }

}
package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;



public class ParkCalcStepDefinitions {
    @Steps
    HomePage home;

    @Given("I go to Parking cost Calculator Page")
    public void iGoToParkingCostCalculatorPage() {
        home.open();
    }


    @When("I select {string} Option")
    public void iSelectParkingLotOption(String parkLot) {
        home.chooseParkingLot(parkLot);
    }

    @And("I put the Entry date {string}")
    public void iPutTheEntryDate(String date) {
        home.putEntryDate(date);
    }

    @And("I put the Leaving date {string}")
    public void iPutTheLeavingDate(String date) {
        home.putLeavingDate(date);
    }

    @And("I put {string} into the leaving time")
    public void iPutIntoTheLeavingTime(String time) {
        home.putLeavingTime(time);
    }

    @And("I click on calculate button")
    public void iClickOnCalculateButton() {
        home.submitCalculation();
        
    }

    @And("I switch to PM time in leaving time")
    public void iSwitchToPMTimeInLeavingTime() {
        home.switchToPmLeavingTime();
    }

    @Then("I should see the right amount for {int} hour and {string} option")
    public void iShouldSeeTheRightAmountForHourAndValetParkingOption(int hours, String parkType) {
        home.calcTime(hours,parkType);
    }

    @Then("I check the Values in the leaving time")
    public void iCheckTheValuesInTheLeavingTime() {
        home.checkLeavingTimebox();
    }
}

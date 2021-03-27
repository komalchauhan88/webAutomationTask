package stepDefinitions;

import cucumber.api.java.en.Given;
import pages.LandingPage;
import pages.PersonalInformationPage;

public class UpdatePersonalInfo {

    LandingPage page = new LandingPage();
    PersonalInformationPage personalInformationPage = new PersonalInformationPage();

    @Given("^User proceeds to update the personal information$")
    public void user_proceeds_to_update_the_personal_information() throws Throwable {
        page.openMyPersonalInformation();
    }

    @Given("^User updates the (.+)$")
    public void user_updates_the_First_Name(String updatedFName) throws Throwable {
        personalInformationPage.modifyFirstName(updatedFName);

    }

    @Given("^provide the current (.+) and proceed to save the Information$")
    public void provide_the_current_password_and_proceed_to_save_the_Information(String oldPwd) throws Throwable {
        personalInformationPage.enterOldPassword(oldPwd);
        personalInformationPage.clickOnSave();
    }

}

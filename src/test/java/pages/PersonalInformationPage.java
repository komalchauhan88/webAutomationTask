package pages;

import elements.Button;
import elements.Element;
import elements.TextField;
import framework.setup.BasePage;

public class PersonalInformationPage extends BasePage {

    private TextField firstName = new TextField("firstname", Element.LocatorType.ID);

    private TextField oldPasswrd = new TextField("old_passwd", Element.LocatorType.ID);

    private Button saveButton = new Button("submitIdentity", Element.LocatorType.NAME);

    public void modifyFirstName(String updatedName) {
        firstName.clearandType(updatedName);
    }

    public void enterOldPassword(String password) {
        oldPasswrd.clearandType(password);
    }

    public void clickOnSave() {
        saveButton.click();
    }
    
}

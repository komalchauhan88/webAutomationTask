package pages;

import elements.TextField;
import elements.Button;
import elements.Element;
import framework.setup.BasePage;

public class LoginPage extends BasePage {

    private TextField username = new TextField("email", Element.LocatorType.ID);

    private TextField password = new TextField("passwd", Element.LocatorType.ID);

    private Button signIn = new Button("SubmitLogin", Element.LocatorType.ID);

    public void login(String user, String pass) {
        username.clearandType(user);
        password.clearandType(pass);
        signIn.submit();
    }

}

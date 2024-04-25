import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration extends TestBase{

    @Test
    public void registrationPositive() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        User user = new User()
                .withPlace("Hall")
                .withName("Daniel")
                .withLastName("Levinson")
                .withPosition("manager")
                .withId("2456667899")
                .withEmail("dan23" + i + "@gmail.com")
                .withPhone("56666655")
                .withLocation("חיפה");

        app.getUser().openUserForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().isLoggedSuccess());}
    @Test
    public void registrationNegative() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        User user = new User()
                .withPlace("Hall")
                .withName("Dani")
                .withLastName("Levi")
                .withPosition("manager")
                .withId("2455667899")
                .withEmail("dan23@@" + i + "@gmail.com")
                .withPhone("56766655")
                .withLocation("חיפה");

        app.getUser().openUserForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitLogin();
    }
}

package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void openUserForm(){
        wd.findElement(By.xpath("//div[@class='elementor-element elementor-element-b932704 elementor-mobile-align-center elementor-align-center elementor-widget elementor-widget-button']")).click();
    }
    public void fillRegistrationForm(User user){
type(By.id("placeName"), user.getPlace());
type(By.id("fName"), user.getName());
type(By.id("lName"), user.getLastName());
type(By.id("job"), user.getPosition());
type(By.id("identityNumber"), user.getId());
type(By.id("mail"), user.getEmail());
type(By.id("phone"), user.getPhone());
//select(By.id("placeName"), user.getLocation());
    }


    public void select(By locator, String option){
        new Select(wd.findElement(locator)).selectByValue(option);

    }
    public void submitLogin(){

        wd.findElement(By.id("submit")).submit();
    }
    public boolean isLoggedSuccess(){

        return isElementPresent(By.id("btnSendPhoneNumber"));
    }
}

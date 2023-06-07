package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegisterPage;
import utils.DriverUtils;



public class RegisterTest {
    public RegisterTest() {
    }

//    @BeforeClass
//    public void setup() {
//        DriverUtils.initializeDriver();
//    }


    @Test(priority = 1)
    public void RegisterPageTest() throws InterruptedException {
        DriverUtils.initializeDriver();
        RegisterPage register = new RegisterPage();
        String[] strings1 = new String[4];
        strings1 = register.getting_registered();

        Assert.assertEquals(strings1[0],"ACCOUNT CREATED!");
        Assert.assertEquals(strings1[1],"Logged in as Md. Mukit");

        Assert.assertEquals(strings1[2],"Nikunjo-2");

        Assert.assertEquals(strings1[3],"Congratulations! Your order has been confirmed!");



        // Add assertions and further test steps
    }


}

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

    @BeforeClass
    public void setup() {
        DriverUtils.initializeDriver();
    }


    @Test
    public void RegisterPageTest() throws InterruptedException {
        RegisterPage register = new RegisterPage();
        String[] strings1 = new String[2];
        strings1 = register.getting_registered();





        Assert.assertEquals(strings1[0],"ACCOUNT CREATED!");
        Assert.assertEquals(strings1[1],"Logged in as Md. Mukit");



        // Add assertions and further test steps
    }







}

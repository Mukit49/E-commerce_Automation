package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverUtils;

public class LoginTest {
    @BeforeMethod
    public void setup() {
        DriverUtils.initializeDriver();
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();

        System.out.println("Mukit");


        // Add assertions and further test steps
    }

    @Test
    public void HomePage(){

        LoginPage loginPage = new LoginPage();

        String final_name = loginPage.getHomePage();

        Assert.assertEquals(final_name,"Home");


    }

    @Test
    public void addItemTest()  {

        LoginPage loginPage = new LoginPage();
        String success_txt_final = loginPage.add_product_in_cart();

        Assert.assertEquals(success_txt_final,"Your product has been added to cart.");

    }

    public void cartPageTest()  {

        LoginPage loginPage = new LoginPage();

        String cart_page_verify = loginPage.view_shopping_cart_page();

        Assert.assertEquals(cart_page_verify,"Shopping Cart");

    }

    @AfterMethod
    public void cleanup() {
        DriverUtils.quitDriver();
    }
}

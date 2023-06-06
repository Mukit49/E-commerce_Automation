package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class LoginPage extends BasePage {


    private WebElement usernameInput;

    WebElement homepage = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));


    // adding element to cart

    WebElement cart_btn_of_an_item = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a"));

    WebElement item_added_success_txt = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]"));

    // continue shopping button

    WebElement continue_shopping_btn  = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));


    //cart button
   WebElement cart_btn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));

    //shopping cart page verify










    public void enterUsername(String username) {
        System.out.println("Sabbir");
    }

    public String getHomePage(){
        String homepageString = homepage.getText();
        //System.out.println(homepageString);


        return homepageString;
    }

    public String  add_product_in_cart()  {
       // Thread.sleep(8000);
        cart_btn_of_an_item.click();

        //Thread.sleep(2000);

        String success_txt = item_added_success_txt.getText();

        //System.out.println(success_txt);

        return  success_txt;

    }

    public  String  view_shopping_cart_page()  {
        cart_btn_of_an_item.click();
        //sleep(2000);
        continue_shopping_btn.click();
        cart_btn.click();

        //sleep(8000);

        WebElement shopping_cart_txt = driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]"));

        String get_shopping_cart_page_txt = shopping_cart_txt.getText();
        return get_shopping_cart_page_txt;


    }


}

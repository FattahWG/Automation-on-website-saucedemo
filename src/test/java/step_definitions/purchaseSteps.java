package step_definitions;

import com.example.pageObject.inventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class purchaseSteps {
    private WebDriver webDriver;
    public purchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        Thread.sleep(3000);
        InventoryPage.sortProduct(sortProduct);
    }
    @Then("User click Test.allTheThings T-Shirt Red and Sauce Labs Onesie")
    public void selectitem(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.clickProduct1();
        InventoryPage.clickProduct2();
    }
    @Then("User click shopping chart icon")
    public void shoppingChart(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.ShopChart();
    }
    @Then("User remove top item in list shopping chart")
    public void RemoveItem1(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.removeitem1();
    }
    @And("User checkout the item")
    public void checkout(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.CO();
    }

    @Then("User input \"(.*)\" as setFirstname and \"(.*)\" as setLastname and \"(.*)\" as setPostalcode")
    public void inputCredential(String FirstName, String LastName, String PostalCode){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.setFirstname(FirstName);
        InventoryPage.setLastname(LastName);
        InventoryPage.setPostalcode(PostalCode);
    }
    @And("User click continue")
    public void continueCheckout(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Continue();
    }

    @Then("User will see \"(.*)\" as expected Item total")
    public void ExpectedItemTotal(String ExpectedItemtotal){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Itemtotal();
        Assert.assertEquals(ExpectedItemtotal, InventoryPage.Itemtotal());
    }

    @And("\"(.*)\" as expected Tax")
    public void ExpectedTAX(String Expectedtax){
        inventoryPage InvetoryPage = new inventoryPage(webDriver);
        InvetoryPage.Tax();
        Assert.assertEquals(Expectedtax, InvetoryPage.Tax());
    }
    @And("\"(.*)\" as expected Total")
    public void ExpectedTotal(String expectedtotal){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Total();
        Assert.assertEquals(expectedtotal, InventoryPage.Total());
    }
    @Then("User click Finish")
    public void Finish(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.FINISH();
    }
    @Then("User will see \"(.*)\" as finishing")
    public void done(String succes){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Succes();
        Assert.assertEquals(succes, InventoryPage.Succes());
    }

}

package POM;

import BaseClass.BaseClass;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;


import static org.junit.Assert.assertEquals;


public class Seleniumeasy extends Hooks {

    private final BaseClass base;

    public Seleniumeasy(BaseClass base) {
        this.base = base;
    }

    static By elemBtn = By.xpath("//div[@class=\"category-cards\"]/div[1]");
    static By webTable = By.cssSelector(":nth-child(1) > .element-list > .menu-list > #item-3");
    static By addBtn = By.cssSelector("[class=\"btn btn-primary\"]");
    static By firstName = By.cssSelector("#firstName");
    static By lastName = By.cssSelector("#lastName");
    static By email = By.cssSelector("#userEmail");
    static By id = By.id("age");
    static By salary = By.cssSelector("#salary");
    static By department = By.cssSelector("#department");
    static By submit = By.id("submit");
    static By assertName = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(1)");
    static By asserLastName = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(2)");
    static By assertAge = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(3)");
    static By assertEmail = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(4)");
    static By assertSalary = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(5)");
    static By assertDepartment = By.cssSelector(":nth-child(4) > .rt-tr > :nth-child(6)");
    static By assertFirstName = By.cssSelector("div.rt-tbody>div:nth-child(2)>div>div:nth-child(1)");
    static By edit = By.id("edit-record-2");
    static By deleting = By.cssSelector("#delete-record-4 > svg > path");
    static By regForm = By.cssSelector("[class=\"modal-content\"]");
    static By givenW = By.cssSelector("[class=\"main-header\"]");


    public static void visit() {
        driver.get("https://demoqa.com/webtables");
    }

    public static void elementsBtn() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(elemBtn);
        driver.findElement(elemBtn).click();

    }

    public static void webTables() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(webTable);
        driver.findElement(webTable).click();
    }

    public static void addRecord() {

        driver.findElement(addBtn).click();

    }

    public static void RegistrationForm() {
        assertEquals(true, driver.findElement(regForm).isDisplayed());
    }

    public static void firstNameInput(String firstname) {

        driver.findElement(firstName).sendKeys(firstname);
    }

    public static void lastNameInput(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
    }

    public static void typeEmail(String email123) {

        driver.findElement(email).sendKeys(email123);
    }

    public static void typeAge(String sixteen) {

        driver.findElement(id).sendKeys(sixteen);
    }

    public static void typeSalary(String salary1) {

        driver.findElement(salary).sendKeys(salary1);
    }


    public static void typeDepartment(String department1) {

        driver.findElement(department).sendKeys(department1);
    }


    public static void clickSubmitBtn() {
        driver.findElement(submit).click();
    }

    public static void assertText() {
        assertEquals("Web Tables", driver.findElement(givenW).getText());
    }

    public static void assertElementHasText() {
        assertEquals(true, driver.findElement(assertName).getText());
    }

    public static void assertLastName() {
        assertEquals("Khachatryan", driver.findElement(asserLastName).getText());
    }

    public static void assertYourAge() {
        assertEquals("16", driver.findElement(assertAge).getText());
    }

    public static void assertEmailText() {
        assertEquals("tesvan123@gmail.com", driver.findElement(assertEmail).getText());
    }

    public static void assertSalaryText() {
        assertEquals("200000", driver.findElement(assertSalary).getText());
    }

    public static void assertDepatmentText() {
        assertEquals("aaaaaaaaaaaaaaa", driver.findElement(assertDepartment).getText());
    }

    public static void assertEditingName() {
        assertEquals("Alden", driver.findElement(assertFirstName).getText());

    }

    public static void clickEdit() {
        driver.findElement(edit).click();
    }

    public static void clearName() {
        driver.findElement(firstName).clear();
    }

    public static void newName(String newName1) {
        driver.findElement(firstName).sendKeys(newName1);
    }

    public static void assertEditedName() {
        //  WebDriverWait wait = new WebDriverWait(driver, 5L);
        //   wait.until(ExpectedConditions.textToBe(assertFirstName1, "Tesvan"));

//        driver.findElement(assertFirstName1);

        assertEquals("Tesvan", driver.findElement(assertFirstName).getText());
    }

    public static void deleteRecord() {

        driver.findElement(deleting).click();
    }


}



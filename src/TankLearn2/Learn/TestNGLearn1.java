package TankLearn2.Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGLearn1 {
	static WebDriver driver;
  @Test
  public void f() {
	  System.out.println("this is TestNG test case");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
	  driver.quit();
  }

//  @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
//  public void testException(){
//      throw new IllegalArgumentException("NullPoint");
//  }
  
//  @Test
//  @Parameters("test1")
//  public void ParaTest(String test1){
//      System.out.println("This is " + test1);
//  }
  
//  @DataProvider(name="user")
//  public Object[][] Users(){
//      return new Object[][]{
//              {"root","passowrd"},
//              {"cnblogs.com", "tankxiao"},
//              {"tank","xiao"}
//      };
//  }
//  
//  @Test(dataProvider="user")
//  public void verifyUser(String userName, String password){
//      System.out.println("Username: "+ userName + " Password: "+ password);
//  }
  
  @Test
	public void testSelect()
	{
		driver = new FirefoxDriver();
		driver.get("D:\\workspace\\SeleniumTest\\select.html");
		
		Select selectAge = new
		Select(driver.findElement(By.id("selecttest")));
		selectAge.selectByIndex(2);
	}
  
}

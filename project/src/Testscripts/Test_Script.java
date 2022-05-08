package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.ExcelClass;
import pomscripts.PomScript;

public class Test_Script extends BaseClass
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String firstname=ExcelClass.getData("Sheet1", 0, 0);
		String lastname=ExcelClass.getData("Sheet1", 1, 0);
		String email=ExcelClass.getData("Sheet1", 2, 0);
		String mnumb=ExcelClass.getData("Sheet1", 3, 0);

		PomScript pms=new PomScript(driver);
		pms.first(firstname);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(pms.fname));
		pms.last(lastname);
		wait.until(ExpectedConditions.visibilityOf(pms.lname));
		pms.mail(email);
		wait.until(ExpectedConditions.visibilityOf(pms.email));
		pms.numb(mnumb);
		wait.until(ExpectedConditions.visibilityOf(pms.Mnumb));

	}
}

package scipts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.Base;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;
import pages.BecomeAMemberPage;
import util.ExcelSheetUtils;
import util.ScrollUtils;
import util.SwipingUtils;
import util.VisualTestUtils;

public class BecomeAMemberTest extends Base{
	@Test
	public void Test() throws EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BecomeAMemberPage memberPage = new BecomeAMemberPage(driver);
		memberPage.getBecomeAMemberButton().click();
		
		ScrollUtils scroll = new ScrollUtils(driver);
		scroll.scrollByText("Frequently Asked Questions");
		
		ExcelSheetUtils excel = new ExcelSheetUtils();
		
		for(int i=0; i<6; i++) {
			if (!memberPage.getChevron().get(i).isDisplayed()) {
				SwipingUtils.swipingLocation(2, 2, 5, 1);
				int size = memberPage.getChevron().size();
				memberPage.getChevron().get(size).click();
			}
			memberPage.getChevron().get(i).click();
			String expectedText = excel.getExcelData("FAQ", 2+i, 2);
			VisualTestUtils.textAssertion(memberPage.getfaqAnswer(), expectedText);
			memberPage.getChevron().get(i).click();
		}
	}
	
}

package ujetix.genericutilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementation  implements ITestListener {
	
	
	ExtentReports  r;
	ExtentTest test;
	

	public void onTestStart(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		 test = r.createTest(mname);
		 Reporter.log(mname+"----->TestScript Execution Started");
		
   	}

	public void onTestSuccess(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		test.log(Status.PASS, mname+"--->Passed");
		Reporter.log(mname+"TestScript Execution Successfull");
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		String name=result.getMethod().getMethodName();
		System.out.println("Listening");
		TakesScreenshot t=(TakesScreenshot) BaseClass.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		 LocalDateTime localdatetime = LocalDateTime.now();
		 String cdate = localdatetime.toString().replace(" ", "_").replace(":", "_");
		 
		 File dst=new File("screenshots/"+" "+name+" "+cdate+".png");
		 
		 try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 test.log(Status.FAIL, result.getThrowable());
		 Reporter.log("Testscript Execution failed");
		 
		 
	}

	public void onTestSkipped(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		
		test.log(Status.SKIP, mname+" --->Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log("Testscript execution skipp");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter  report=new ExtentSparkReporter("./reportex/extentreport.html");
		report.config().setDocumentTitle("Ujetix-Project");
		report.config().setTheme(Theme.STANDARD);
		report.config().setReportName("Ujetix");
		
		  r=new ExtentReports();
		r.attachReporter(report);
		r.setSystemInfo("Base-Browser", "Chrome");
		r.setSystemInfo("OS", "Windows");
		r.setSystemInfo("Base-URL", "https://localhost:8080");
		
		
		
	}

	public void onFinish(ITestContext context) {
		// consolidate the reports
		r.flush();
	}

	
	
	

}

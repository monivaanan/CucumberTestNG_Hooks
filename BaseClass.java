package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ChromeDriver driver;
	String leadID;
	String leadIDMerge;
	List<String> allhandles = new ArrayList<String>();
	List<String> allhandles2 = new ArrayList<String>();
}
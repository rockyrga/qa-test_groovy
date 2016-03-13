import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

baseUrl = "http://ec2-52-48-95-132.eu-west-1.compute.amazonaws.com"

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true

driver = { new FirefoxDriver() }

waiting {
    timeout = 5
    retryInterval = 1.0
}
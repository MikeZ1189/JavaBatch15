package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        /*WebDriver webDriver = new Safari(); // up casting
        // FireFox fireFox=new WebDriver(); down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/

        // an Array of type parent class can hold the objects of all the child classes
        WebDriver [] browsers={new Chrome(), new Safari(), new FireFox()};  // enhanced loop
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

      /*  Safari safari = new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();*/


    }
}

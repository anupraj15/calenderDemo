package Cookie;



import java.util.List;
import java.util.Set;
                                                 //flipkart
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\cjc Project\\Automation testing\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
	    driver.manage().window().maximize();
	    //number ofhyperlink 
	    List<WebElement> ls = driver.findElements(By.tagName("a"));
	    int count = ls.size();
	    System.out.println("the number of hyperlinks "+count);
	    
	    Set<Cookie> cookie1 = driver.manage().getCookies();
	    
	    int count1 = cookie1.size();
	    
	    System.out.println("the number of cookie" + +count1);
	    for(Cookie cookie: cookie1)
	    {
	    	System.out.println("the number of cookie "+ cookie.getName());
	    	System.out.println("the domain of cookie is " + cookie.getDomain());
	    	System.out.println("the class of cookie " + cookie.getClass());
	    	System.out.println("the expiry of cookie is "+ cookie.getExpiry());
	    	System.out.println("the value of cookie is  " + cookie.getValue());
	    	System.out.println("verify cookie is secure " + cookie.isSecure());
	    	System.out.println("verify http " + cookie.isHttpOnly());
	    	System.out.println("path is "+ cookie.getPath());
	    }
	    //delete cookie name
	    driver.manage().deleteCookieNamed("SN");
	    
	    //add cookies
	    Cookie cookie2 = new Cookie("webname","Anup");
	    driver.manage().addCookie(cookie2);
	    
	    //get cookie
	    
	    Cookie cookie = driver.manage().getCookieNamed("S");
	    
	    System.out.println("name of cookie "+ cookie.getName());
	
	    
	}

}

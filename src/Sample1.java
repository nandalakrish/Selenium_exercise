import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main (String[] args) {
		
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win32\\\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		
		
		
		String tobereversed = "Nandakumar", str= " ";
		
		//System.out.println(tobereversed);
		
		for(int i=tobereversed.length()-1;i>=0;i--)
		{
		str=str+ tobereversed.charAt(i);
			
			
		}
		
		System.out.println(str);
		
	}
	
	*/
		
		String n = "Nanda@kum";
		
		String k = "kumar";
		
		String i = "k";
		
		System.out.println(n.length());
		
		System.out.println(n.charAt(1));
		
		System.out.println(n.replace('n', 'm'));
		
		System.out.println(n.concat(k).concat(i));
		
		System.out.println(n.toLowerCase());
		
		System.out.println(n.contains("and"));
		
		System.out.println(n.strip());
		
		System.out.println(n.split(k));
		
		System.out.println(n.substring(0, 4));
		
		System.out.println(n.equals(k));
		
		System.out.println(n.split(n, 3));
		
		System.out.println(n.trim());
		
		StringBuffer s = new StringBuffer(n);
		
		System.out.println(s.reverse());
		
}}

package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络爬虫取链接
 * @author 南风添
 *
 */
public class WebSpiderTest {
	
	public static String getURLContent(String urlStr, String charsetName) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(urlStr);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charsetName)));
			
			String temp = "";
			while((temp = reader.readLine()) != null) {
				sb.append(temp);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String destStr = getURLContent("http://www.163.com", "gbk");
		
		System.out.println(destStr);
		
		Pattern p1 = Pattern.compile("<a[\\s\\S]+?</a>");
		
		Pattern p2 = Pattern.compile("href=\"(.+?)\"");
		
		Matcher m = p2.matcher(destStr);
		
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.group(1));
		}
		
	}
}

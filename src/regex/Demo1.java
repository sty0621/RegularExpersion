package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		//在这个字符串中：asfsd23323，是否符合正则表达式：\w+
		
		//表达式对象
		Pattern p = Pattern.compile("\\w+");
		
		//创建Matcher对象
		Matcher m = p.matcher("asfsd23323");
		
		boolean yn = m.matches();//尝试将整个整个序列与该模式匹配
		System.out.println(m.group());
		System.out.println(m.group(0));
		boolean yn2 = m.find();//该方法扫描输入序列，查找与该模式匹配的下一个子序列
		

		
		boolean yn3 = m.find();
		
		System.out.println(yn);
		System.out.println(yn2);
		
		
		
		
		
		
		
	}
}

package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		//������ַ����У�asfsd23323���Ƿ����������ʽ��\w+
		
		//���ʽ����
		Pattern p = Pattern.compile("\\w+");
		
		//����Matcher����
		Matcher m = p.matcher("asfsd23323");
		
		boolean yn = m.matches();//���Խ����������������ģʽƥ��
		System.out.println(m.group());
		System.out.println(m.group(0));
		boolean yn2 = m.find();//�÷���ɨ���������У��������ģʽƥ�����һ��������
		

		
		boolean yn3 = m.find();
		
		System.out.println(yn);
		System.out.println(yn2);
		
		
		
		
		
		
		
	}
}

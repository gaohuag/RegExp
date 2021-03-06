import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		//简单认识正则表达式的概念

//		p("abc".matches("..."));
//		//java中一个反斜杠表示转义，所以正则表达式的反斜杠必须是2个
//		p("a8729a".replaceAll("\\d", "-"));
//		Pattern p = Pattern.compile("[a-z]{3}");
//		//Matcher 匹配器
//		Matcher m = p.matcher("fgh");
//		p(m.matches());
//		p("fgha".matches("[a-z]{3}"));

		
		//初步认识. * + ?
//		p("a".matches("."));
//		p("aa".matches("aa"));
//		//* 0个或者多个
//		p("aaaa".matches("a*"));
//		//+ 1个或多个
//		p("aaaa".matches("a+"));
//		p("".matches("a*"));
//		p("aaaa".matches("a?"));
//		p("".matches("a?"));
//		p("a".matches("a?"));
//		p("214523145234532".matches("\\d{3,100}"));
//		p("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
//		p("192".matches("[0-2][0-9][0-9]"));

		
		//范围
//		p("a".matches("[abc]"));
//		p("a".matches("[^abc]"));
//		p("A".matches("[a-zA-Z]"));
//		p("A".matches("[a-z]|[A-Z]"));
//		p("A".matches("[a-z[A-Z]]"));
//		p("R".matches("[A-Z&&[RFG]]"));

		//认识\s \w \d \
//		p(" \n\r\t".matches("\\s{4}"));
//		p("  ".matches("\\S"));
//		p("a_8".matches("\\w{3}"));
//		p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
//		//匹配一个反斜线 需要4个反斜线
//		p("\\".matches("\\\\"));

		//POSIX Style
//		p("a".matches("\\p{Lower}"));
		
		//boundary
//		p("hello sir".matches("^h.*"));
//		p("hello sir".matches(".*ir$"));
//		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
//		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
		//whilte lines
//		p(" \n".matches("^[\\s&&[^\\n]]+\\n$"));
//
//		p("aaa 8888c".matches(".*\\d{4}."));
//		p("aaa 8888c".matches(".*\\b\\d{4}."));
//		p("aaa8888c".matches(".*\\d{4}."));
//		p("aaa8888c".matches(".*\\b\\d{4}."));

		//email
		//p("asdfasdfsafsf@dsdfsdf.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matches find lookingAt
//		Pattern p = Pattern.compile("\\d{3,5}");
//		String s = "123-34345-234-00";
//		Matcher m = p.matcher(s);
//		//matches是匹配整个字符串
//		p(m.matches());
//		//吃掉的字符串吐出来
//		m.reset();
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
////		p(m.start() + "-" + m.end());
//		//从开始位置找
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());

		//replacement
		//替换字符串中的java 第单数个java全部大写 双数个java小写
//		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava afasdfasdf");
//		StringBuffer buf = new StringBuffer();
//		int i=0;
//		while(m.find()) {
//			i++;
//			if(i%2 == 0) {
//				m.appendReplacement(buf, "java");
//			} else {
//				m.appendReplacement(buf, "JAVA");
//			}
//		}
//		m.appendTail(buf);
//		p(buf);

		//group
//		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
//		String s = "123aa-34345bb-234cc-00";
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			p(m.group());
//		}

		//qulifiers 修定词
		//贪婪 greedy
		//reluctant
//		Pattern p = Pattern.compile(".{3,10}+[0-9]");
//		String s = "aaaa5bbbb68";
//		Matcher m = p.matcher(s);
//		if(m.find())
//			p(m.start() + "-" + m.end());
//		else
//			p("not match!");

		//non-capturing groups (?=x)
//		Pattern p = Pattern.compile(".{3}(?=a)");
//		String s = "444a66b";
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			p(m.group());
//		}

		//back refenrences 向前引用 \2表示和第二个括号里面的内容一样
//		Pattern p = Pattern.compile("(\\d(\\d))\\2");
//		String s = "122";
//		Matcher m = p.matcher(s);
//		p(m.matches());

		//flags的简写 标志位
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("JaVar");
		p(m.find());
		p("Java".matches("(?i)(java)"));
	}
	
	public static void p(Object o) {
		System.out.println(o);
	}

}

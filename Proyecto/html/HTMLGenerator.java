package html;
public class HTMLGenerator {
	public static void main(String[]args) {
		System.out.print(createHeader("Pato"));
	}
	public static String createTitle(String title) {
		String html="<head>\n<title>"+title+"</title>\n</head>";
		return html;
	}
	public static String createHeader(String header) {
		String html="<head>\n<header>"+header+"</header>\n</head>";
		return html;
	}
	
}

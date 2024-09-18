package html;
public class HTMLGenerator {
	public static void main(String[]args) {
		System.out.print(createTitle("Pato"));
	}
	public static String createTitle(String title) {
		String html="<head>\n<title>"+title+"</title>\n</head>";
		return html;
	}
}

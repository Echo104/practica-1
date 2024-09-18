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
	public static String createParagraph(String text) {
		String html="<body>\n<p>"+text+"</p>\n</body>";
		return html;
	}
	public static String createLink(String url, String linkText) {
       	        return "<a href=\"" + url + "\">" + linkText + "</a>\n";
    }
}

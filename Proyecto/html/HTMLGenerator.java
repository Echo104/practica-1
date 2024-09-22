package html;
public class HTMLGenerator {
	public static void main(String[]args) {
		String[]lista=new String[3];
		String html="";
		lista[0]="Pato";
		lista[1]="Perro";
		lista[2]="Gato";
		
		html+=createHeader("Pato");
		html+=createList(lista,true);
		html+=createParagraph("ANRJASDHAJFJKAFHjhfajdhfjadfkjadf");
		html+=createLink("https://www.google.com/","Google");
		html+=createTitle("Pagina");
		System.out.print(html);
	}
	public static String createTitle(String title) {
		String html="<head>\n<title>"+title+"</title>\n</head>\n";
		return html;
	}
	public static String createHeader(String header) {
		String html="<head>\n<header>"+header+"</header>\n</head>\n";
		return html;
	}
	public static String createParagraph(String text) {
		String html="<body>\n<p>"+text+"</p>\n</body>\n";
		return html;
	}
	public static String createLink(String url, String linkText) {
       	 return "<body>\n<a href=\"" + url + "\">" + linkText + "</a>\n</body>\n";
    }
	public static String createList(String[] lista, boolean ordenada){
		String html="<body>\n";
		if(ordenada==true)  html+="<ol>";
		else html+="<ul>";
		for(int i=0;i<lista.length;i++) {
			html+="\n<li>"+lista[i]+"</li>";
		}
		if(ordenada==true)  html+="\n</ol>";
		else html+="\n</ul>";
		html+="\n</body>\n";
		return html;
	}
}

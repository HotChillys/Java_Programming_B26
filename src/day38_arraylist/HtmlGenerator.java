package day38_arraylist;

public class HtmlGenerator {
    /*
    Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
     */
    public static void main(String[] args) {
        System.out.println(htmlGenerate("li^3"));
        System.out.println(htmlGenerate("div^6"));
        System.out.println(htmlGenerate("ul^4"));
    }
    public static String htmlGenerate(String str){
        String [] parts = str.split("\\^"); // or --> str.replace("^", " ").split(" ");
        String html = "";
        int repeat = Integer.parseInt(parts[1]);
        for (int i = 0; i < repeat; i++) {
            html += "<" + parts[0] + "></" + parts[0] + "> ";
        }
        return html;
    }
}

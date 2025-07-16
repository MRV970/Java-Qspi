package Method_Overloading;

public class Telegram {
public static void send() {
	System.out.println("no argument method");
}
public static String send(String sms) {
	System.out.println("sending sms "+sms);
	return sms;
}
public static long send(long number) {
	System.out.println("sending number "+number);
return number;
}
public static String send(String link,String doc) {
	System.out.println("sending link "+link);
	System.out.println("sending document "+doc);
	return link;

}
public static void main(String args []) {
	send ();
	send("-->>TQ");
	send(123434345454l);
	send("--->>www.study.com","-->>groups syllabus");
}
}
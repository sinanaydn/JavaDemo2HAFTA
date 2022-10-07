package polyorphizimDemo;

public class MailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("logged to mail "+ message);
	}
}

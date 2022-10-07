package polyorphizimDemo;

public class Main {

	public static void main(String[] args) {
		
//		BaseLogger [] loggers =new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new MailLogger()};
//		
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.log("log mesajı");
//		}
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}

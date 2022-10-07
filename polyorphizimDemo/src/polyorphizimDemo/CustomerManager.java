package polyorphizimDemo;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("müşteri eklendi");
		baseLogger.log("log mesajı");
	}
}

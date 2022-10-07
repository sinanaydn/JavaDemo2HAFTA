package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		customerManager.baseDataBaseManager=new OracleDataBaseManager();
		customerManager.baseDataBaseManager=new MySqlDatabaseManager();
		customerManager.getCustomers();
		
		

	}

}

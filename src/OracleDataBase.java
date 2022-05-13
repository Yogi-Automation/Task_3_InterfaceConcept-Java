
public class OracleDataBase implements DatabaseConnector,DatabaseStatus {

	@Override
	public void connectToDataBase() {
		System.out.println("This is Oracle data base");

		
	}

	@Override
	public void myDatabaseStatus() {
		System.out.println("Status Working 100 %");
		      
	}

}

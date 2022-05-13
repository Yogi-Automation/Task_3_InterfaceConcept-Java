
public class DatabaseConnectionTester {
	public static void main(String[] args) {
	OracleDataBase objOracle = new OracleDataBase();
	objOracle.connectToDataBase();
	objOracle.myDatabaseStatus();
	MongoDataBase objMongo = new MongoDataBase();
	objMongo.connectToDataBase();
	SqlServerDataBase objSql = new SqlServerDataBase();
	objSql.connectToDataBase();
}
}
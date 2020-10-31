
import java.util.*;
 
import com.mongodb.*;
 

public class FirstExample {
public static void main(String[] args)throws Exception {
	/*Without Using URI*/
 /* MongoClient mongoClient = new MongoClient("localhost"); */
	
	/*Using URI*/
	String dbURI = "mongodb://localhost";
	MongoClientURI mcri=new MongoClientURI(dbURI);
	MongoClient mongoClient = new MongoClient(mcri);

	List<String> databases = mongoClient.getDatabaseNames();
for (String dbName : databases) {
System.out.println("- Database: " + dbName);




DB db = mongoClient.getDB(dbName);
Set<String> collections = db.getCollectionNames();
for (String colName : collections) {
System.out.println("\t + Collection: " + colName);
}



}
mongoClient.close();
}
}
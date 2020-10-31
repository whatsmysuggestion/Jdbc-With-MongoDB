
import com.mongodb.*;


public class FirstExample3 {
public static void main(String[] args)throws Exception {

	String dbURI = "mongodb://localhost";
	MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
	
	DB db=mongoClient.getDB("mubeen");
	
	DBCollection collection=db.getCollection("students");
	
	DBCursor dbc=collection.find();
	
	while(dbc.hasNext())
	{
		System.out.println(dbc.next());
	}
	
	
 
	
	mongoClient.close();
}
}
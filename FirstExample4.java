
import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;

import com.mongodb.*;


public class FirstExample4 {
public static void main(String[] args)throws Exception {

	String dbURI = "mongodb://localhost";
	MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
	DB db=mongoClient.getDB("mubeen");
	DBCollection collection=db.getCollection("students");

		
		
		
		
		  
		/*
		 * BasicDBObject document = new BasicDBObject(); document.put("no", 7);
		 * 
		 * 
		 * collection.remove(document);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * DBObject doc = collection.findOne(); //get first document
		 * collection.remove(doc);
		 */
		 
		  
		  	collection.drop();
		 
	
	mongoClient.close();
}
}
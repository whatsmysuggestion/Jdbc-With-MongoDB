
import com.mongodb.*;
public class FirstExample2 {
public static void main(String[] args)throws Exception {
	String dbURI = "mongodb://localhost";
	MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
	
	
	DB db=mongoClient.getDB("mubeen");
	DBCollection collection=db.getCollection("students");
	
	
	//{"name":"mahendra","no":007,"address":"andhra"}
	BasicDBObject obj=new BasicDBObject();
	obj.put("name", "mahendra");
	obj.put("no", new Integer(007));
	obj.put("address", "andhra");
	
	collection.insert(obj);	
	mongoClient.close();
}
}
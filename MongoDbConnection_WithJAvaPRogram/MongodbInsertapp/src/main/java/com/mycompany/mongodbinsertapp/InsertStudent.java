import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class InsertStudent {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Connect to database "noor"
            MongoDatabase database = mongoClient.getDatabase("mustafaa");

            // Get the collection "employe"
            MongoCollection<Document> collection = database.getCollection("empl");

            // Create a new document (record)
            Document employee = new Document("Name", "Noor_Mustafaa")
                                     .append("Caste", "Rajpar")
                                     .append("designation", "Java Developer");

            // Insert the document into the collection
            collection.insertOne(employee);

            System.out.println(" Empinserted successfully");
        } catch (Exception e) {
            System.err.println(" Error: " + e.getMessage());
        }
    }
}

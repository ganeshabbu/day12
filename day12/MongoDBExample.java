package day12;

public class MongoDBExample {

	public static void main(String[] args) {
        // Step 1: Connect to MongoDB server (local or remote)
        String uri = "mongodb://localhost:27017"; // Replace with your MongoDB URI
        MongoClient mongoClient = MongoClients.create(uri);

        // Step 2: Get database and collection
        MongoDatabase database = mongoClient.getDatabase("practiceDB");
        MongoCollection<Document> collection = database.getCollection("users");

        // Step 3: Create/Insert a document
        Document user = new Document("name", "Alice")
                .append("age", 25)
                .append("email", "alice@example.com");

        collection.insertOne(user);
        System.out.println("Inserted: " + user.toJson());

        // Step 4: Read documents
        FindIterable<Document> allUsers = collection.find();
        System.out.println("All users:");
        for (Document doc : allUsers) {
            System.out.println(doc.toJson());
        }

        // Step 5: Update a document
        collection.updateOne(new Document("name", "Alice"),
                new Document("$set", new Document("age", 26)));
        System.out.println("Updated Alice's age.");

        // Step 6: Delete a document
        collection.deleteOne(new Document("name", "Alice"));
        System.out.println("Deleted Alice.");

        // Close connection
        mongoClient.close();


	}

}

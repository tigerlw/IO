package com.ucloudlink.mongodb;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.BSONTimestamp;

import com.mongodb.CursorType;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;

public class OplogMain 
{
	public static void main(String args[])
	{
		String uri = "mongodb://127.0.0.1:28013";
		
		MongoClientURI mongoClientURI = new MongoClientURI(uri);
		
		MongoClient mongoClient = new MongoClient(mongoClientURI);
		
		MongoDatabase db = mongoClient.getDatabase("local");
		
		MongoCollection<Document> oplog = db.getCollection("oplog.rs");
		
		Bson query = Filters.and(
	            Filters.exists("fromMigrate", false),
	            Filters.gt("ts", new BSONTimestamp(1524790800, 2)),
	            Filters.or(
	                    Filters.eq("op", "i"),
	                    Filters.eq("op", "u"),
	                    Filters.eq("op", "d")
	            ),
	            Filters.eq("ns", db)
	    );
		
		FindIterable<Document> documents = oplog.find(query)
	            .sort(new Document("$natural", 1))
	            .skip(0 * 100)
	            .limit(100)
	            .projection(Projections.include("ts", "op", "ns", "o"))
	            .cursorType(CursorType.TailableAwait);
		
		for (Document document : documents)
		{
			System.out.println(document.toString());
		}
		
	}
		
	

}

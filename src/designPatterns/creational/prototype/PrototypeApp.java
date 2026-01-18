package designPatterns.creational.prototype;

import java.util.Arrays;

// Create new objects by cloning existing ones instead of constructing them from scratch.

public class PrototypeApp {
    public static void main(String[] args){
        Document doc = new Document("Design Patterns", "Explanation for Prototype Pattern", Arrays.asList("Great", "Wow"));
        Document doc1 = doc.clone();
        doc1.addComment("Super");
        System.out.println(doc);
        System.out.println(doc1);
    }
}

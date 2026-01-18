package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Document {
    String title;
    String content;
    List<String> comments;
    public Document(String title, String content, List<String> comments){
        this.title = title;
        this.content = content;
        this.comments = new ArrayList<>(comments);
    }
    public Document clone(){
        return new Document(this.title, this.content, new ArrayList<>(this.comments));
    }
    public void addComment(String comment){
        comments.add(comment);
    }
    @Override
    public String toString() {
        return "Document [title=" + title +
                ", content=" + content +
                ", comments=" + comments + "]";
    }
}

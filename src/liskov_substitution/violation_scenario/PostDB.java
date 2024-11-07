package liskov_substitution.violation_scenario;

public class PostDB {

    public void addPost(String post) {
        System.out.println("Added post: " + post + " to post table.");
    }

    public void addTagPost(String post) {
        System.out.println("Added post: " + post + "  to tag post table.");
    }

    public void addMentionPost(String post) {
        System.out.println("Added post : " + post + " to mention post table.");
    }
}

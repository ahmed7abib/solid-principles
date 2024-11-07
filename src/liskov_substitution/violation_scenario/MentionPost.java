package liskov_substitution.violation_scenario;

public class MentionPost extends Post {

    public void createMentionPost(PostDB db, String post) {
        db.addMentionPost(post);
    }
}

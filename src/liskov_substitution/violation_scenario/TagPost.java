package liskov_substitution.violation_scenario;

public class TagPost extends Post {

    public void createTagPost(PostDB db, String post) {
        db.addTagPost(post);
    }
}

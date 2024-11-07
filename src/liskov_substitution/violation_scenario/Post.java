package liskov_substitution.violation_scenario;

public class Post {

    public void createPost(PostDB db, String post) {
        db.addPost(post);
    }
}

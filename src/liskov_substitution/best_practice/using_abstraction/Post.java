package liskov_substitution.best_practice.using_abstraction;

import liskov_substitution.violation_scenario.PostDB;

public class Post implements IPost {

    @Override
    public void createPost(PostDB db, String post) {
        db.addPost(post);
    }
}

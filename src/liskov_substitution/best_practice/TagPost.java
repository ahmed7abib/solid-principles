package liskov_substitution.best_practice;

import liskov_substitution.violation_scenario.PostDB;

public class TagPost implements IPost {

    @Override
    public void createPost(PostDB db, String post) {
        db.addTagPost(post);
    }
}

package liskov_substitution.best_practice.using_inheritance;

import liskov_substitution.violation_scenario.PostDB;

public class TagPost extends Post {

    @Override
    public void createPost(PostDB db, String post) {
        db.addTagPost(post);
    }
}

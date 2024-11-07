package liskov_substitution.best_practice.using_inheritance;

import liskov_substitution.violation_scenario.PostDB;

public class MentionPost extends Post {

    @Override
    public void createPost(PostDB db, String post) {
        db.addMentionPost(post);
    }
}

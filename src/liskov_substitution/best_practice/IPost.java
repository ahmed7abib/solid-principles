package liskov_substitution.best_practice;

import liskov_substitution.violation_scenario.PostDB;

public interface IPost {
    void createPost(PostDB db, String post);
}

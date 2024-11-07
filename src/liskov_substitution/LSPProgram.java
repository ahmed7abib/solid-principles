package liskov_substitution;

import liskov_substitution.best_practice.IPost;
import liskov_substitution.violation_scenario.MentionPost;
import liskov_substitution.violation_scenario.Post;
import liskov_substitution.violation_scenario.PostDB;
import liskov_substitution.violation_scenario.TagPost;

import java.util.ArrayList;
import java.util.List;

public class LSPProgram {

    public static void LSPDemo() {

        System.out.println("------- VIOLATION EXAMPLE -----------\n");

        PostDB db = new PostDB();
        List<String> posts = new ArrayList<>();

        posts.add("POST");
        posts.add("#POST");
        posts.add("@POST");

        Post post;

        for (String p : posts) {
            if (p.startsWith("#")) {
                post = new TagPost();
            } else if (p.startsWith("@")) {
                post = new MentionPost();
            } else {
                post = new Post();
            }

            post.createPost(db, p);
        }

        System.out.println("\n------- BEST PRACTICE EXAMPLE -----------\n");

        PostDB db2 = new PostDB();
        List<String> posts2 = new ArrayList<>();

        posts2.add("POST");
        posts2.add("#POST");
        posts2.add("@POST");

        IPost ipost;

        for (String p : posts2) {
            if (p.startsWith("#")) {
                ipost = new liskov_substitution.best_practice.TagPost();
            } else if (p.startsWith("@")) {
                ipost = new liskov_substitution.best_practice.MentionPost();
            } else {
                ipost = new liskov_substitution.best_practice.Post();
            }

            ipost.createPost(db2, p);
        }
    }
}

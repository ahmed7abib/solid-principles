package liskov_substitution;

import liskov_substitution.best_practice.using_abstraction.IPost;
import liskov_substitution.violation_scenario.MentionPost;
import liskov_substitution.violation_scenario.Post;
import liskov_substitution.violation_scenario.PostDB;
import liskov_substitution.violation_scenario.TagPost;

import java.util.ArrayList;
import java.util.List;

public class LSPProgram {

    public static void lspViolationDemo() {

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
    }

    public static void lspBestPracticeWithInheritance() {

        System.out.println("\n------- BEST PRACTICE EXAMPLE USING INHERITANCE -----------\n");

        PostDB db = new PostDB();
        List<String> posts = new ArrayList<>();

        posts.add("POST");
        posts.add("#POST");
        posts.add("@POST");

        liskov_substitution.best_practice.using_inheritance.Post post3;

        for (String p : posts) {
            if (p.startsWith("#")) {
                post3 = new liskov_substitution.best_practice.using_inheritance.TagPost();
            } else if (p.startsWith("@")) {
                post3 = new liskov_substitution.best_practice.using_inheritance.MentionPost();
            } else {
                post3 = new liskov_substitution.best_practice.using_inheritance.Post();
            }

            post3.createPost(db, p);
        }
    }

    public static void lspBestPracticeWithAbstraction() {
        System.out.println("\n------- BEST PRACTICE EXAMPLE USING Abstraction -----------\n");

        PostDB db = new PostDB();
        List<String> posts = new ArrayList<>();

        posts.add("POST");
        posts.add("#POST");
        posts.add("@POST");

        IPost ipost;

        for (String p : posts) {
            if (p.startsWith("#")) {
                ipost = new liskov_substitution.best_practice.using_abstraction.TagPost();
            } else if (p.startsWith("@")) {
                ipost = new liskov_substitution.best_practice.using_abstraction.MentionPost();
            } else {
                ipost = new liskov_substitution.best_practice.using_abstraction.Post();
            }

            ipost.createPost(db, p);
        }
    }
}

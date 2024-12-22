import SMP.User;
import SMP.Post;
import SMP.SocialMedia;


public class Main {

    public static void main(String[] args) {
        /*
         The Basic Structure is that we have User, Post and SocialMedia classes
         IDs of users and posts can't be modified or set, they are given automatically by ID generator
         The SocialMedia class, in addition to its name, also has 2 arrays that store all users and all posts
        */

        User grisha = new User("Grisha", "Male");
        Post post_1 = new Post(grisha.getUserID(), "Students scholarship in AITU", "Guys WHERE is our scholarship MONEY!!!");

        User sabina = new User("Sabina", "Female");
        Post post_2 = new Post(sabina.getUserID(), "I know where is our scholarship!", "LOL NO, idk where is our scholarship money, go to work!");


        SocialMedia telegram = new SocialMedia("Telegram");

        telegram.addUser(grisha);
        telegram.addPost(post_1);

        telegram.addUser(sabina);
        telegram.addPost(post_2);

        System.out.println(telegram);
        System.out.println(grisha);
        System.out.println(post_1);
        System.out.println(telegram.getPosts());
    }

}

package SMP;

import java.util.ArrayList;

public class SocialMedia {
    private String platformName;
    private final ArrayList<Post> posts;
    private final ArrayList<User> users;

    // Constructor of a class
    public SocialMedia(String platformName) {
        this.platformName = platformName;
        this.posts = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // All setters and getters
    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    // toString for fancy output
    @Override
    public String toString() {
        return "SocialMedia{" + "platformName='" + platformName + "', posts=" + posts + ",users =" + users + "}";
    }
}

package SMP;

public class Post {
    private static int genId = 0; // Auto ID generator
    private int postID;
    private String postTitle;
    private final int postAuthorID;
    private String postContent;

    // Constructor of a class
    public Post(int postAuthorID, String postTitle, String postContent) {
        this.postID = genId++;
        this.postTitle = postTitle;
        this.postAuthorID = postAuthorID;
        this.postContent = postContent;
    }

    // All setters and getters
    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public int getPostAuthorID() {
        return postAuthorID;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    // toString for fancy output
    @Override
    public String toString() {
        return "Post {postID=" + postID + ", postTitle='" + postTitle + "', postAuthorID=" + postAuthorID + ", postContent='" + postContent + "'}";
    }
}

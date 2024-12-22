package SMP;

public class User {
    private String name;
    private static int genId = 0; // Auto ID generator
    private final int userID;
    private String gender;

    // Constructor of a class
    public User(String name, String gender) {
        this.name = name;
        this.userID = genId++;
        this.gender = gender;
    }

    // All setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString for fancy output
    @Override
    public String toString() {
        return "User {name='" + name + "', userID=" + userID + ", gender='" + gender + "'}";
    }
}

public class User {
    private  String name;
    private String SurName;

    public User(String name, String surName) {
        this.name = name;
        SurName = surName;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", SurName='" + SurName + '\'' +
                '}';
    }
}

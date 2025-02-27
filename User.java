package genericClasses;

public class User extends BaseEntity {
    private String name;

    public User(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{id=" + getId() + ", name='" + name + "'}";
    }
}

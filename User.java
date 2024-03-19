public abstract class User implements Notifier {
    @Override
    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }


    private String name;
    private int phoneNumber;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User(String name, String phoneNumber, String email) {
        this.name = name;
    }
}

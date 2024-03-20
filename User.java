public class User implements Notifier {



    private String name;
    private String phoneNumber;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }

}

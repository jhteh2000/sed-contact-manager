package contacts;

public class Email extends ContactInfo implements TextMessageEnabled {
    private final String emailAddress;

    public Email(String address) {
        emailAddress = address;
    }

    @Override
    public void sendTextMessage(String msg) {
        System.out.println(msg + " " + emailAddress);
    }

    @Override
    public void sendMessage(String msg) {
        sendTextMessage(msg);
    }

    @Override
    public String contactInfo() {
        return emailAddress;
    }

    @Override
    public String contactInfoType() {
        return "email";
    }
}

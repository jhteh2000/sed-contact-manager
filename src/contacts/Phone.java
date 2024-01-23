package contacts;

public class Phone extends ContactInfo implements AudioMessageEnabled {
    protected String phoneNumber;

    public Phone(String number) {
        phoneNumber = number;
    }

    @Override
    public void sendAudioMessage(Audio msg) {
        System.out.println(msg.toString() + " " + phoneNumber);
    }

    @Override
    public void sendMessage(String msg) {
        Audio audioMsg = new Audio(msg);

        sendAudioMessage(audioMsg);
    }

    @Override
    public String contactInfo() {
        return phoneNumber;
    }

    @Override
    public String contactInfoType() {
        return "phone";
    }
}

package contacts;

import org.checkerframework.checker.units.qual.A;

public class Phone extends ContactInfo implements AudioMessageEnabled {
    private final String phoneNumber;

    public Phone(String number) {this.phoneNumber = number;}

    @Override
    public void sendAudioMessage(Audio msg) {
        System.out.println(msg.toString() + " " + this.phoneNumber);
    }

    @Override
    public void sendMessage(String msg) {
        Audio audioMsg = new Audio(msg);

        sendAudioMessage(audioMsg);
    }

    @Override
    public String contactInfo() {
        return this.phoneNumber;
    }

    @Override
    public String contactInfoType() {
        return "phone";
    }
}

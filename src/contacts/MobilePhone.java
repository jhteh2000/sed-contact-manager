package contacts;

public class MobilePhone extends Phone implements AudioMessageEnabled, TextMessageEnabled {

    public MobilePhone(String number) {super(number);}
    @Override
    public void sendTextMessage(String msg) {System.out.println(msg + " " + this.phoneNumber);}

    @Override
    public void sendMessage(String msg) {sendTextMessage(msg);}
}

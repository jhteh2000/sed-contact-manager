package contacts;

public class Contact {
    private final Person person;
    private final ContactInfo contactInfo;

    public Contact(Person p, ContactInfo c) {
        this.person = p;
        this.contactInfo = c;
    }
}

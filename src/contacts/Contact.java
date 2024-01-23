package contacts;

public class Contact {
    private final Person person;
    private final ContactInfo contactInfo;

    public Contact(Person p, ContactInfo c) {
        person = p;
        contactInfo = c;
    }

    public Person getPerson() {
        return person;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}

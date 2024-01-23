package contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private final List<Contact> contacts = new ArrayList<>();

    public void add(Person p, ContactInfo c) {
        Contact newContact = new Contact(p, c);

        contacts.add(newContact);
    }

    public List<ContactInfo> contactDetails(Person p) {
        List<ContactInfo> info = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getPerson().equals(p)) {
                info.add(contact.getContactInfo());
            }
        }

        return info;
    }

    public void spam(String msg) {
        for (Contact contact : contacts) {
            contact.getContactInfo().sendMessage(msg);
        }
    }
}

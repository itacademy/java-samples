package jp.itacademy.exercises.basic.cl;

public abstract class AbstractCommand implements Command {

    String name;
    ContactList contactList;

    protected AbstractCommand(String name, ContactList contactList) {
        this.name = name;
        this.contactList = contactList;
    }

    public String getName() {
        return name;
    }

    public ContactList getContactList() {
        return contactList;
    }

}

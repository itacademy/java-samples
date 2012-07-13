package jp.itacademy.exercises.basic.cl;

public class ListCommand extends AbstractCommand {

    protected ListCommand(ContactList contactList) {
        super("list", contactList);
    }

    @Override
    public void exec(String[] args) {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

}

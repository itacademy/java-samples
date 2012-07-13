package jp.itacademy.exercises.basic.cl;

public class AddCommand extends AbstractCommand {

    protected AddCommand(ContactList contactList) {
        super("add", contactList);
    }

    @Override
    public void exec(String[] args) {
        if (args.length < 3) {
            System.err.println("パラメータが足りません");
            return;
        }
        Contact c = new Contact(args[0], args[1], args[2]);
        contactList.add(c);
    }

}

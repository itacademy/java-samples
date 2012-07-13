package jp.itacademy.exercises.basic.cl;

public class SearchCommand extends AbstractCommand {

    protected SearchCommand(ContactList contactList) {
        super("search", contactList);
    }

    @Override
    public void exec(String[] args) {
        if (args.length < 1) {
            System.err.println("パラメータが足りません");
            return;
        }
        Contact c = contactList.search(args[0]);
        if (c == null) {
            System.err.println("登録されていません");
        } else {
            System.out.println(c);
        }
    }

}

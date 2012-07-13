package jp.itacademy.exercises.basic.cl;

public class RemoveCommand extends AbstractCommand {

    protected RemoveCommand(ContactList contactList) {
        super("remove", contactList);
    }

    @Override
    public void exec(String[] args) {
        if (args.length < 1) {
            System.err.println("パラメータが足りません");
            return;
        }
        Contact c = contactList.remove(args[0]);
        if (c == null) {
            System.err.println("登録されていません");
        } else {
            System.out.println(c.getName() + "を削除しました");
        }
    }

}

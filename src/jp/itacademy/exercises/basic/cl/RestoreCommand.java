package jp.itacademy.exercises.basic.cl;

import java.io.FileNotFoundException;

public class RestoreCommand extends AbstractCommand {

    protected RestoreCommand(ContactList contactList) {
        super("restore", contactList);
    }

    @Override
    public void exec(String[] args) {
        if (args.length < 1) {
            System.err.println("パラメータが足りません");
            return;
        }
        try {
            contactList.restore(args[0]);
        } catch (FileNotFoundException e) {
            System.err.println("指定したファイルが見つかりません");
        }
    }

}

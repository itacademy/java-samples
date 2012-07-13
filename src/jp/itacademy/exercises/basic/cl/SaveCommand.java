package jp.itacademy.exercises.basic.cl;

import java.io.FileNotFoundException;

public class SaveCommand extends AbstractCommand {

    protected SaveCommand(ContactList contactList) {
        super("save", contactList);
    }

    @Override
    public void exec(String[] args) {
        if (args.length < 1) {
            System.err.println("パラメータが足りません");
            return;
        }
        try {
            contactList.save(args[0]);
        } catch (FileNotFoundException e) {
            System.err.println("指定したファイルが見つかりません");
        }
    }

}

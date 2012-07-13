package jp.itacademy.exercises.basic.cl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private Map<String, Command> commands = new HashMap<>();

    private void install(Command command) {
        commands.put(command.getName(), command);
    }

    private Command findCommand(String name) {
        return commands.get(name);
    }

    private void exec() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            CommandLine line = new CommandLine(scanner.nextLine());
            Command cmd = findCommand(line.getName());
            if (cmd == null) {
                System.err.println(line.getName() + "というコマンドはありません");
                continue;
            }
            cmd.exec(line.getArgs());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        ContactList contactList = new ContactList();
        main.install(new AddCommand(contactList));
        main.install(new ListCommand(contactList));
        main.install(new RemoveCommand(contactList));
        main.install(new SearchCommand(contactList));
        main.install(new SaveCommand(contactList));
        main.install(new RestoreCommand(contactList));
        main.exec();
    }

}

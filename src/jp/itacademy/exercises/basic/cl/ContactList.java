package jp.itacademy.exercises.basic.cl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 住所録を表すクラス。
 */
public class ContactList implements Iterable<Contact> {

    private List<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    /**
     * 住所録を名前で検索して、名前が一致した連絡先を削除します。
     * 
     * @param name
     * @return 削除した連絡先。該当する連絡先が見つからなかった場合は<code>null</code>
     */
    public Contact remove(String name) {
        for (Iterator<Contact> itr = contacts.iterator(); itr.hasNext();) {
            Contact c = itr.next();
            if (c.getName().equals(name)) {
                itr.remove();
                return c;
            }
        }
        return null;
    }

    public Contact search(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();
    }

    public void save(String filePath) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(filePath)) {
            for (Contact c : contacts) {
                out.println(c.getName() + " " + c.getTel() + " " + c.getEmail());
            }
        }
    }

    public void restore(String filePath) throws FileNotFoundException {
        this.contacts = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.add(new Contact(line.split(" ")));
            }
        }
    }

}

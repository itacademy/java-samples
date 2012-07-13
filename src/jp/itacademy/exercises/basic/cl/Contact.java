package jp.itacademy.exercises.basic.cl;

public class Contact {

    private String name;
    private String tel;
    private String email;
    
    public Contact(String[] args) {
        this(args[0], args[1], args[2]);
    }

    public Contact(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, tel, email);
    }
}

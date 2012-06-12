package jp.itacademy.samples.oop.ticket;

public class Ticket {
    
    private int serial;
    private String label;
    
    Ticket(int serial, String label) {
        this.serial = serial;
        this.label = label;
    }

    public int getSerial() {
        return serial;
    }

    public String getLabel() {
        return label;
    }
    
    public String toString() {
        return "[Ticket] No." + serial + " " + label;
    }
}

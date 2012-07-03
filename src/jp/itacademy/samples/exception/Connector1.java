package jp.itacademy.samples.exception;

import java.net.Socket;

public class Connector1 {

    public static void main(String[] args) {
        Connector1 conn = new Connector1("www.yahoo.co.jp", 80);
        conn.connect();
    }

    private String host;
    private int port;

    public Connector1(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        Socket sock = new Socket(host, port);
        System.out.println("接続成功: " + sock);
    }
}

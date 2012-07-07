package jp.itacademy.samples.exception;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector3 {

    public static void main(String[] args) {
        Connector3 conn = new Connector3("www.yahoo.co.jp", 80);
        try {
            conn.connect();
        } catch (UnknownHostException e) {
            System.err.println(conn.host + " が見つかりません");
        } catch (IOException e) {
            System.err.println("接続できません");
        }
    }

    private String host;
    private int port;

    public Connector3(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() throws UnknownHostException, IOException {
        Socket sock = new Socket(host, port);
        System.out.println("接続成功: " + sock);
    }
}

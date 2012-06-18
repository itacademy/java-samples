package jp.itacademy.samples.oop.mock;

public interface FacebookService {

    /**
     * 指定したユーザの友だち一覧を取得する
     */
    String[] getFriends(String userName);

}

package jp.itacademy.samples.oop.mock;

public class FacebookServiceMock implements FacebookService {

    @Override
    public String[] getFriends(String userName) {
        return new String[] { "Taro", "Jiro", "Saburo" };
    }

}

package jp.itacademy.samples.oop.mock;

public class TwitterServiceMock implements TwitterService {

    public String[] getRecentTweets(String userName) {
        return new String[] { "うそツイート1", "うそツイート2", "うそツイート3" };
    }

}

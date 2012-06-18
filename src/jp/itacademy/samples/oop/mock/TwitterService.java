package jp.itacademy.samples.oop.mock;

public interface TwitterService {

    /**
     * 最新のツイート3件を取得する
     */
    String[] getRecentTweets(String userName);

}

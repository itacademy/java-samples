package jp.itacademy.samples.oop.mock;

public class CompatibilityTest {

    public static void main(String[] args) {

        String userName = "俺";

        FacebookService serv = new FacebookServiceMock();

        String[] friends = serv.getFriends(userName);
        for (String friend : friends) {
            String comp = getCompatibility(userName, friend);
            System.out.println(friend + " さんとの相性は" + comp + "です");
        }
    }

    /**
     * 二人の名前から相性を診断するメソッド
     */
    public static String getCompatibility(String person1, String person2) {
        if (person1.hashCode() > person2.hashCode()) {
            return "最高";
        } else {
            return "最悪";
        }
    }

}

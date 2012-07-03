package jp.itacademy.samples.oop.ticket;

/**
 * 券売機を表すクラスです。お金を投入してチケットを購入することができます。購入したチケットは<code>Ticket</code>
 * クラスのオブジェクトとして取得できます。
 * 
 * @author okada
 * @version 1.0
 */
public class TicketMachineWithDoc {

    private static int nextSerial = 1;

    private static int getNextSerial() {
        return nextSerial++;
    }

    private String ticketName;
    private int price;
    private int amount;

    /**
     * この券売機で販売するチケットの名称と価格を指定して新しいインスタンスを生成します。
     * 
     * @param ticketName 販売するチケットの名前
     * @param price 販売するチケットの価格
     */
    public TicketMachineWithDoc(String ticketName, int price) {
        this.ticketName = ticketName;
        this.price = price;
    }

    /**
     * お金を投入します。投入したお金は券売機の中に蓄積されます。
     * 
     * @param money 投入する金額
     */
    public void putMoney(int money) {
        this.amount += money;
    }

    /**
     * 現在券売機に入っているお金の合計を取得します。
     * 
     * @return 券売機に入っているお金
     */
    public int getAmount() {
        return amount;
    }

    /**
     * 現在券売機に入っているお金を、お釣りとしてすべて払い戻します。
     * 
     * @return お釣り
     */
    public int getChange() {
        int change = amount;
        amount = 0;
        return change;
    }

    /**
     * 全券売機をとおして一意な番号が割り振られたチケットを購入し、投入金額からチケット代をマイナスします。投入金額がチケット代に満たない場合は
     * <code>null</code>が返ります。
     * 
     * @return <code>Ticket</code>オブジェクト。ただし投入金額がチケット代に満たない場合は<code>null</code>
     */
    public Ticket getTicket() {
        if (amount < price) {
            return null;
        }
        amount -= price;
        return new Ticket(getNextSerial(), ticketName);
    }
}

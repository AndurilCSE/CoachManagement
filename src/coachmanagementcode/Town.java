package coachmanagementcode;

/**
 * Created by shiyam on 2/2/16.
 */
public class Town {

    private boolean issOverNighStop;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean issOverNighStop() {
        return issOverNighStop;
    }

    public void setIssOverNighStop(boolean issOverNighStop) {
        this.issOverNighStop = issOverNighStop;
    }
}

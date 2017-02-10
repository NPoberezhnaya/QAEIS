/**
 * Created by EIS_Group_ODS on 09.02.2017.
 */
public class Bread extends Food {
    private int count;

    public Bread(String name, float price, int area, int count) {
        super(name, price, area);
        this.count = count;
    }

    public Bread(String name, float price, int count) {
        super(name, price);
        this.count = count;
    }

    public Bread(String name, int count) {
        super(name);
    }


    public void delivery(int number){
        count += number;
    }


    public void sell(int number){
        count -= number;
    }

    int getCount(String name){
        return count;
    }

    float getPrice(String name){
        return count;
    }



}

/**
 * Created by EIS_Group_ODS on 09.02.2017.
 */
public class Drink extends Food {


    private int countAll;
    private int countBroken;


    public Drink(String name, float price, int area, int countAll, int countBroken) {
        super(name, price, area);
        this.countAll = countAll;
        this.countBroken = countBroken;
    }

    public Drink(String name, float price, int countAll, int countBroken) {
        super(name, price);
        this.countAll = countAll;
        this.countBroken = countBroken;
    }


    public Drink(String name) {
        super(name);
        this.countAll = countAll;
        this.countBroken = 0;
    }


    public void delivery(int number){
        countAll += number;
        countBroken += 2;
    }


    public void sell(int number){
        countAll -= number;
    }


   public int getCount(String name){
        return countAll;
    }

    public int getCountBroken(String name){
        return countBroken;
    }


}

import java.util.Calendar;


/**
 * Created by EIS_Group_ODS on 09.02.2017.
 */
public class Food {
    String name;
    float price;
    int area;
    //Calendar bestBefore;
    //Calendar dataMade;

    public Food(String name, float price, int area)
    {
        this.name = name;
        this.price = price;
        this.area = area;
    }

    public Food(String name, float price)
    {
        this(name, price, 1);
    }

    public Food(String name)
    {
       this(name, 20.5f, 2);
    }

    public void delivery(){
        System.out.println("the product is in the shop!");
    }
    public void sell(){
        System.out.println("the product sold");
    }

}

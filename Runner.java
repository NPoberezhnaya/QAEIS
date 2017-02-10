/**
 * Created by EIS_Group_ODS on 09.02.2017.
 */
public class Runner {

    public static void main(String[] args) {


        //Bread
        Bread breadWhite = new Bread("Favorite", 20.5f, 5);
        Bread breadBlack = new Bread("Borodinskiy", 15.5f, 6);


        breadWhite.delivery(10);
        breadBlack.delivery(20);


        System.out.println("Number of Favorite breads after delivery:  " + breadWhite.getCount("Favorite"));
        System.out.println("Number of Borodinskiy breads after delivery:  " + breadBlack.getCount("Borodinskiy"));


        breadWhite.sell(5);
        breadBlack.sell(20);

        System.out.println("Number of Favorite breads after selling:  " + breadWhite.getCount("Favorite"));
        System.out.println("Number of Borodinskiy breads after selling:  " + breadBlack.getCount("Borodinskiy"));


        //Drink
        Drink vodka = new Drink("Davidoff", 20.5f, 15, 2);
        Drink koniak = new Drink("Shustoff", 120.5f, 15, 4);


        vodka.delivery(10);
        koniak.delivery(20);


        System.out.println("Number of Favorite vodka after delivery:  " + vodka.getCount("Davidoff"));
        System.out.println("Number of Favorite koniak after delivery:  " + koniak.getCount("Shustoff"));


        vodka.sell(5);
        koniak.sell(20);

        System.out.println("Number of Favorite vodka after selling:  " + vodka.getCount("Davidoff"));
        System.out.println("Number of Favorite koniak after selling:  " + koniak.getCount("Shustoff"));

        System.out.println("Number of broken vodka:  " + vodka.getCountBroken("Davidoff"));
        System.out.println("Number of broken koniak:  " + koniak.getCountBroken("Shustoff"));
    }

}

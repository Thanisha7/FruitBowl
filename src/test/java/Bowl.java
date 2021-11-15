import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Bowl {
    private List<Fruit> fruits;
    private Shape shape;
    public Bowl()
    {
        fruits= new ArrayList<>();
    }
    public void addFruit(Fruit... allFruits)
    {
        for (Fruit a:allFruits) {
            fruits.add(a);
        }

    }
    public Bowl getAllApplesBowl()
    {
        Bowl bowlOfApples=new Bowl();
        for (Fruit fruit:fruits) {
            if(fruit instanceof Apple)
            {
                bowlOfApples.addFruit(fruit);
            }
        }
        return bowlOfApples;
    }
    public Bowl getAllOrangesBowl()
    {
        Bowl bowlOfOranges=new Bowl();
        for (Fruit fruit:fruits) {
            if(fruit instanceof Orange)
            {
                bowlOfOranges.addFruit(fruit);
            }
        }
        return bowlOfOranges;
    }
    public Bowl getAllBananasBowl()
    {
        Bowl bowlOfBananas=new Bowl();
        for (Fruit fruit:fruits) {
            if(fruit instanceof Banana)
            {
                bowlOfBananas.addFruit(fruit);
            }
        }
        return bowlOfBananas;
    }
    public int getCount()
    {
       return fruits.size();
    }

}

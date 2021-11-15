import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitTests {

    @Test
    public void shouldSegregateApple() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        Bowl mixedFruits = new Bowl();
        mixedFruits.addFruit(apple1, apple2, orange1, orange2, banana1, banana2);

        Bowl bowlOfApples = mixedFruits.getAllApplesBowl();
        Assert.assertEquals(bowlOfApples.getCount(), 2);

    }
    @Test
    public void shouldSegregateOrange() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        Bowl mixedFruits = new Bowl();
        mixedFruits.addFruit(apple1, apple2, orange1, orange2, banana1, banana2);
        Bowl bowlOfOranges = mixedFruits.getAllOrangesBowl();
        Assert.assertEquals(bowlOfOranges.getCount(), 2);

    }
    @Test
    public void shouldSegregateBanana() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        Bowl mixedFruits = new Bowl();
        mixedFruits.addFruit(apple1, apple2, orange1, orange2, banana1, banana2);
        Bowl bowlOfBananas = mixedFruits.getAllBananasBowl();
        Assert.assertEquals(bowlOfBananas.getCount(), 2);
    }

}
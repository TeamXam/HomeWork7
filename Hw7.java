/**
 * Java1. HomeWork7
 *
 * @author ToBapuw
 * @version dated September 6, 2018
 */

public class Hw7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsick", 10),
            new Cat("Ignat", 2),
            new Cat("Igor", 7),
            new Cat("Serg", 4),
            };

            Plate plate = new Plate(200, 50);
                System.out.println(plate);
           for (Cat cat : cats){
               cat.setFul(false);
               cat.eat(plate);
               System.out.println(cat);
           }
           System.out.println(plate);
           plate.addFood(30);
           System.out.println(plate);

           for(Cat cat : cats)
               if (cat.ful == false)
                   cat.eat(plate);

               for(Cat cat : cats){
                   cat.setFul(false);
                   cat.eat(plate);
                   System.out.println(cat);
               }
               System.out.println(plate);
    }
}


class Cat {
    protected String name;
    protected int appetit;
    protected boolean ful;

    Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        ful = false;
    }

    void setFul(boolean status) {
        ful = status;
    }


    void eat(Plate plate) {
        if (!ful)
            ful = plate.decraseFood(appetit);
    }

    @Override
    public String toString() {
        return "{name=" + name + ", appetit=" + appetit + ", ful=" + ful + "}";
    }


}

class Plate {
    protected int plus;
    protected  int food;

    Plate(int plus, int food) {
        this.plus = plus;
        this.food = food;
    }

    boolean decraseFood(int plus){
        if(food < plus)
            return false;
        food -= plus;
        return true;
    }

    void addFood(int food) {
        if(this.food + food <= plus)
            this.food += food;
    }

    @Override
    public String toString(){
        return "Food" + food;
    }

}







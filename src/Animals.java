public class Animals {
    String name;
    int runDistant;
    int swimDistant;
    static int listAnimals;

    public Animals(String name) {
        this.name = name;
        listAnimals++;
    }

    public void setRunDistant(int runDistant) {
        this.runDistant = runDistant;
    }

    public void setSwimDistant(int swimDistant) {
        this.swimDistant = swimDistant;
    }

    public void runHappy() {
        System.out.println(name + " пробежал " + runDistant + " метров");
    }

    public void swimHappy() {
        System.out.println(name + " проплыл " + swimDistant + " метров");
    }

    public static int getListAnimals() {
        return listAnimals;
    }
}

class Cat extends Animals {
    static int listAnimals;
    static int hungry;
    static boolean satiety;
    public boolean getSatiety;

    public Cat(String name) {
        super(name);
        listAnimals++;
    }


    public static int getHungry() {
        return hungry;
    }

    public static void setHungry(int hungry) {  //Голод кота
        Cat.hungry = hungry;
    }

    @Override
    public void swimHappy() {
        System.out.println(name + " не умеет плавать");
    }

    public void runHappy() {
        if (runDistant > 0 & runDistant <= 200) {
            System.out.println(name + " пробежал " + runDistant + " метров");
        } else {
            System.out.println(name + " не может пробежать " + runDistant + " метров");
        }
    }

    public static int getListAnimals() {            //Выдает количество котов
        return listAnimals;
    }
    public static boolean getSatiety () {
        return satiety;
    }

    public static void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public void eating() {
        int howManyFullBowl;
        int hungry = Cat.hungry;
        howManyFullBowl = BowlOfFood.getFull();
        if (howManyFullBowl > hungry) {
            BowlOfFood.setFull(howManyFullBowl - hungry);
            Cat.setHungry(0);
            Cat.setSatiety(true);
            System.out.println("Сытость кота: "+Cat.getSatiety());
        } else {
            System.out.println("Кот не может поесть");
        }
    }
}

class Dog extends Animals {
    public Dog(String name) {
        super(name);
        listAnimals++;
    }

    static int listAnimals;

    @Override
    public void swimHappy() {
        if (swimDistant <= 10 & runDistant > 0) {
            System.out.println(name + " проплыл " + swimDistant + " метров");
        } else {
            System.out.println(name + " не может проплыть " + swimDistant + " метров");
        }
    }

    public void runHappy() {
        if (runDistant <= 500 & runDistant > 0) {
            System.out.println(name + " пробежал " + runDistant + " метров");
        } else {
            System.out.println(name + " не может пробежать " + runDistant + " метров");
        }
    }

    public static int getListAnimals() {
        return listAnimals;
    }
}



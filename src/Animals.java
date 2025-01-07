public class Animals {
    String name;
    int runDistant;
    int swimDistant;
    static int listAnimals;

    public Animals(String name) {
        this.name = name;
        listAnimals++; //счетчик создание класса
    }

    public void setRunDistant(int runDistant) { // задание дистанции бега
        this.runDistant = runDistant;
    }


    public void setSwimDistant(int swimDistant) { // задание дистанции плаванья
        this.swimDistant = swimDistant;
    }

    public void runHappy() { // вывод сколько пробежао животное
        System.out.println(name + " пробежал " + runDistant + " метров");
    }

    public void swimHappy() { // вывод сколько проплыло животное
        System.out.println(name + " проплыл " + swimDistant + " метров");
    }

    public static int getListAnimals() { //Вывод количество созданных животных
        return listAnimals;
    }

}

class Cat extends Animals {
    static int listAnimals;
    static int hungry = 1; //голод кота (если больше нуля то кот голоден)
    static boolean satiety = false; //сытость кота по умолчанию голоден


    public Cat(String name) {
        super(name);
        listAnimals++;
    }

    public static void setHungry(int hungry) {  //Голод кота
        Cat.hungry = hungry;
    }

    @Override //Переопределение методов Бег и Плаванье
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

    public static int getHungry() {
        return hungry;
    }

    public static int getListAnimals() {            //Выдает количество котов
        return listAnimals;
    }

    public static boolean getSatiety() { //Показывает сытость кота
        return satiety;
    }

    public static void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public void eating() { // метод кот ест из миски
        int howManyFullBowl;
        int hungry = Cat.hungry;
        howManyFullBowl = BowlOfFood.getFull();
        if (howManyFullBowl > hungry) {
            BowlOfFood.setFull(howManyFullBowl - hungry);
            Cat.setHungry(0);
            Cat.setSatiety(true);
            System.out.println("Сытость кота: " + Cat.getSatiety());
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

    @Override //Переопределение методов Бег и Плаванье
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



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animals bird = new Animals("Киллик"); // создание животных
        Animals bird2 = new Animals("Киллик2");
        Animals bird3 = new Animals("Киллик3");
        bird.setRunDistant(100); // Проверка может ли птица бежать
        bird.setSwimDistant(5);
        bird.runHappy();
        bird.swimHappy();
        Cat firstCat = new Cat("TimSoner"); // создание кота
        firstCat.swimHappy();
        firstCat.setRunDistant(50);
        firstCat.runHappy();
        Dog barsFirst = new Dog("Барс"); //создание собаки
        barsFirst.setRunDistant(340);
        barsFirst.setSwimDistant(3);
        barsFirst.runHappy();
        barsFirst.swimHappy();
        Cat ymi1 = new Cat("Юмик"); //создание кота
        BowlOfFood bowl1 = new BowlOfFood(60); // создание миски с едой
        Cat.setHungry(4); // задать сколько должен съесть кот чтобы стать сытым (количество голода)
        ymi1.eating(); // кот поел
//Создание массива котов
        Cat[] arrayCats = {
                new Cat("Tim"),
                new Cat("Lobik"),
                new Cat("Tom"),
                new Cat("Barsik")
        };
        // команды для того чтобы котики поели
        arrayCats[0].setHungry(6); //задать сколько должен съесть кот чтобы стать сытым (количество голода)
        arrayCats[1].setHungry(8);
        arrayCats[2].setHungry(9);
        arrayCats[3].setHungry(3);
        arrayCats[0].eating(); // команда поесть
        arrayCats[1].eating();
        arrayCats[2].eating();
        arrayCats[3].eating();

        System.out.println("Всего животных - " + Animals.getListAnimals()); //подсчет всех животных
        System.out.println("Всего котов - " + Cat.getListAnimals());
        System.out.println("Всего собак - " + Dog.getListAnimals());
    }
}
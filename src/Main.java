public class Main {
    public static void main(String[] args) {
        Animals bird = new Animals("Киллик");
        Animals bird2 = new Animals("Киллик2");
        Animals bird3 = new Animals("Киллик3");
        bird.setRunDistant(100);
        bird.setSwimDistant(5);
        bird.runHappy();
        bird.swimHappy();
        Cat firstCat = new Cat("TimSoner");
        firstCat.swimHappy();
        firstCat.setRunDistant(50);
        firstCat.runHappy();
        Dog barsFirst = new Dog("Барс");
        barsFirst.setRunDistant(340);
        barsFirst.setSwimDistant(3);
        barsFirst.runHappy();
        barsFirst.swimHappy();
        System.out.println(Animals.getListAnimals());
        System.out.println(Cat.getListAnimals());
        System.out.println(Dog.getListAnimals());

    }
}
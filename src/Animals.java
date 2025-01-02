public class Animals {
    String name;
    int runDistant;
    int swimDistant;
    public Animals (String name) {
    this.name = name;
    }
    public void runHappy () {
        System.out.println(name + " пробежал " + runDistant);
    }
    public void swimHappy () {
        System.out.println (name + " проплыл "+ swimDistant);
    }
}


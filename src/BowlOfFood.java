public class BowlOfFood {
    static int full;

    public BowlOfFood(int full) {
        BowlOfFood.full = full;
    }

    public static int getFull() {
        return full;
    }

    public static void setFull(int full) {
        if (full > 0) {
            BowlOfFood.full = full;
        } else {
            BowlOfFood.full = 0;
        }
    }
}

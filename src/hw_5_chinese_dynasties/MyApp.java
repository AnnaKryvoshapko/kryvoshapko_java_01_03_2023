package hw_5_chinese_dynasties;

public class MyApp {
    public static void main(String[] args) {

        int li = 860;
        double min = li * 1.5;

        int liRider = 13;
        int liBowman = 24;
        int liSoldier = 46;

        int minRider = 9;
        int minBowman = 35;
        int minSoldier = 12;

        double liTotal = li * (liRider + liBowman + liSoldier);
        double minTotal = min * (minRider + minBowman + minSoldier);

        System.out.println("Total Li attack value = " + liTotal);
        System.out.println("Total Min attack value = " + minTotal);

    }
}

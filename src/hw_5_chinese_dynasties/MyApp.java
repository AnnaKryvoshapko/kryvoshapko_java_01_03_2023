    package hw_5_chinese_dynasties;

public class MyApp {
    public static void main(String[] args) {

        int liTotal = 860;
        double minTotal = liTotal * 1.5;

        int liRider = 13;
        int liBowman = 24;
        int liSoldier = 46;

        int minRider = 9;
        int minBowman = 35;
        int minSoldier = 12;

        int attackLiTotal = liTotal * (liRider + liBowman + liSoldier);
        double attackMinTotal = minTotal * (minRider + minBowman + minSoldier);

        System.out.println("Total Li attack value = " + attackLiTotal);
        System.out.println("Total Min attack value = " + attackMinTotal);

    }
}

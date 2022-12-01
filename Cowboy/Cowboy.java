package Cowboy;

//Задача 3.
//        Напишите программу, которая определяет, сколько можно купить быков, коров и телят,
//        платя за быка 10 рублей, за корову - 5 рублей, а за теленка - 50 копеек,
//        если на 100 рублей надо купить 100 голов скота?
//    Given:
//        cattle = 100;
//        money = 100;
//        bullCost = 10;
//        cowCost = 5;
//        calfCost = 0.5;
//        100 = bullCost * x + cowCost * y + calfCost * z;

public class Cowboy {
    public static void main(String[] args){
        for (int bulls = 1; bulls <= 10; bulls++) {
            for (int caws = 1; caws <= 20; caws++) {
                for (int calfs = 1; calfs <= 200; calfs++) {
                    if (((bulls * 10) + (caws * 5) + (calfs * 0.5)) == 100 && (bulls + caws + calfs) == 100) {
                        System.out.println("We can buy: " + bulls + " bulls, " + caws + " cows " + calfs + " calfs");
                        System.out.println("Muuuu");
                    }
                }
            }
        }
    }
}




public class d20 {
    // get d20 dice
    public static int getRandomDiceNumberD20(){
        return (int) (Math.random()*20) + 1;
    }
    // get d10 dice
    public static int getRandomDiceNumberD10(){
        return (int) (Math.random()*10) + 1;
    }
    // get d8 dice
    public static int getRandomDiceNumberD8(){
        return (int) (Math.random()*8) + 1;
    }
    // get d6 dice
    public static int getRandomDiceNumberD6(){
        return (int) (Math.random()*6) + 1;
    }
    // get d4 dice
    public static int getRandomDiceNumberD4(){
        return (int) (Math.random()*4) + 1;
    }

    public static void main(String[] args)
    {
        for(int i = 0; i < 2; i++){
            int x = getRandomDiceNumberD20();
            if(x == 20){
                System.out.println("D20: " + x + " — critical damage!");
            } else if(x == 1) {
                System.out.println("D20: " + x + " — weakling!");
            } else {
                System.out.println("D20: " + x);
            }
        }
    }
}

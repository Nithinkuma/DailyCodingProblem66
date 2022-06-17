import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(toss_unbiased());

    }

    private static boolean toss_unbiased() {
        //probability of getting 0 -> p and 1 -> 1-p
        //getting the combos (0,1) and (1,0) is p*(1-p) they are of equal probabilities
        boolean res1 = toss_biased();
        boolean res2 = toss_biased();
        if(res1 && !res2)
            return true;
        else if(!res1 && res2)
            return false;

        return toss_unbiased();
    }

    static boolean toss_biased(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
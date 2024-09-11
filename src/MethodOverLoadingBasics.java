public class MethodOverLoadingBasics {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("ABDUL",10));
        System.out.println("New Score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName , int score){
        System.out.println("Player  " + playerName + " scored " + score + " points" );
        return score*1000;
    }

    public static int calculateScore(int score){
        return calculateScore("anonymous",score);
    }

    public static int calculateScore(){
        System.out.println("now player name , no score ");
        return 0;

    }



}

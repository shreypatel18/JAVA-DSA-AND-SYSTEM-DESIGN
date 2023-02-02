import java.util.Scanner;

class Guesser{
    int guessedNo;
    int guessingNo()
    {
        System.out.println("guesser guess the number");
        Scanner s1 = new Scanner(System.in);
        guessedNo = s1.nextInt();
        return guessedNo;
    }

}
class player{
    int no1;
    int no2 ;
    int no3;
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);
    Scanner s4 = new Scanner(System.in);



        int dataFromPlayer1()
        {
            System.out.println("player 1 enter the no");
            int no1 = s2.nextInt();
            return no1;
        }

        int dataFromPlayer2()
        {
            System.out.println("player 2 enter the no");
            int no2 = s3.nextInt();
            return no2;
        }

        int dataFromPlayer3()
        {
            System.out.println("player 3 enter the no");
            int no3 = s4.nextInt();
            return no3;
        }
    }


class Umpire{
    int gs1;
    int ps1;
    int ps2;
    int ps3;
    void compare(){
       Guesser g1 = new Guesser();
       gs1 =g1.guessingNo();
       player p1 = new player();
       ps1=p1.dataFromPlayer1();
       player p2 = new player();
       ps2 =p2.dataFromPlayer2();
       player p3 = new player();
       ps3 = p3.dataFromPlayer3();


        if (ps1 == gs1) {
            if(ps2==gs1&&ps3==gs1){
                System.out.println("All players won the game");
            }else if(ps2==gs1){
                System.out.println("player 1 and player 2 won the game");
            }else if(ps3==gs1){
                System.out.println("player 1 and player 3 won the game");
            }else{
                System.out.println("player 1 won the game");
            }
        }

        else if(ps2==gs1){
            if(ps3==gs1){
                System.out.println("Player 2 and player 3 won the game");
            } else {
                System.out.println("player 2 won the game");

            }

        }else if(ps3==gs1){
            System.out.println("player 3 won the game");
        }else{
            System.out.println("no one won");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Umpire r = new Umpire();
        r.compare();
        System.out.println("game over press 1 for restart or press 0 to exit");
        Scanner reload = new Scanner(System.in);

            for (int i = 0; i < reload.nextInt(); i++) {
                Umpire x = new Umpire();
                x.compare();
            }
        }
    }


import java.util.Random;
import java.util.Scanner;

class guess{
    public static void main(String args[]){
        String play ="yes";
        Scanner sc= new Scanner(System.in);
        Random random=new Random();
        while(play.equals("yes")){
            int randomno=random.nextInt(100);
            int guess=-1;
            int trying=0;

            while(randomno!=guess){
                System.out.print("Guess a Number between 1-100:  ");
                guess=sc.nextInt();
                trying ++;
                if(guess==randomno){
                    System.out.println("Awesome! you Guessed the Number ");
                    System.out.println("It tooks "+trying+" Guess");
                    System.out.println("Would You like to Play again: yes/no");
                    play=sc.next().toLowerCase();

                }
                else if(guess>randomno){
                    System.out.println("Your Guess is too High : try again:");

                }
                else{
                    System.out.println("Your Guess is too Low : try again:");

                }

            }
        }
        sc.close();
    }
}
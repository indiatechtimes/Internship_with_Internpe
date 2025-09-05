import java.util.Random;
import java.util.Scanner;

class RSP{
    public static void main(String[] args) {

        // VARIABE DECLARATION
        Random r=new Random();
        try (Scanner sc = new Scanner(System.in)) {
            String[] choice ={
                "rock",
                "paper",
                "scissor"
            };
            String comchoice;
            String plachoice;
            String playagain="yes";
            
            
            do{
                
                // GET CHOICE FROM USER
                System.out.print("Enter your move : (rock , paper , scissor) : ");
                plachoice = sc.nextLine().toLowerCase();
                if(!plachoice.equals("rock") &&
                        !plachoice.equals("paper") &&
                        !plachoice.equals("scissor")
                        ){
                    System.out.println("invalid input");
                    continue;
                    
                }
                
                
                // GETTING RAMDOM  CHOICE FROM COMPUTER
                comchoice=choice[r.nextInt(3)];
                System.out.println("Computer Choice : "+comchoice);
                
                
                //CHECK WIN CONDITIONS
                
                if(plachoice.equals(comchoice)){
                    System.out.println("Its Tie");// condition FOR TIE
                }
                else if(plachoice.equals("rock") && comchoice.equals("scissor")
                        ){
                    System.out.println("You win !");// FIRST CONDITION TO WIN
                }
                else if(plachoice.equals("paper")&& comchoice.equals("rock")
                        ){
                    System.out.println("You win !"); // second condition to win
                }
                else if(plachoice.equals("scissor")&& comchoice.equals("paper")
                        ){
                    System.out.println("You win !"); // Third  condition to win
                }
                else{
                    System.out.println("you Lose ! ");// condition to Lose
                }
                
                
                // ASK TO PLAY
                System.out.print("Play again (yes/no) :");
                playagain=sc.nextLine().toLowerCase();
                
            }while(playagain.equals("yes"));
        }

    }

}
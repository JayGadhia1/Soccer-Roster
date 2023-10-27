import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        int[] playerNum = new int[5];
        int[] ratingNum = new int[5];
        char optionLetter;
          
        for(int i = 0; i < 5; i++){
            System.out.println("Enter player "+ (i+1) + "'s jersey number:" );
             playerNum[i] = scnr.nextInt();
             
             System.out.println("Enter player " + (i+1) + "'s rating:");
             ratingNum[i] = scnr.nextInt();
             
             System.out.println();
          }
          
          System.out.println("ROSTER");
          for(int i = 0; i < 5; i++){
             System.out.println("Player " + (i+1) + " -- Jersey number: " +  playerNum[i] + ", Rating: " + ratingNum[i]);
          }
          System.out.println();
          
          do{
             System.out.println("MENU");
             System.out.println("u - Update player rating");
             System.out.println("a - Output players above a rating");
             System.out.println("r - Replace player");
             System.out.println("o - Output roster");
             System.out.println("q - Quit");
             System.out.println();
             
             System.out.print("Choose an option:");
             optionLetter = scnr.next().charAt(0);
             System.out.println();
             
             switch(optionLetter){
                case 'u':
                   System.out.print("Enter a jersey number: ");
                        int playerNumUpdate = scnr.nextInt();

                        System.out.print("Enter a new rating for player: ");
                        int ratingNumUpdate = scnr.nextInt();

                        for (int i = 0; i < 5; i++) {
                            if (playerNum[i] == playerNumUpdate) {
                                ratingNum[i] = ratingNumUpdate;
                                break;
                            }
                        }

                        break;
                     
                case 'a':
                   System.out.print("Enter a rating: ");
                        int aboveRating = scnr.nextInt();

                        System.out.println("ABOVE " + aboveRating);
                        for (int i = 0; i < 5; i++) {
                            if (ratingNum[i] > aboveRating) {
                                System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNum[i] + ", Rating: " + ratingNum[i]);
                            }
                        }
                        System.out.println();

                        break;
                   
                case 'r':
                   System.out.print("Enter a jersey number to replace:");
                   int playerNumReplace = scnr.nextInt();

                   System.out.print("Enter a new jersey number: ");
                   int newPlayerNum = scnr.nextInt();
                
                   System.out.print("Enter a rating for the new player: ");
                   int newRatingNum = scnr.nextInt();
                
                   for (int i = 0; i < 5; i++) {
                      if (playerNum[i] == playerNumReplace) {
                         playerNum[i] = newPlayerNum;
                         ratingNum[i] = newRatingNum;
                         break;
                         
                      }
                   }

                   break;
   
                case 'o':
                   System.out.println("ROSTER");
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerNum[i] + ", Rating: " + ratingNum[i]);
                        }
                        System.out.println();

                        break;
                   
                case 'q':
                   break;
                   
                default:
                   System.out.print("Invalid menu option, please select again!");
                   break;
             }
          
          }while(optionLetter != 'q');
    }
   }
}

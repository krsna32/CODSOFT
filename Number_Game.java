import java.util.Scanner;
import java.util.*;

class Number_Game {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random r = new Random();
      int random_Number = (int) r.nextInt(100);

      int user_number;
      int max_attemp = 10;
      int score = 100; 
      do {
         System.out.print("Guess my number (1-100):");
         user_number = sc.nextInt();

         if (user_number == random_Number) {
            System.out.println("WOOHOO... CORRECT NUMBER ");
            System.out.println("Score  -  " + score + "/100");
            break;
         }

         else if (user_number > random_Number) {
            System.out.println(user_number + " TO LARGE");

         } else {
            System.out.println(user_number + " TO SMALL");
         }
         max_attemp--;
         score = score - 10;
         System.out.println(max_attemp + "  attempt remaining\n");
         if (max_attemp == 0) {
            System.out.println("Score  - " + 0 + "/100");
            System.out.println("Game over :");
         }
      } while (user_number >= 0 && max_attemp != 0);

      System.out.println("1.play again\n2.exit");
      if (sc.nextInt() == 1) {
         main(args);
      }
   }

}
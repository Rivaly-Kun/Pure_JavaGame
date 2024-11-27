import java.util.*;

public class Main {
    
     public static int playerHealth = 20;
     public static int botHealth = 20;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu interface");
      
        System.out.println("Enter Start, settings, quit");
          String menu = input.nextLine();

        if (menu.equals("start")) {
             gameLoop(rand, input);
        } else if (menu.equals("settings")) {
             settings(rand, input);
            System.out.println("game settings");
        } else if (menu.equals("quit")) {
            System.out.println("are you sure?");
            String yaSure = input.nextLine();
            if (yaSure.equals("yes")) {
                System.out.println("Have a good day");
                System.exit(0);
            }
        }
    }

    public static void gameLoop(Random rand, Scanner input) {
       
        while (true) {
            System.out.println("shuffling cards");

            // generate random cards
            int card1 = rand.nextInt(6);
            int card2 = rand.nextInt(6);
            int card3 = rand.nextInt(6);

            // display cards
            ArrayList<String> cards = new ArrayList<>();
            cards.add("card0");
            cards.add("card1");
            cards.add("card2");
            cards.add("card3");
            cards.add("card4");
            cards.add("card5");
            System.out.println("your cards:");
            System.out.println(cards.get(card1));
            System.out.println(cards.get(card2));
            System.out.println(cards.get(card3));

            // choose a card
            System.out.println("Choose your card:");
            int chosenCard = input.nextInt();

            // calculate player damage
            ArrayList<Integer> cardDmg = new ArrayList<>();
            cardDmg.add(1); // 0
            cardDmg.add(2); // 1
            cardDmg.add(3); // 2
            cardDmg.add(4); // 3
            cardDmg.add(5); // 4
            cardDmg.add(6); // 5
            int playerDmg = cardDmg.get(chosenCard - 1);

            // calculate bot damage
            int botDmg = rand.nextInt(6) + 1;

            // deduct health
            playerHealth -= botDmg;
                 System.out.println("Player Damage Taken:" + " "+ botDmg);
            botHealth -= playerDmg;
   System.out.println("Bot Damage Taken:" + " "+ playerDmg);
            // display health stats
            System.out.println("Health stats:");
            System.out.println("player health = " + playerHealth);
            System.out.println("bot health = " + botHealth);

            // check for game over
            if (playerHealth <= 0) {
                System.out.println("You lost");
                break;
            } else if (botHealth <= 0) {
                System.out.println("You won!");
                break;
            }
        }
    }
    
    
    
     public static void settings(Random rand, Scanner input) {
    System.out.println("Change player health:");
        playerHealth = input.nextInt();
        System.out.println("Change bot health:");
        botHealth = input.nextInt();
        main(null);
         
     }
    
    
    
}

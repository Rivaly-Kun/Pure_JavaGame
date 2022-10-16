//v1
import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import static java.lang.System.exit;

public class HelloWorld {
    public static void main(String args[]) {
        Random rand = new Random();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Menu interface");
            String menu = input.nextLine();

            if (menu.equals("start")) {
                System.out.println("game loading");
            } else if (menu.equals("settings")) {
                System.out.println("game settings");
            } else if (menu.equals("quit")) {
                System.out.println("are you sure?");

                String YaSure = input.nextLine();

                if (YaSure.equals("yes")) {
                    System.out.println("Have a good day");
                    exit(0);
                }
            } // PANGITA UG MO LOOP SA BEGGINING
              // else if(YaSure.equals("no")){
              // }
              // v2
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            if (menu.equals("start")) {
                System.out.println("shuffling cards");
            } else if (menu.equals("settings")) {
                System.out.println("volume = 1,  ");
            }

            if (menu.equals("start")) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                // health
                int bot = 20;
                int player = 20;

                // v3
                // do
                do {

                    int cardno01 = rand.nextInt(6);
                    int cardno23 = rand.nextInt(6);
                    int cardno45 = rand.nextInt(6);

                    try {
                        System.out.println("your cards:");
                        // int AnimeChars = input.nextInt();
                        ArrayList<String> cards = new ArrayList<>();
                        cards.add("card0");
                        cards.add("card1");
                        cards.add("card2");
                        cards.add("card3");
                        cards.add("card4");
                        cards.add("card5");
                        System.out.println(cards.get(cardno01));
                        System.out.println(cards.get(cardno23));
                        System.out.println(cards.get(cardno45));
                    } catch (Exception e) {
                        System.out.println("Index Out Of Bounds Exception");
                    }

                    // v5
                    System.out.println("Choose your card:");
                    int tae = input.nextInt();
                    ArrayList<Integer> cards = new ArrayList<>();
                    cards.add(1);// 0
                    cards.add(2);// 1
                    cards.add(3);// 2
                    cards.add(4);// 3
                    cards.add(5);// 4
                    cards.add(6);// 5
                    System.out.println("player damage =" + "\t" + cards.get(tae));
                    // int c=3;

                    // bot damage
                    int botdmgran = rand.nextInt(6);
                    ArrayList<Integer> botdmg = new ArrayList<>();
                    botdmg.add(1);// 0
                    botdmg.add(2);// 1
                    botdmg.add(3);// 2
                    botdmg.add(4);// 3
                    botdmg.add(5);// 4
                    botdmg.add(6);// 5
                    System.out.println("bot damage =" + "\t" + botdmg.get(botdmgran));

                    // health
                    System.out.println("Health stats");

                    // int bot=10;
                    // int player=10;

                    System.out.println("player health =" + "\t" + player);
                    System.out.println("bot health =" + "\t" + bot);

                    // Re-write logic
                    // E himo ug if statements

                    // player bot health deduct
                    player = player - (botdmg.get(botdmgran));
                    bot = bot - (cards.get(tae));

                    // Logic end wag touch

                    // int player=x;
                    // int ;

                    System.out.println("remaining bot health =" + "\t" + bot);
                    System.out.println("remaining player health =" + "\t" + player);

                    // v6
                    // System.out.println("remaining player health =" + "\t" + x);
                    // buffer

                    System.out.println("\t" + "\t");

                    if (player <= 0) {
                        System.out.println("You lost"); // dimo println dunno why
                        exit(0);
                    } else if (bot <= 0) {
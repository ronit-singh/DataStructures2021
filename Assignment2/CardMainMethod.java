import java.util.Scanner;
import MyList;
import ListInterface;
import Deck;
import Card;
import java.util.ArrayList;     //import ArrayList  
import java.util.Random;        //import Random
import java.util.List;          //import List
import java.util.Collections;   //import Collections
import java.util.LinkedList;    //import LinkList

public class CardMainMethod {

    static boolean check = true;

    public static void main(String[] args){

        while(check){
            System.out.println("Start Game: [y]/[n]");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            if (x.isEquals("y")){
                LinkedList<Card> deck1 = new LinkedList<Card>();
                LinkedList<Card> deck2 = new LinkedList<Card>();
            
                deck1.addAll(cardDeck.subList(0, 25));                 //26 cards for player1       
                deck2.addAll(cardDeck.subList(26, cardDeck.size()));   //26 cards for player2

                Deck d = new Deck();
                d.Shuffle();
                d.initFullDeck();
                d.numCards();
                d.isEmpty();

                MyList ml = new MyList();
                if(!ml.isEmpty()){
                    if(deck1.size()>0){
                        ml.addFirst(E e);
                    }
                    else{
                        System.out.println("Player 2 is winner!");
                        break;
                    }
                    if(deck2.size()>0){
                        ml.addFirst(E e);
                    }
                    else{
                        System.out.println("Player 1 is winner!");
                        break;
                    }
                }
                ml.numElem();
                ml.addFirst(E e);
                ml.addLast(E e);
                ml.removeFirst();
                ml.remove(int position, E e);
                ml.checkFirst();
                ml.checkLast();
                ml.checkElement(position);

                Card c = new Card();
                c.getRank();
                c.getSuit();
                c.whichCard();
                c.isStrongerThan(Card c);
                c.isEqual(Card c);
                

                if(deck1.size() == 0 ){
                    System.out.println("game over! Player 1 wins the game");
                    break;
                }
                else if(deck2.size() == 0){
                    System.out.println("game over! Player 2 wins the game");
                    break;
                }
            }
            else if (x.isEquals("n")){
                System.out.println("Thank you for playing!");
                check = false;
                break;
            }
            else{
                System.out.println("Input either 'y' or 'n'!");
            }
        }
    }
}

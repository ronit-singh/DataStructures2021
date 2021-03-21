import java.util.Random;

public class Deck{
	
	/* Implements a Deck of cards */


	myList<Card> myDeck = new myList<Card>();


	public Deck(){

		/************************************************************/
		/* constructor, returns empty deck 
		/************************************************************/
	}

	public void Shuffle(){

		/************************************************************/
		Collections.shuffle(myDeck, new Random());       
		/************************************************************/
	}


	public void initFullDeck(){

		/************************************************************/
		for(int x=0; x<4; x++){          //0-3 for suit (4 suits)
            for(int y=2; y<15; y++){     //2-14 for rank (13 ranks)
                myDeck.add(new Card(x,y)); //create new card and add into the deck
            }
        }
		/************************************************************/

	}


	public int numCards(){

		/************************************************************/
		return myDeck.size();
		/************************************************************/


	}


	public boolean isEmpty(){

		/************************************************************/
		if (myDeck.size() == 0){
            return true;
        }
		/************************************************************/



	}







}
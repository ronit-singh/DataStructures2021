public class MyList<E> implements ListInterface<E>{
	

 /*Implements a singly linked list of generic types*/


/* We first defining the inner node class */

    private static class Node<E>{

        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){

            element = e;
            next = n;


        }

        public E getElement{return element; }
        public Node<E> getNext() {return next; }
        public void setNext(Node<E> n){next = n; }
    }

    /* We then define the instance variables */

    private Node<E> head = null; // head node of the list
    private Node<E> tail = null;
    private int size = 0;

    // Constructor: construct initially empty list
    public MyList() {
        LinkedList<Card> cardDeck = new LinkedList<>();
    }


    /* Methods from ListInterface */

    public boolean isEmpty(){ 

    /******************************************************************/
        if(cardDeck.size() == 0){
            return true;
        }
    /******************************************************************/


    }
    public int numElem(){
    /******************************************************************/
        return cardDeck.size();
    /******************************************************************/



    } // 
    public void addFirst(E e){

    /******************************************************************/
        cardDeck.addFirst(e);
    /******************************************************************/



    } 
    public void addLast(E e){
    /******************************************************************/
        cardDeck.addLast(e);
    /******************************************************************/




    } 
    public E removeFirst(){
    /******************************************************************/
        return cardDeck.removeFirst(); 
    /******************************************************************/

    }  
    public void insert(int position, E e){
    /******************************************************************/
        List<Card> list = new ArrayList<Card>(cardDeck);    // converting linked list to arraylist to use ArrayList.add() method
        list.add(position, e);
        List<Card> cardDeck = new LinkedList<Card>(list);   // converting back to linkedlist
    /******************************************************************/



    } 
                                            
    public E remove(int position, E e){
    /******************************************************************/ 
        return cardDeck.remove(position); 
    /******************************************************************/



    } 

    public E checkFirst(){
    /******************************************************************/
        return cardDeck.getFirst();
    /******************************************************************/




    }  
    public E checkLast(){
    /******************************************************************/
        return cardDeck.getLast();
    /******************************************************************/




    } 
    public E checkElement(int position){
    /******************************************************************/
        return cardDeck.get(position);
    /******************************************************************/


    }  




}
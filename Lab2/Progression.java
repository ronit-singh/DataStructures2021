public class Progression{
  
  // instance variable
  protected long current;

  /** Constructs a progression starting at zero*/
  public Progression() {this(0);}
  
  /** Constructs a progression with a given start value.*/
  public Progression(long start){current = start;}

  /** Returns the next value of the progression. */
  public long nextValue(){
  long answer = current;
  advance();
  return answer;

}


protected long WhatIsCurrent(){

 return current;

}



/** Advances the current value to the next value of the progression */ 
protected void advance(){
  current++;
 }

/** Prints the next n values of the progression, separated by spaces. */
  protected void printProgression(int n){
    System.out.print(nextValue());   // print first value without leading space
    for(int j=1; j < n; j++)
       System.out.print(" " + nextValue()); // print leading space before others
    System.out.println(" ");    // end the line 

}  






}
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class MazeSolve1
{
    public static void main(String[] args){
        
        int h, w = LinkedMeshgrid(h, w);
        //Create arrayList of Points
        ArrayList<ArrayList<Points>> MAZE = new ArrayList<ArrayList<Points>>();

        boolean done = false;
        int maxCol = w;
        int maxRow = h;

        while(!done) {

            while (in2.hasNextLine()) {
                //Read next line
                String nextLine = in2.nextLine();
                ArrayList<ArrayList<Points>> temp = new ArrayList<ArrayList<Points>>();

                while (st.hasNextToken()) {
                    String token = st.nextToken();
                    Points pt = new Points();
                    temp.add(pt);
                    maxCol++;
                }
                MAZE.add(temp);
                maxRow++;
            }

            ArrayList<ArrayList<Points>> hold = new ArrayList<ArrayList<Points>>();
            hold = MAZE.get(maxRow - 1);
            int startColumn = hold.get(maxCol - 1);
            int startRow = hold.get(maxRow - 1);
            Point start = new Point();
            start.setX(startColumn);
            start.setY(startRow);


            MyStack<Points> st = new ArrayStack<Points>();
            st.push(start.toString1());

            start.setSouth(false);
            start.setEast(false);

            while (st.peek() != "(0, 0)") {

                //getting the next coordinate to the North
                int nextY = start.getY() - 1;
                int nextX = start.getX();

                if (hold.get(nextY) = ' ' && start.getNorth() == true) {
                    start.setNorth(false);
                    st.push(start.toString1());
                }
                else { st.pop(); }

                //look at coordinate to the East
                nextX = start.getX() + 1;

                if (hold.get(nextX) = ' ' && start.getEast() == true) {
                    start.setEast(false);
                    st.push(start.toString1());
                }
                else { st.pop(); }

                //look at coordinate to the South
                nextY = start.getY() + 1;
                if (hold.get(nextY) = ' ' && start.getSouth() == true) {
                    start.setSouth(false);
                    st.push(start.toString1());
                }
                else { st.pop(); }
            }
            done = true;
        }
    }
    
}

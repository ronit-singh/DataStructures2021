public class Mark {

    public void tree(){

        int h, w = LinkedMeshgrid(h, w);

        if ((h*w) > 0){
            int counter = 1;
            first = new Node(counter++);
            Node columnMarker, rowMarker = first;
            for(int x=0; x<(h*w)-1; x++){
                columnMarker.setRight(new Node(counter++));
                columnMarker.getRight().setLeft(columnMarker); 
                columnMarker = columnMarker.getRight();
            }
    
            for(int x=0; x<(h*w)-1;x++){
                rowMarker.setBelow(new Node(counter++));
                rowMarker.getBelow().temp.setAbove(rowMarker);
                rowMarker = rowMarker.getBelow();
                columnMarker = rowMarker;
    
                for(int y0; y<(h*w)-1;y++){
                    columnMarker.setRight(new Node(counter++));
                    columnMarker.getRight().setLeft(columnMarker);
                    columnMarker.getRight().setAbove(columnMarker.getAbove().getRight());
                    columnMarker.getRight().getAbove().setBelow(columnMarker.getRight());
    
                    columnMarker = columnMarker.getRight();
                }
                
            }
            
            
        }

    }


    // solving maze by using DFS answer in Points.java and MazeSolve1.java
    

}

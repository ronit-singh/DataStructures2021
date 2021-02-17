import javax.swing.JPanel;

import java.awt.*;

public class TargetPanel_Answer extends JPanel{


	private final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;

	// setting up the target panel 

	public TargetPanel_Answer(){

		setBackground (Color.cyan);
		setPreferredSize(new Dimension(300,300));

	}


	// Paint the target

	public void paintComponent(Graphics page){

		super.paintComponent(page);

		int x =0, y=0, diameter = MAX_WIDTH;
		
        for(int i=1; i <= NUM_RINGS; i++){

            if(i%2==0){

				page.setColor(Color.white);
				page.fillOval(x, y, diameter, diameter);

			}
			
            else{

				page.setColor(Color.black);
				page.fillOval(x, y, diameter, diameter);

			}

			diameter -= 2*RING_WIDTH;
			x+=RING_WIDTH;
			y+=RING_WIDTH;	

        }

		page.setColor(Color.red);
		page.fillOval(x, y, diameter, diameter);

	}

}
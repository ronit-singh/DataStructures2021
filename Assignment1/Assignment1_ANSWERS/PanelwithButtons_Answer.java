  
import javax.swing.JFrame;

public class PanelwithButtons_Answer{


		public static void main (String [] args){


			JFrame frame = new JFrame ("Button Frame");

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(new ButtonDigicode_Answer());

			frame.pack();
			frame.setVisible(true); 



		}
	




} 
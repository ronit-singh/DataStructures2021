import javax.swing.*;

public class Target_Answer
{

	// draw the main frame
	public static void main(String[] args)
	{

		JFrame frame = new JFrame ("Target");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		TargetPanel_Answer panel = new TargetPanel_Answer(); 
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

    }
}


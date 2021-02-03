import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDigicode extends JPanel{


	private JButton button0, button1;
	private JLabel label;
	private JPanel buttonPanel;



	public ButtonDigicode(){
		// constructor, sets up the GUI 

		button0 = new JButton("0");
		button1 = new JButton("1");


		ButtonListener listener = new ButtonListener();
		button0.addActionListener(listener);
		button1.addActionListener(listener);

		label = new JLabel("Indicate a number between 0 and 9");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200,100));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(button0);
		buttonPanel.add(button1);

		setPreferredSize(new Dimension(200,200));
		setBackground(Color.cyan);
		add(label);
		add(buttonPanel);

	}

		// defining the listener for the buttons

		private class ButtonListener implements ActionListener {


			public void actionPerformed (ActionEvent event){


				if(event.getSource() == button1)
					label.setText("1");
				else
					label.setText("0");

			}


		}




}
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MyFrame extends JFrame{

	

	MyFrame(){
		setTitle("MojeOkno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(100,100,200,200);
		setLocation(10,10);
		//setSize(1000,1000);
		//setLocationRelativeTo(10,10);

		JPanel panel =new JPanel();
		panel.setPreferredSize(new Dimension(1000,1000));
		//panel.setBackgroud(Color.blue);
		getContentPane().add(panel);

		pack();
		setVisible(true);
	}

	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;
		Sanie s = new Sanie();
		String[] steps = Lista.getLista();

		for(String step : steps){
		Direction dir = Direction.parseDir(step.substring(0,1));
		int numOfSteps = Integer.parseInt(step.substring(1));

		int x = getX()+500;
		int y = getY()+500;

		s.move(dir, numOfSteps);

		g2D.drawLine(x,y,getX()+500,getY()+500);
			
		}
		
	}
}
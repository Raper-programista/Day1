import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import static java.lang.Math.*;
class Main {
public static void main(String[] args) {
    Sanie s = new Sanie();
		int count =0;
		String[] steps = Lista.getLista();

	/*for(String step : steps){
		Direction dir = Direction.parseDir(step.substring(0,1));
		int numOfSteps = Integer.parseInt(step.substring(1));

		s.move(dir, numOfSteps);
		count++;
			
	}


	int x = abs(s.getX());
	int y = abs(s.getY());
	int result = x+y;	
	System.out.println(count);
	System.out.println(result);*/
		new MyFrame();

			
  }
}
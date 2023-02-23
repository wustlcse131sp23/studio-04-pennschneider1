package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.5);
		StdDraw.filledRectangle(0.9, 0.9, 1,0.3);
		StdDraw.filledRectangle(0.4, 0.1, 1,0.3);
		//StdDraw.filledRectangle(0.3, 0.4, 0.1,1);
		
		StdDraw.show();
		
	}
}
package studio4;

import java.io.File;	
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color; 

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		//ellipse 73 0 146 false 0.5 0.5 0.2 0.2
		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double paramater1 = in.nextDouble();
		double paramater2 = in.nextDouble();
		double paramater3 = in.nextDouble();
		double paramater4 = in.nextDouble();
		Color Movember = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(Movember);
		
		if (shape.equals("rectangle")){
			if(isFilled == true)
			StdDraw.filledRectangle(paramater1, paramater2, paramater2, paramater2);
			
		}
			
		
		
	}
}

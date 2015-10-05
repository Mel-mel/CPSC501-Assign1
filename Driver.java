//Last Name: Ta                                                                                                                                             
//First Name: Melissa                                                                                                                                       
//Student ID: 10110850                                                                                                                                      
//Course: CPSC 233                                                                                                                                          
//Tutorial Section: 05 
//Assignment: 2
//This program draws 2D shapes of a rectangle, a left triangle, and a right triangle. The programs takes in an input file and extracts the components into differet variables so that they can be passed into the Draw class. The Driver class will take be creating objects to draw the shapes. I also used the code from James Tam's website to read the input file for this assignment (I do not own his code). I was not able to draw the right triangle properly.
import java.io.*;

/*
  Author:  James Tam
  Version: Jan 21, 2013

  External source code used:
  * Getting the command-line input
  * Reading from file
  * Converting the lines from file to numeric form.
*/

public class Driver
{
	private static FileReader fr = null;
    private static BufferedReader br = null;
    private static String filename = null;
    private static String lineFromFile = null;
    private static boolean finished = false;

    private static String rectangleStr;

    private static String triangleStr;
    
    private static String strHeight, strWidth;
    
    private static int height, width, triSize;
    
    private static char appearanceRect, appearanceLTri, appearanceRTri;
    public static void main(String [] args) throws Exception
    {
    	//Need to put this into Draw class.
    	readFromFile(args);
    	extractRectContent();
    	extractTriContent();
    	extractTriContent();
		//extractRightTriContent();
		//extractLeftTriContent();
		
		//Creates new rectangle object.		
		Draw aRectangle = new Draw();
		aRectangle.drawRectangle(rectangleStr, width, height);
        //Create new Left triangle object.
        Draw aLeftTri = new Draw();
        aLeftTri.drawLeftTriangle(triangleStr, triSize);
        //Creates new Right triangle object.
		Draw aRightTri = new Draw();
		aRightTri.drawRightTriangle(triangleStr, triSize);
		//Displays the results for the drawings.
		Draw some_results = new Draw();
		//some_results.showResults(SHAPE_TYPE_RECT, SHAPE_TYPE_LEFTTRI, SHAPE_TYPE_RIGHTTRI);
            
        }
    
    //This is to extract the components for the rectangle.
    public static void extractRectContent() throws IOException
    {
    	
		rectangleStr = lineFromFile.substring(2, 3);
		strHeight = lineFromFile.substring(3, 4);
		strWidth = lineFromFile.substring(4);
		height = Integer.parseInt(strHeight);//Converts height into an integer.
		width = Integer.parseInt(strWidth);//Converts the width into an integer.
		lineFromFile = br.readLine();
		//final String SHAPE_TYPE_RECT = lineFromFile.substring(0, 2);
    }
    /*
    //This is to extract the components for the Left Triangle.
    public static void extractLeftTriContent()
    {
    	
		appearanceLeftTri = lineFromFile.substring(2, 4);
		String strSize = lineFromFile.substring(3, 4);
		triSize = Integer.parseInt(strSize);//Converts variable to an integer.
		appearanceLTri = appearanceLeftTri.charAt(0);//Converts to the variable to a character.
		//final String SHAPE_TYPE_LEFTTRI= lineFromFile.substring(0, 2);
    					
    }
    
    //This is to extract the component for the Right Triangle.
    public static void extractRightTriContent()
    {
    	appearanceRightTri = lineFromFile.substring(2, 4);
		String strSize = lineFromFile.substring(3, 4);
		triSize = Integer.parseInt(strSize);//Converts variable to an integer.
		appearanceRTri = appearanceRightTri.charAt(0);//Converts to the variable to a character.
		//final String SHAPE_TYPE_RIGHTTRI = aLine2.substring(0, 2);
    }*/
    
    public static void extractTriContent() throws IOException
    {
    	triangleStr = lineFromFile.substring(2, 3);
    	String strSize = lineFromFile.substring(3, 4);
    	triSize = Integer.parseInt(strSize);
    	lineFromFile = br.readLine();
    }
    
	public static void readFromFile(String [] args) throws Exception
	{
		// JT: The first and only input to the program (after name of Java 
	    // file) must be the name of the input file. 
	    // the 
	    if (args.length != 1)
	        System.out.println("Usage:java Guessing <name of input file>");
	    else
	    {
	        filename = args[0];
			printBanner();
		
			fr = new FileReader(filename);
		    br = new BufferedReader(fr);
		    lineFromFile = br.readLine();
		
		    // JT: Empty input file
		    if (lineFromFile == null)
		    {
		        System.out.println("Empty input file: no guesses to play with");
		        finished = true;
		    }
	    }
	}
	public static void printBanner()
	{
		//This is the my banner.
		System.out.println("Last Name: Ta");
		System.out.println("First Name: Melissa");
		System.out.println("Student ID: 10110850");
		System.out.println("Course: CPSC 233");
		System.out.println("Tutorial Section: 05");
		System.out.println("Assignment: 2");
	}
}

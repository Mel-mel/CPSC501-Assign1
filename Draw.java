//Last Name: Ta
//First Name: Melissa
//Student ID: 10110850
//Course: CPSC 233
//Tutorial Section: 05
//Assignment: 2

public class Draw{
    //Attributes of the class Draw.
	private String appearance;
	private int width;
	private int height;
    
	public Draw(int w, int h, String a)
	{
		width = w;
		height = h;
		appearance = a;
	}
	
    //This is the method that draws the rectangle.
	public void drawRectangle(){
	    height = height + 1;
	    width = width + 1;
	    //This loop draws the rectangle.
	    for(int p = 1; p < height; p++){
		for (int q = 1; q < width; q++){
		    System.out.print(appearance);
		}
		System.out.println("");
	    }
	    System.out.println("");

	}

    //This is the method that draws the Left Triangle.
	public void drawLeftTriangle(){
	    //This loop draws the left triangle. It also decrements the width to make the triangle more distinct.
	    for(int j = 0; j < height; j++)
	    {
	    	for(int k = 0; k < width; k++)
	    	{
			    System.out.print(appearance);
			    
			    System.out.print("");
			}
			width--;//Decreases width.
			System.out.println("");
		}
	    System.out.println("");
	}
    //This method draws the Right Triangle. This loop only draws a rectangle at the moment. Was not able to draw the right triangle properly.
	public void drawRightTriangle(){
	    for(int i = 0; i < height; i++)
	    {
	    	for(int j = 0; j < width - 1; j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	width--;
	    	for(int k = height; k > width; k--)
	    	{
	    		System.out.print(appearance);
	    	}
	    	System.out.println("");
	    }
	}
    //This method prints the final results after the program is finished drawing.
        public void showResults(final String SHAPE_TYPE_RECT, final String SHAPE_TYPE_LEFTTRI, final String SHAPE_TYPE_RIGHTTRI){
            System.out.println("\nTotals for the number of shapes drawn");
            int num_Rect = 1;
	    System.out.println("Rectangles: " + num_Rect);
	    int num_LeftTri = 1;
	    System.out.println("Left Triangles: " + num_LeftTri);
	    int num_RightTri = 1;
	    System.out.println("Right Triangles: " + num_RightTri);
       }
	 

}
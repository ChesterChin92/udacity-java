// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
      int diameter = radius * 2;
        
        int numOfRows = (int) ((length-diameter)/(radius * Math.sqrt(3)))+1;
        System.out.print(numOfRows);
        int columnPerOddRow = (int) width/diameter;
        int columnPerEvenRow = (int) (width-radius)/diameter;
        
        int oddRows = (int)((numOfRows/2) + (numOfRows%2));
        int evenRows = (int) (numOfRows/2);
        //Debug Purpose
        //System.out.println("Colnumoddrow"+columnPerOddRow);
        //System.out.println("Oddrow"+oddRows);
        //System.out.println("Colnumevenrow"+columnPerEvenRow);
        //System.out.println("evenrow"+evenRows);
        int answer = (columnPerOddRow * oddRows) + (columnPerEvenRow * evenRows);
        
        return answer;
        
        
        
        
    }
}

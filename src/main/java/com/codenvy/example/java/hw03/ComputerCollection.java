
package hw03;
//********************************************************************
// Javin Towers
// CS-185 
// Section 2
// Computers.java       
// Represents a collection of computers.
//
//********************************************************************

import java.text.NumberFormat;

public class ComputerCollection {
	
    public double updatecost(String title,double Newcost)
{
	double result =0.0;
	for(int index = 0; index < count; index ++)
	{
		if (title.equals(collection[index].getMacBook()))
		{
			result= collection[index].getCost();
			collection[index].setCost(Newcost);
		}	
	}
	return result;
}
	
	
    private COMP[] collection;
    private int count;
    private double totalCost;

    //-----------------------------------------------------------------
    //  Constructor: Creates an initially empty collection.
    //-----------------------------------------------------------------
    public ComputerCollection() {
        collection = new COMP[100];
        count = 0;
        totalCost = 0.0;
    }

    //-----------------------------------------------------------------
    //  Adds a comps to the collection, increasing the size of the
    //  collection array if necessary.
    //-----------------------------------------------------------------
    public void addComp(String macBook, String type, String stats1, String stats2, String stats3,
        double cost) {
        if (count == collection.length)
            increaseSize();

        collection[count] = new COMP(macBook, type, stats1, stats2, stats3, cost);
        totalCost += cost;
        count++;
    }

    public void Sort() {
        //  Create a pointer to hold the temp for switching
        COMP temp;

        // two nested loops.  Go through entire list less 1)
        for (int index = 0; index < count - 1; index++) {
            //inner for loop to go through list starting with next index to see if smaller
            for (int index2 = index + 1; index2 < count; index2++) {
                // which zipcode is smaller..if less, switch them

                //if (collection[index2].getCost() < collection[index].getCost())

                //  if the field is a string, do the compare using the String compareTo

                if (collection[index2].getMacBook().compareTo(collection[index].getMacBook()) < 0)

                //swap them

                {
                    temp = collection[index2];
                    collection[index2] = collection[index];
                    collection[index] = temp;

                }
            }

        }
    }
    public void addComp(COMP obj) {
        if (count == collection.length)
            increaseSize();

        collection[count] = obj;
        totalCost += obj.getCost();
        count++;
    }


    
    //-----------------------------------------------------------------
    //  Returns a report describing the comp collection.
    //-----------------------------------------------------------------
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

      
        String report = "My Computer Collection\n\n";

        report += "Number of Computers: " + count + "\n";
        report += "Total Cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost / count);

        ////////////////////////////////////////////////////////////////
        // Header if the collection to be printed
        ////////////////////////////////////////////////////////////////

        report += "\n\nComputer List:\n\nCost:" + "\t\t\t Specs1: " + "\t\t\t\t   Specs2:" + "\n\n";

        for (int compz = 0; compz < count; compz++)
            report += collection[compz].toString() + "\n";

        return report;
    }

    //-----------------------------------------------------------------
    //  Increases the capacity of the collection by creating a
    //  larger array and copying the existing collection into it.
    //-----------------------------------------------------------------
    private void increaseSize() {
        COMP[] temp = new COMP[collection.length * 2];

        for (int dvd = 0; dvd < collection.length; dvd++)
            temp[dvd] = collection[dvd];

        collection = temp;
    }
}
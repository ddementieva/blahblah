
package hw03;
//********************************************************************
//Javin Towers
//CS-185 
//Section 2
//Comp.java       
//Represents a computer.
//
//********************************************************************


import java.text.NumberFormat;

public class COMP {
    private String macBook;
    private String type;
    private String stats1;
    private String stats2;
    private String stats3;
    private double cost;

    ///////////////////////////////////////////////////////////////////
    //  Creates a new comps with the specified information.
    ///////////////////////////////////////////////////////////////////
    public COMP(String macBook, String type, String stats1, String stats2, String stats3, double cost) {
        this.macBook = macBook;
        this.type = type;
        this.stats1 = stats1;
        this.stats2 = stats2;
        this.stats3 = stats3;
        this.cost = cost;
    }

    ///////////////////////////////////////////////////////////////////
    ////////////////////// Getters and Setters  ///////////////////////
    ///////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////
    //  getter
    ///////////////////////////////////////////////////////////////////


    public String getMacBook() {
        return macBook;
    }

    ///////////////////////////////////////////////////////////////////
    //  setter
    ///////////////////////////////////////////////////////////////////
    public void setMacBook(String macBook) {
        this.macBook = macBook;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStats1() {
        return stats1;
    }

    public void setStats1(String stats1) {
        this.stats1 = stats1;
    }

    public String getStats2() {
        return stats2;
    }

    public void setStats2(String stats2) {
        this.stats2 = stats2;
    }

    public String getStats3() {
        return stats3;
    }

    public void setStats3(String stats3) {
        this.stats3 = stats3;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;

        description = fmt.format(cost) + "\t"+ macBook +"\t"+ type +"\t"+ stats1 +"\t"+ stats2 +"\t"+ stats3 + "\n";



        return description;
    }
}
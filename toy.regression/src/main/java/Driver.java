package main.java;

public class Driver {

    public static void main(String[] args ) {
        double[][] data = CSVParser.readCSV( "toy.regression/data/test.csv" );
        System.out.println( data.length );
        System.out.println( data[0].length );
    }
}

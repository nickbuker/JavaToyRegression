package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * TODO
 */
public class CSVParser {

    /**
     * TODO
     *
     * @param fileName  name of csv file to be ingested
     * @return
     */
    public static double[][] readCSV( String fileName ) {
        File file = new File( fileName );
        List<List<String>> lines = new ArrayList<>();
        try {
            Scanner inputStream = new Scanner( file );
            while ( inputStream.hasNext() ) {
                String line = inputStream.next();
                String[] values = line.split(",");
                lines.add( Arrays.asList( values ) );
            }
            inputStream.close();
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        }
        double[][] data = new double[lines.size()][lines.get(0).size()];
        for ( int i = 0; i < lines.size(); i++ ) {
            for ( int j = 0; j < lines.get(0).size(); j++ ) {
                data[i][j] = Double.parseDouble( lines.get( i ).get( j ) );
            }
        }
        return data;
    }
}

package daoPattern.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookingCollection implements BookingDao {
    public static void bookFlight() throws IOException {

        String fileName = "book.txt";
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
       // writer.write(String.valueOf(loginMap));
        writer.close();
    }

}

package reviewclass11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configFile {
    public static void main(String[] args) {
        // location of the files
        String path="Files/config.properties";
        // navigating to the file
        // whenever we have to read the data from a file we use FileInputStream

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            // This Properties class will assist us to read and write data to .properties files
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("user"));

        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong");;
        } catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }

    }
}

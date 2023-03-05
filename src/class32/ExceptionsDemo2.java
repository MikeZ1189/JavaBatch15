package class32;

import utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException {
       try{
            ExcelReader.read();
        }catch (Exception e){
            System.out.println(e);
        }

      //  ExcelReader.read();

    }
}

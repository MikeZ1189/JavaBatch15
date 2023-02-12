package class24;
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
 */
public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("Editing file");
    }
    void close(){
        System.out.println("Closing file ");
    }
}
class JavaFile extends File{
    JavaFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++");
    }
}
class WordFile extends File{
    WordFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft Word");
    }
}
class PdfFile extends File{
    PdfFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe Reader");
    }
}

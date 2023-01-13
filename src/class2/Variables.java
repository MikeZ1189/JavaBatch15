package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory.
        We are calling it box1, if we need the information that we are storing inside this box
        we can  simply say to the computer give us the contents of box1.
        int = what type of date we want to store
        box1 = the name of the box
        10 = what is stored in the box
         */
        int box1=10;
        // if we are printing something from a box we dont need ""
        System.out.println(box1); // this is the output
        byte box2=127;  //byte range is -128 to 127
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=123456484; //most common type of box
        long maxBox=15131351465464L;

        short myBox=10000;
        System.out.println(myBox);



    }
}


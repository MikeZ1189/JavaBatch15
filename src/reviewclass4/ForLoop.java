package reviewclass4;

public class ForLoop {
    public static void main(String[] args) {
        // best loop - used when we know how many times we want to repeat a block of code
        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);

        }
        System.out.println(" ------------------- ");
        // keywords: break and continue
        // break = breaks block of code, used with switch
        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;
            }
        }
        System.out.println(" ------------------- ");
        // continue = skips current iteration
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;//java goes back to the beginning of the loop
                //and skips the rest of hte code that is inside the loop body
            }
            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println("Hope you're well");
        }
    }
}

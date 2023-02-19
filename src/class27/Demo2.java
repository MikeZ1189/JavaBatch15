package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Savo";
        String[] names = {"Haral", "Nima", "Laura", "Nat"};
        // create a method which can search a name from this array return true if name is present in the array
        System.out.println(findName(name,names));
        String [] arr=new String[2];

        names[4]="Shah";
    }

        public static boolean findName(String search, String [] names){
            for (String name : names) {
                if (search.equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }


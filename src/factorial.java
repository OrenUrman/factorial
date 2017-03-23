/**
 * @author OrenUrman
 */
public class factorial {
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Invalid number of arguments.");
            System.exit(1);
        }
        try {
            System.out.println(fact(Integer.parseInt(args[0])));
        }catch (NumberFormatException ex){
            System.out.println("Wrong type of argument");
        }

    }

    public static int fact (int i){
        return ((i == 0) ? 1 : i * fact(i - 1));
    }
}

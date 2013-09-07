import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 07.09.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String command = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            command = br.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        if(command.equals("grow")) {
            Tree tree = new Tree();
            tree.grow();
            System.out.println("You have grown a tree with " + tree.getAmount() + " apples!");
        }
        else {
            System.out.println("Error! Print correct command!");
        }
    }
}

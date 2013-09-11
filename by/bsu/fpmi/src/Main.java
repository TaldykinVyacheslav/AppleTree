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
        boolean isGrownEver = false;
        String command = new String();
        Tree tree = new Tree();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("the list of commands:\n"
                            + "\"grow\"  - grow a tree with random number of apples \n"
                            + "\"shake\" - shake the tree \n"
                            + "\"exit\"    - exit the program \n");
        System.out.println("Print a command:");

        while(true) {
            try {
                command = br.readLine();
            }
            catch(IOException e) {
                e.printStackTrace();
            }

            if(command.equals("grow")) {
                tree.grow();
                isGrownEver = true;
                System.out.println("You have grown a tree with " + tree.getAmount() + " apples!");
            }
            else if(command.equals("shake")) {
                if(isGrownEver) {
                    tree.shake();
                    System.out.println("You have shaken a tree! there are only "
                            + tree.getAmount() + " apples!");
                }
                else {
                    System.out.println("You can't shake a tree cause you've never grown it up!");
                }
            }
            else if(command.equals("exit")) {
                break;
            }
            else {
                System.out.println("Error! Print correct command!");
            }
        }
    }
}

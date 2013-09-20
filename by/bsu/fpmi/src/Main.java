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
        boolean isBlossomed = false;
        boolean isGrown = false;
        String command = new String();
        Tree tree = new Tree();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("the list of commands:\n"
                            + "\"blossom\"  - make tree to blossom"
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

            if(command.equals("blossom")){
                tree.blossom();
                isGrown = false;
                isBlossomed = true;

                System.out.println("The tree has blossomed with "
                                    + tree.getAmount() + " flowers on it!");
            } else if (command.equals("grow")) {
                if(isBlossomed) {
                    tree.grow();
                    isGrown = true;
                    isBlossomed = false;
                    System.out.println("You have grown a tree with "
                            + tree.getAmount() + " apples with "
                            + tree.seedsCount() + " seeds!");
                } else {
                    System.out.println("The tree has not blossomed yet!");
                }

            } else if (command.equals("shake")) {
                if(isGrown) {
                    tree.shake();
                    System.out.println("You have shaken a tree! there are only "
                            + tree.getAmount() + " apples with "
                            + tree.seedsCount() + " seeds!");
                } else {
                    System.out.println("You can't shake a tree cause it hasn't grown up yet!");
                }
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Error! Print correct command!");
            }
        }
    }
}

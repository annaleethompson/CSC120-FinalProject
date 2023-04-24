import java.util.Scanner;

public class Conversation {
    
    public static boolean won;
    public static String response;

    public static void main(String[] arguments) {
        User user = new User();
        System.out.println("Clue: A Murder Mystery");
        System.out.println("You enter the house to find yourself in an entryway. North of you there is a table with an envelope.");
        while (won=true) {
            Scanner scanner = new Scanner(System.in);
            response = scanner.nextLine();
            String[] split = response.split(" ");
            for (String element : split) {
                if (element.equals("Pick") || element.equals("pick")){
                }
                if (element.equals("Open") || element.equals("open")){
                }
                if (element.equals("West") || element.equals("west")){
                }
                if (element.equals("East") || element.equals("east")){
                }
                if (element.equals("North") || element.equals("north")){
                    User.goNorth();
                }
                if (element.equals("South") || element.equals("south")){
                }
            }
            scanner.close();
        }
    }

}

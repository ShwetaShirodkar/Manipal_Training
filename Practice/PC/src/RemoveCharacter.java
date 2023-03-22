import java.util.Scanner;

public class RemoveCharacter {
   
    private String string;
    private String charToRemove;

    public String removeCharacter(String string, String charToRemove) {
        if (string.indexOf(charToRemove) != -1) {
            String outputString = string.replaceAll(String.valueOf(charToRemove), "");
            System.out.println("Output string: " + outputString);
        } else {
            System.out.println("Character not found in the input string.");
        }
        return null;
    }
}
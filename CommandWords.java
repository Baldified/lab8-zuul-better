import java.util.Arrays;
/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 7.1
 */

public class CommandWords
{
    // A constant array that holds all valid command words.
    private static final String[] validCommands = {
        "go", "quit", "help", "help2"
    };
    public String cmd = "";
    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString)) {
                return true;
            }
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public String showAll() 
    {
        for(String command: validCommands) {
            cmd += (command + "  ");
        }
        System.out.println();
        return cmd;
    }
    public void getCommandList() {
        
    }
    public void getCommandInfo() {
        for(String command: validCommands) {
            if(command.equals("help2")){
                System.out.println("You can type go {north, south, east, west} to move depending on where you are.");
                System.out.println("You can type quit to stop the game");
                System.out.println("You can type help for more info");
            }
        }
    }
}

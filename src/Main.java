/**
 * @author butrim
 */
public class Main {

    public static void main(String[] args) {
        // context
        Journal journal = new Journal();
        CommandLineManager commandLineManager = new CommandLineManager(journal);

        commandLineManager.printMenuAndHandleCommand();
    }
}

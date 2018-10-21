package Lessons4;

public class CommandMaker {
    public JCommand createCommand(String userCommand) {
        String[] commandParts = userCommand.trim().split("\\s+");
        switch (commandParts[0].toLowerCase()) {
            case "chdir":
                if(commandParts.length < 2){
                    System.out.println("Enter correct path");
                }
                return new ChangeDirCommand(commandParts[1]);
            case "ls":
            case "exit":
            default:
        }
        return null;
    }
}

package Lessons4;

import java.nio.file.Paths;
import java.util.Scanner;

public class JConsole {
    private Scanner scanner = new Scanner(System.in);


    public void runJConsole(){
        System.out.println("Welcome to JConsole");
        ExecutionContext ec = new ExecutionContext();
        ec.setPath(Paths.get("").toAbsolutePath());
        System.out.printf("%n<%s> =>",ec.getPath());
    }

    protected String getUserCommand(){
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        JConsole jc = new JConsole();
        jc.runJConsole();

    }

}

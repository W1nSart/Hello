package Lessons4;

import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirCommand implements JCommand {
    private String arg;

    ChangeDirCommand(String str) {
        this.arg = str;
    }

    @Override
    public boolean execute(ExecutionContext executionContext) {
        Path path = executionContext.getPath();
        path = path.resolve(arg).normalize();
        if (!Files.isDirectory(path)) {
            System.out.printf("Wrong directory %s%n", path.toString());

        } else executionContext.setPath(path);
        return true;
    }
}

package patterns.behavioral_patterns.command;

public class OpenCommand implements Command {
    private FSReceiver fileSystem;

    public OpenCommand(FSReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}

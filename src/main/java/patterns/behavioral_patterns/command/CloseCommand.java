package patterns.behavioral_patterns.command;

public class CloseCommand implements Command {
    private FSReceiver fileSystem;

    public CloseCommand(FSReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}

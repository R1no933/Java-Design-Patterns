package patterns.behavioral_patterns.command;

public class WriteCommand implements Command {
    private FSReceiver fileSystem;

    public WriteCommand(FSReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}

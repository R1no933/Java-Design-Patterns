package patterns.behavioral_patterns.command;

public class CommandRunner {
    public static void main(String[] args) {
        FSReceiver fileSystem = FSReceiverUtil.getFS();

        OpenCommand openCommand = new OpenCommand(fileSystem);
        FileInvoker file = new FileInvoker(openCommand);
        file.execute();

        WriteCommand writeCommand = new WriteCommand(fileSystem);
        file = new FileInvoker(writeCommand);
        file.execute();

        CloseCommand closeCommand = new CloseCommand(fileSystem);
        file = new FileInvoker(closeCommand);
        file.execute();
    }
}

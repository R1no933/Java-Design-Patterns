package patterns.structural_patterns.proxy;

public class ExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public ExecutorProxy(String user, String password) {
        if("Dmitriy".equals(user) && "P@ssw0rd".equals(password)) {
            isAdmin = true;
            executor = new ExecutopImplementation();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin) {
            executor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("RD")) {
                throw new Exception("Permission is denied! Need admin right!");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}

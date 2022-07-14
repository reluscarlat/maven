package com.example.designpatterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor{

    private CommandExecutor commandExecutor = new CommandExecutorImpl();
    private boolean isAdmin;

    public CommandExecutorProxy(String userName, String password) {
        // isAdmin validation login
        isAdmin = true;
    }

    @Override
    public void execute(String s) {
        if(isAdmin) {
            commandExecutor.execute(s);
        } else {
            throw new RuntimeException("Not Authorized");
        }
    }
}

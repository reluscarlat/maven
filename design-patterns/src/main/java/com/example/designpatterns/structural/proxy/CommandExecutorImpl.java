package com.example.designpatterns.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void execute(String s) {
        System.out.println("> "+ s);
    }
}

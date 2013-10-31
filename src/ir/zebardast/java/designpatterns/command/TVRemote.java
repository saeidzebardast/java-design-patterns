package ir.zebardast.java.designpatterns.command;

public class TVRemote {

    public static ElectronicDevice getDevice() {

        return new Television();

    }

}
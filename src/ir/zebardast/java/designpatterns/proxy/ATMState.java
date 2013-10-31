package ir.zebardast.java.designpatterns.proxy;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
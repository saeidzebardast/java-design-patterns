package ir.zebardast.java.designpatterns.mediator;

public class JTPoorman extends Colleague {

    public JTPoorman(Mediator newMediator) {
        super(newMediator);

        System.out.println("JT Poorman signed up with the stockexchange\n");

    }

}
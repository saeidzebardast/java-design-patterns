package ir.zebardast.java.designpatterns.decorator;

public abstract class PizzaAbstract {


    public abstract void setDescription(String newDescription);

    public abstract String getDescription();

    public abstract void setCost(double newCost);

    public abstract double getCost();

    // I could use getter and setter methods for every
    // potential Pizza topping

}

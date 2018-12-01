package com.dalvikmx.bridgepattern;

public class Sandwich extends AbstractSandwich {

    private String filing1, filing2;

    public Sandwich(String filing1, String filing2, SandwichInterface sandwichInterface) {
        super(sandwichInterface);
        this.filing1 = filing1;
        this.filing2 = filing2;
    }

    @Override
    public void make() {
        sandwichInterface.makeSandwich(filing1, filing2);
    }
}

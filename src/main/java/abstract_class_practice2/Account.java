package abstract_class_practice2;

public abstract class Account {

    private String name;

    public abstract double withDraw();

    public void whateverMethod() {

    }
}

interface AccountInterface {
    double withDraw();
    void deposit(double amount);
}

interface WhateverInterface {
    void someMethod();
}

class SavingsAccountImpl implements AccountInterface, WhateverInterface {

    @Override
    public double withDraw() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void someMethod() {

    }
}

class CheckingAccountImpl implements AccountInterface {

    @Override
    public double withDraw() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }
}

class SavingAccount extends Account {

    private double savingAccountSpecificField;

    public SavingAccount(double savingAccountSpecificField) {
        this.savingAccountSpecificField
                = savingAccountSpecificField;
    }

    @Override
    public double withDraw() {
        System.out.println("withdrawing from savings account");
        return savingAccountSpecificField;
    }
}

class CheckingAccount extends Account {
    private double checkingAccountSpecificField;

    @Override
    public double withDraw() {
        System.out.println("withdrawing from checking account");
        return checkingAccountSpecificField;
    }
}

class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount(10.0);
        account1.withDraw();
    }
}

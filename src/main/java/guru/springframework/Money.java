package guru.springframework;

public abstract class Money {

    protected int amount;

    protected abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;

        return amount == money.amount
                && getClass().equals(object.getClass());
    }
}

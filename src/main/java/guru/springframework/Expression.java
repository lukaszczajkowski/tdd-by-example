package guru.springframework;

public interface Expression {
    Expression plus(Expression addend);

    Money reduce(Bank bank, String to);

    Expression times(int multiplier);
}

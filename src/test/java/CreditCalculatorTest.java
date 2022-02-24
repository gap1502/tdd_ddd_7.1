import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {

    private final int summa = 1_000_000;
    private final double percent = 8.2;
    private final int period = 36;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void CalculationMonthPay() {
        int expected = 31428;
        int actual = calculator.monthPay(summa, percent, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculationTotalAmount() {
        int expected = 1131433;
        int actual = calculator.totalAmount(summa, percent, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalculationOverPay() {
        int expected = 131433;
        int actual = calculator.overPay(summa, percent, period);
        Assertions.assertEquals(expected, actual);
    }
}

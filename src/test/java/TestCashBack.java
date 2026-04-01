import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.CashBack;


class TestCashBack {

    @Test
    public void checkIfSubscribedUnderLimit() {
        int purchaseSum = 20_000;
        boolean ifSubscribed = true;
        int expectedResult = 2_000;
        CashBack calculator = new CashBack();

        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfSubscribedOverLimit() {
        int purchaseSum = 20_000_00;
        boolean ifSubscribed = true;
        int expectedResult = 10_000;
        CashBack calculator = new CashBack();

        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfUnsubscribedUnderLimit() {
        int purchaseSum = 20_000;
        boolean ifSubscribed = false;
        int expectedResult = 1_000;
        CashBack calculator = new CashBack();

        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkIfUnsubscribedOverLimit() {
        int purchaseSum = 20_000_000;
        boolean ifSubscribed = false;
        int expectedResult = 10_000;
        CashBack calculator = new CashBack();

        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}

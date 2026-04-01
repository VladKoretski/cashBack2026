import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.mirea.CashBack;

public class TestCashBackParameterized {

    @ParameterizedTest
    @CsvSource(value = {"20000,false,1000", "2000000,false,10000", "20000,true,2000", "100000,true,10000",
            "200000,true,10000"})
    public void checkEverythingCsvSource(int purchaseSum, boolean ifSubscribed, int expectedResult) {

        CashBack calculator = new CashBack();
        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testdata.csv")
    public void checkEverythingCsvFileSource(int purchaseSum, boolean ifSubscribed, int expectedResult) {

        CashBack calculator = new CashBack();
        int actualResult = calculator.bonusCalculator(ifSubscribed, purchaseSum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

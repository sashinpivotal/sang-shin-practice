package exception_practice;

import java.time.LocalDate;

public class MyOwnArithmeticException
        extends ArithmeticException {
    private LocalDate localDate = LocalDate.now();

    public LocalDate getLocalDate() {
        return localDate;
    }
}

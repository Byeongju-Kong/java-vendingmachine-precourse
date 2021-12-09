package vendingmachine.exception;

public class ExceptionMessage {
    private ExceptionMessage() {
    }

    // Location : model/money/Money
    public static final String NOT_POSITIVE_INTEGER_EXCEPTION_MESSAGE = "금액은 양의 정수여야 합니다.";
    public static final String NOT_MULTIPLE_OF_TEN_EXCEPTION_MESSAGE = "금액의 최소 단위는 10원입니다.";


}

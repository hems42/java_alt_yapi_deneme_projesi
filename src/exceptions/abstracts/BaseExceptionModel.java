/*

package exceptions.abstracts;



import java.time.LocalDateTime;

@ResponseStatus
public abstract class BaseExceptionModel extends RuntimeException {

    private LocalDateTime timeStamp;
    private Integer errorCode;
    private String errorMessage;
    private String errorDescription;
    private String baseErrorCode;
    private HttpStatus baseStatusCode;
    private CoreEnumExceptionMessages coreEnumExceptionMessages;

    public BaseExceptionModel(CoreEnumExceptionMessages coreEnumExceptionMessages,
                              String baseErrorCode,
                              String errorDescription,
                              HttpStatus baseStatusCode) {
        super(errorDescription);
        this.coreEnumExceptionMessages = coreEnumExceptionMessages;
        errorCode = coreEnumExceptionMessages.getExceptionCode();
        errorMessage = coreEnumExceptionMessages.getExceptionMessage();
        this.errorDescription = errorDescription;
        this.baseErrorCode = baseErrorCode;
        this.baseStatusCode = baseStatusCode;


    }

    public LocalDateTime getTimeStamp() {
        return LocalDateTime.now();
    }

    public String getErrorCode() {
        return convertToSuperErrorCode();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    private String convertToSuperErrorCode() {
        String foundErrorCode = coreEnumExceptionMessages.getExceptionCode().toString();
        return baseErrorCode + foundErrorCode;
    }

    public HttpStatus getBaseStatusCode() {
        return baseStatusCode;
    }
}
*/
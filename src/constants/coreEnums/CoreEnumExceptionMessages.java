package constants.coreEnums;

public enum CoreEnumExceptionMessages {


    /*


    CUSTOM EXCEPTION CODES:


    - NOT : 4000
    - ALREADY : 3000
    - FORBIDDEN : 6000
    - UN : 2000


    //*****************************************************************


     - FOUND : 400
     - VALID : 200
     - SUCCESS : 500
     - ACCEPT : 600
     - EXIST : 100
     - AUTHORIZE : 700



     //******************************************************************



    SubErrorCodeList :

    USER : 5000

    ROLE : 5100

    REQUEST : 5200

    REFRESH TOKEN : 5300

    CONFIRMATION TOKEN : 5400

    EMAIL : 5500

    REGISTRATION : 5600

    LOGIN : 5700

    ACCESS TOKEN : 5800


    LOGOUT : 5900

     */




    //AUTHENTICATION***
      //REQUEST
    UNAUTHORIZED_REQUEST("UNAUTHORIZED_REQUEST",5227),

    // ACCESS TOKEN
    NOT_VALID_ACCESS_TOKEN_EXPIRED("ACCESS_TOKEN_EXPIRED",5842),
    NOT_FOUND_ACCESS_TOKEN("ACCESS_TOKEN_NOT_FOUND",5844),
    NOT_FOUND_ACCESS_TOKEN_USERNAME("ACCESS_TOKEN_USERNAME_NOT_FOUND",5844),
    UN_SUCCESSFUL_ACCESS_TOKEN_CREATE("UN_SUCCESSFUL_CREATED_ACCESS_TOKEN",5825),
    UN_ACCEPTABLE_ACCESS_TOKEN("UN_ACCEPTABLE_ACCESS_TOKEN",5826),


    //REFRESH TOKEN
    NOT_VALID_REFRESH_TOKEN_EXPIRED("REFRESH_TOKEN_EXPIRED",5342),
    NOT_FOUND_REFRESH_TOKEN("REFRESH_TOKEN_NOT_FOUND",5344),
    ALREADY_EXIST_REFRESH_TOKEN("REFRESH_TOKEN_ALREADY_EXIST",5331),
    UN_SUCCESSFUL_REFRESH_TOKEN_CREATED("UN_SUCCESSFUL_CREATED_REFRESH",5325),
    UN_SUCCESSFUL_REFRESH_TOKEN_RENEW("UN_SUCCESSFUL_RENEW_REFRESH",5325),
    UN_SUCCESSFUL_REFRESH_TOKEN_SAVED("UN_SUCCESSFUL_SAVED_REFRESH_TOKEN",5325),
    UN_SUCCESSFUL_REFRESH_TOKEN_DELETED("UN_SUCCESSFUL_DELETED_REFRESH_TOKEN",5325),

    //CONFIRMATION TOKEN
    NOT_VALID_CONFIRMATION_TOKEN_EXPIRED("CONFIRMATION_TOKEN_EXPIRED",5442),
    NOT_FOUND_CONFIRMATION_TOKEN("CONFIRMATION_TOKEN_NOT_FOUND",5444),
    ALREADY_ACCEPTED_CONFIRMATION_TOKEN_CONFIRMED("CONFIRMATION_ALREADY_CONFIRMED",5436),
    UN_SUCCESSFUL_CONFIRMATION_TOKEN_CONFIRMED("CONFIRMATION_TOKEN_NOT_CONFIRMED",5425),



    //EMAIL
    NOT_VALID_E_MAIL_ADDRESS("E_MAIL_ADDRESS_NOT_VALID",5542),
    NOT_FOUND_E_MAIL_ADDRESS("E_MAIL_ADDRESS_NOT_FOUND",5544),
    ALREADY_ACCEPTED_E_MAIL_ADDRESS("E_MAIL_ADDRESS_ALREADY_ACCEPTED",5536),


    //REGISTRATION
    UN_SUCCESSFUL_REGISTRATION("USER_NOT_CONFIRMED",5625),


    //ENTITY***
      //ROLE
    ALREADY_EXIST_ROLE("ROLE_ALREADY_EXIST", 5131),
    NOT_FOUND_ROLE("ROLE_NOT_FOUND", 5144),
    UN_SUCCESSFUL_ROLE_CREATED("ROLE_NOT CREATED", 5125),



      //USER
    NOT_FOUND_USER("USER_NOT_FOUND",5044),
    ALREADY_EXIST_USER("USER_ALREADY_EXIST",5031),
    UN_SUCCESSFUL_USER_CREATE("USER_NOT CREATED", 5025),
    UN_ACCEPTABLE_USER_PASSWORD("USER_PASSWORD_NOT_MATCHED",5026),

   //LOGIN
    UN_ACCEPTABLE_LOGIN_REQUEST("LOGIN REQUEST UNACCEPTABLE",5726),
    UN_SUCCESSFUL_LOGIN("USER_NOT_LOGIN", 5725),


    //LOGOUT
    UN_ACCEPTABLE_LOGOUT_REQUEST("LOGIN REQUEST UNACCEPTABLE",5926),
    UN_SUCCESSFUL_LOGOUT("USER_NOT_LOGOUT", 5925);




















    private String exceptionMessage;
    private Integer exceptionCode;

    CoreEnumExceptionMessages(String exceptionMessage, Integer exceptionCode) {
        this.exceptionMessage = exceptionMessage;
        this.exceptionCode = exceptionCode;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }
}

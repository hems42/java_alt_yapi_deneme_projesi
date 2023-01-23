package managers;

import java.util.HashMap;
import java.util.Map;

public class ExceptionCodeManager {
  /*


    CUSTOM EXCEPTION CODES:

   ******************************************************************

    Error_MainGroupCodeList :

    - UN                      : 10
    - ALREADY                 : 20
    - NOT                     : 30
    - NON                     : 40
    - FORBIDDEN               : 50




   *****************************************************************

    Error_SubGroupCodeList :

     - EXIST                  : 10
     - VALID                  : 20
     - FOUND                  : 30
     - SUCCESS                : 40
     - ACCEPT                 : 50
     - AUTHORIZE              : 60


   ******************************************************************

    Error_EntityCodeList :

      - USER                  : 010
      - ROLE                  : 020
      - REQUEST               : 030
      - REFRESH TOKEN         : 040
      - CONFIRMATION TOKEN    : 050
      - ACCESS TOKEN          : 060
      - REGISTRATION          : 070
      - LOGIN                 : 080
      - EMAIL                 : 090
      - SIGNUP                : 100
      - LOGIN                 : 101
      - LOGOUT                : 102


   ******************************************************************

    Error_EventCodeList :




     */

    //-Error_MainGroupCodeList :

    public  static final String _UN = "10";
    public static final String _ALREADY = "20";
    public static final String _NOT = "30";
    public static final String _NON = "40";
    public static final String _FORBIDDEN = "50";

    //-Error_SubGroupCodeList :

    public  static final String _EXIST = "10";
    public static final String _VALID = "20";
    public static final String _FOUND = "30";
    public static final String _SUCCESS = "40";
    public static final String _ACCEPT = "50";
    public static final String _AUTHORIZE = "60";

    //-Error_EntityCodeList :

    public static  String T_USER = "010";
    public static  String T_ROLE = "020";
    public static  String T_REQUEST = "030";
    public static  String T_REFRESH_TOKEN = "040";
    public static  String T_CONFIRMATION_TOKEN = "050";
    public static  String T_ACCESS_TOKEN = "060";
    public static  String T_REGISTRATION = "070";
    public static  String T_EMAIL = "080";
    public static  String T_SIGNUP = "090";
    public static  String T_LOGIN = "091";
    public static  String T_LOGOUT = "092";

    //-Error_ExceptionMessageCodeList :

    public static String B_NOT_FOUND_EXCEPTION_ERROR_CODE = _NOT + _FOUND;
    public static String B_ALREADY_EXIST_EXCEPTION_ERROR_CODE = _ALREADY + _EXIST;
    public static String B_ALREADY_ACCEPTED_EXCEPTION_ERROR_CODE = _ALREADY + _ACCEPT;
    public static String B_FORBIDDEN_EXCEPTION_ERROR_CODE = _FORBIDDEN + "00";
    public static String B_UN_AUTHORIZE_EXCEPTION_ERROR_CODE = _UN + _AUTHORIZE;
    public static String B_UN_SUCCESSFUL_EXCEPTION_ERROR_CODE = _UN + _SUCCESS;
    public static String B_UN_ACCEPTABLE_EXCEPTION_ERROR_CODE = _UN + _ACCEPT;
    public static String B_NOT_VALID_EXCEPTION_ERROR_CODE = _NOT + _VALID;

    //-Error_EventCodeList :

    public  static String D_EMAIL_ALREADY_USED = "0001";
    public static String D_USERNAME_ALREADY_USED = "0002";
    public static String D_EMAIL_AND_USERNAME_ALREADY_USED = "0003";

    // USER
   public static String D_USER_NOT_CREATED = "0010";
    public static String D_USER_ALREADY_REGISTERED = "0011";
    public static String D_USER_NOT_REGISTERED = "0012";
    public static String D_USER_NOT_FOUND = "0013";
    public static String D_USER_NOT_ACTIVE = "0014";
    public static String D_USER_ALREADY_LOGIN = "0015";

    // AUTHENTICATION
    public static String D_ACCESS_TOKEN_NOT_CREATED_OR_SAVED = "0020";
    public static String D_ACCESS_TOKEN_STILL_VALID = "0021";
    public static String D_REFRESH_TOKEN_NOT_CREATED_OR_SAVED = "0024";
    public static String D_REFRESH_TOKEN_NOT_FOUND = "0025";
    public static String D_REFRESH_TOKEN_NOT_VALID = "0026";
    public static String D_CONFIRMATION_TOKEN_NOT_CREATED_OR_SAVED = "0030";
    public static String D_CONFIRMATION_TOKEN_NOT_FOUND = "0031";
    public static String D_CONFIRMATION_TOKEN_EXPIRED = "0032";
    public static String D_CONFIRMATION_TOKEN_ALREADY_USED = "0033";
    public static String D_CONFIRMATION_TOKEN_NOT_REGISTERED = "0034";

    Map<String, String> baseCodesMaps  = new HashMap<>() {{
        put(B_ALREADY_ACCEPTED_EXCEPTION_ERROR_CODE, "already accepted");
        put(B_ALREADY_EXIST_EXCEPTION_ERROR_CODE, "already exist");
        put(B_FORBIDDEN_EXCEPTION_ERROR_CODE, "forbidden");
        put(B_NOT_VALID_EXCEPTION_ERROR_CODE, "not valid");
        put(B_NOT_FOUND_EXCEPTION_ERROR_CODE, "not found");
        put(B_UN_ACCEPTABLE_EXCEPTION_ERROR_CODE, "unacceptable");
        put(B_UN_SUCCESSFUL_EXCEPTION_ERROR_CODE, "un successful");
        put(B_UN_AUTHORIZE_EXCEPTION_ERROR_CODE, "un authorize");

    }};

    Map<String, String> topicCodesMaps  = new HashMap<>() {{
        put(T_ACCESS_TOKEN, "access token");
        put(T_CONFIRMATION_TOKEN, "confirmation token");
        put(T_EMAIL, "email");
        put(T_LOGIN, "login");
        put(T_LOGOUT, "logout");
        put(T_REFRESH_TOKEN, "refresh token");
        put(T_REGISTRATION, "registration");
        put(T_REQUEST, "request");
        put(T_ROLE, "role");
        put(T_SIGNUP, "signup");
        put(T_USER, "user");
    }};

    Map<String, String> detailCodesMaps  = new HashMap<>() {{
        put("0001", "email already used");
        put("0002", "username already used");
        put("0003", "email and username already used");
        // user
        put("0010", "user not created");
        put("0011", "user already registered");
        put("0012", "user not registered");
        put("0013", "user not found");
        put("0014", "user not active");
        put("0015", "user already login");
        // authentication
        put("0020", "access token not created or saved");
        put("0021", "access token still valid");
        put("0024", "refresh token not created or saved");
        put("0025", "refresh token not found");
        put("0026", "refresh token not valid");
        put("0030", "confirmation token not created or saved");
        put("0031", "confirmation token not found");
        put("0032", "confirmation token expired");
        put("0033", "confirmation token already used");
        put("0034", "confirmation token not registered");

    }};

  public String decodeError(String errorCode){

       if(errorCode.length()==11){
           String baseErrorCode =errorCode.substring(0,4);
           String topicErrorCode=errorCode.substring(4,7);
           String detailErrorCode=errorCode.substring(7,11);

           StringBuilder stringBuilder = new StringBuilder();



           baseCodesMaps.forEach((s, s2) -> {
               if(s.matches(baseErrorCode)){
                   stringBuilder.append("base : " + s2);
               }
           });

           stringBuilder.append("\n");

           topicCodesMaps.forEach((s, s2) -> {
               if(s.matches(topicErrorCode)){
                   stringBuilder.append("topic : " + s2);
               }
           });

           stringBuilder.append("\n");

           detailCodesMaps.forEach((s, s2) -> {
               if(s.matches(detailErrorCode)){
                   stringBuilder.append("detail : "+ s2);
               }
           });

           return stringBuilder.toString();

       } else {

           return "error code not valid!!!";

       }

   }
}
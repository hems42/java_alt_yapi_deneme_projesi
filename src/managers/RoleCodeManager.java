package managers;

import constants.coreEnums.DeviceEnum;
import constants.coreEnums.PlatformEnum;

import java.util.*;

public class RoleCodeManager {


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



    public static  String AUTH_STAGE_1_R = "000";
    public static  String AUTH_STAGE_1_W = "001";
    public static  String AUTH_STAGE_1_F = "002";
   //------------
    public static  String AUTH_STAGE_2_R = "003";
    public static  String AUTH_STAGE_2_W = "004";
    public static  String AUTH_STAGE_2_F = "005";
    //--------------
    public static  String AUTH_STAGE_3_R = "006";
    public static  String AUTH_STAGE_3_W = "007";
    public static  String AUTH_STAGE_3_F = "008";
    //--------
    public static  String AUTH_STAGE_4_R = "009";
    public static  String AUTH_STAGE_4_W = "010";
    public static  String AUTH_STAGE_4_F = "011";
    //----------
    public static  String AUTH_STAGE_5_R = "012";
    public static  String AUTH_STAGE_5_W = "013";
    public static  String AUTH_STAGE_5_F = "014";
    //------------------
    public static  String AUTH_STAGE_6_R = "015";
    public static  String AUTH_STAGE_6_W = "016";
    public static  String AUTH_STAGE_6_F = "017";
    //------------------
    public static  String AUTH_STAGE_7_R = "018";
    public static  String AUTH_STAGE_7_W = "019";
    public static  String AUTH_STAGE_7_F = "020";
    //-----------------
    public static  String AUTH_STAGE_8_R = "021";
    public static  String AUTH_STAGE_8_W = "022";
    public static  String AUTH_STAGE_8_F = "023";
    //---------------
    public static  String AUTH_STAGE_9_R = "024";
    public static  String AUTH_STAGE_9_W = "025";
    public static  String AUTH_STAGE_9_F = "026";
    //-----------------
    public static  String AUTH_STAGE_10_R = "027";
    public static  String AUTH_STAGE_10_W = "028";
    public static  String AUTH_STAGE_10_F = "029";
    //---------------
    public static  String AUTH_STAGE_11_R = "030";
    public static  String AUTH_STAGE_11_W = "031";
    public static  String AUTH_STAGE_11_F = "032";
    //-----------------
    public static  String AUTH_STAGE_12_R = "033";
    public static  String AUTH_STAGE_12_W = "034";
    public static  String AUTH_STAGE_12_F = "035";
    //-----------
    public static  String AUTH_STAGE_13_R = "036";
    public static  String AUTH_STAGE_13_W = "037";
    public static  String AUTH_STAGE_13_F = "038";
    //--------------
    public static  String AUTH_STAGE_14_R = "039";
    public static  String AUTH_STAGE_14_W = "040";
    public static  String AUTH_STAGE_14_F = "041";
    //--------------
    public static  String AUTH_STAGE_15_R = "042";
    public static  String AUTH_STAGE_15_W = "043";
    public static  String AUTH_STAGE_15_F = "044";
    //------------------
    public static  String AUTH_STAGE_16_R = "045";
    public static  String AUTH_STAGE_16_W = "046";
    public static  String AUTH_STAGE_16_F = "047";
    //-----------------
    public static  String AUTH_STAGE_17_R = "048";
    public static  String AUTH_STAGE_17_W = "049";
    public static  String AUTH_STAGE_17_F = "050";
    //-----------------
    public static  String AUTH_STAGE_18_R = "051";
    public static  String AUTH_STAGE_18_W = "052";
    public static  String AUTH_STAGE_18_F = "053";
    //---------------
    public static  String AUTH_STAGE_19_R = "054";
    public static  String AUTH_STAGE_19_W = "055";
    public static  String AUTH_STAGE_19_F = "056";
    //-------------
    public static  String AUTH_STAGE_20_R = "057";
    public static  String AUTH_STAGE_20_W = "058";
    public static  String AUTH_STAGE_20_F = "059";

  Map<String, String> roleCodeMaps  = new HashMap<String, String>() {{
        put(AUTH_STAGE_1_R, "AUTH_STAGE_1_R");
        put(AUTH_STAGE_1_W, "AUTH_STAGE_1_W");
        put(AUTH_STAGE_1_F, "AUTH_STAGE_1_F");
        //-----
        put(AUTH_STAGE_2_R, "AUTH_STAGE_2_R");
        put(AUTH_STAGE_2_W, "AUTH_STAGE_2_W");
        put(AUTH_STAGE_2_F, "AUTH_STAGE_2_F");
        //-----
        put(AUTH_STAGE_3_R, "AUTH_STAGE_3_R");
        put(AUTH_STAGE_3_W, "AUTH_STAGE_3_W");
        put(AUTH_STAGE_3_F, "AUTH_STAGE_3_F");

        //-----
        put(AUTH_STAGE_4_R, "AUTH_STAGE_4_R");
        put(AUTH_STAGE_4_W, "AUTH_STAGE_4_W");
        put(AUTH_STAGE_4_F, "AUTH_STAGE_4_F");

        //-----
        put(AUTH_STAGE_5_R, "AUTH_STAGE_5_R");
        put(AUTH_STAGE_5_W, "AUTH_STAGE_5_W");
        put(AUTH_STAGE_5_F, "AUTH_STAGE_5_F");

        //-----
        put(AUTH_STAGE_6_R, "AUTH_STAGE_6_R");
        put(AUTH_STAGE_6_W, "AUTH_STAGE_6_W");
        put(AUTH_STAGE_6_F, "AUTH_STAGE_6_F");

        //-----
        put(AUTH_STAGE_7_R, "AUTH_STAGE_7_R");
        put(AUTH_STAGE_7_W, "AUTH_STAGE_7_W");
        put(AUTH_STAGE_7_F, "AUTH_STAGE_7_F");

        //-----
        put(AUTH_STAGE_8_R, "AUTH_STAGE_8_R");
        put(AUTH_STAGE_8_W, "AUTH_STAGE_8_W");
        put(AUTH_STAGE_8_F, "AUTH_STAGE_8_F");

        //-----
        put(AUTH_STAGE_9_R, "AUTH_STAGE_9_R");
        put(AUTH_STAGE_9_W, "AUTH_STAGE_9_W");
        put(AUTH_STAGE_9_F, "AUTH_STAGE_9_F");

        //-----
        put(AUTH_STAGE_10_R, "AUTH_STAGE_10_R");
        put(AUTH_STAGE_10_W, "AUTH_STAGE_10_W");
        put(AUTH_STAGE_10_F, "AUTH_STAGE_10_F");

        //-----
        put(AUTH_STAGE_11_R, "AUTH_STAGE_11_R");
        put(AUTH_STAGE_11_W, "AUTH_STAGE_11_W");
        put(AUTH_STAGE_11_F, "AUTH_STAGE_11_F");

        //-----
        put(AUTH_STAGE_12_R, "AUTH_STAGE_12_R");
        put(AUTH_STAGE_12_W, "AUTH_STAGE_12_W");
        put(AUTH_STAGE_12_F, "AUTH_STAGE_12_F");

        //-----
        put(AUTH_STAGE_13_R, "AUTH_STAGE_13_R");
        put(AUTH_STAGE_13_W, "AUTH_STAGE_13_W");
        put(AUTH_STAGE_13_F, "AUTH_STAGE_13_F");

        //-----
        put(AUTH_STAGE_14_R, "AUTH_STAGE_14_R");
        put(AUTH_STAGE_14_W, "AUTH_STAGE_14_W");
        put(AUTH_STAGE_14_F, "AUTH_STAGE_14_F");

        //-----
        put(AUTH_STAGE_15_R, "AUTH_STAGE_15_R");
        put(AUTH_STAGE_15_W, "AUTH_STAGE_15_W");
        put(AUTH_STAGE_15_F, "AUTH_STAGE_15_F");

        //-----
        put(AUTH_STAGE_16_R, "AUTH_STAGE_16_R");
        put(AUTH_STAGE_16_W, "AUTH_STAGE_16_W");
        put(AUTH_STAGE_16_F, "AUTH_STAGE_16_F");

        //-----
        put(AUTH_STAGE_17_R, "AUTH_STAGE_17_R");
        put(AUTH_STAGE_17_W, "AUTH_STAGE_17_W");
        put(AUTH_STAGE_17_F, "AUTH_STAGE_17_F");

        //-----
        put(AUTH_STAGE_18_R, "AUTH_STAGE_18_R");
        put(AUTH_STAGE_18_W, "AUTH_STAGE_18_W");
        put(AUTH_STAGE_18_F, "AUTH_STAGE_18_F");

        //-----
        put(AUTH_STAGE_19_R, "AUTH_STAGE_19_R");
        put(AUTH_STAGE_19_W, "AUTH_STAGE_19_W");
        put(AUTH_STAGE_19_F, "AUTH_STAGE_19_F");

        //-----
        put(AUTH_STAGE_20_R, "AUTH_STAGE_20_R");
        put(AUTH_STAGE_20_W, "AUTH_STAGE_20_W");
        put(AUTH_STAGE_20_F, "AUTH_STAGE_20_F");

    }};

   Map<String,String> getRoleCodeMapsByDeviceEnumOrPlatformEnum(DeviceEnum deviceType, PlatformEnum platformType){
       Map<String, String> filteredRoleCodeMaps  = new HashMap<>();

       if(deviceType!=null){
           if(deviceType.getDeviceCode()==DeviceEnum.TV.getDeviceCode()){

           } else if(deviceType.getDeviceCode()==DeviceEnum.DESKTOP.getDeviceCode()){

           }
           else if(deviceType.getDeviceCode()==DeviceEnum.MOBILE_PHONE.getDeviceCode()){

           } else if(deviceType.getDeviceCode()==DeviceEnum.LAPTOP.getDeviceCode()){

           }
       }

       if(platformType!=null){

           if(platformType.getPlatformCode()==PlatformEnum.IOS.getPlatformCode()){

           } else if(platformType.getPlatformCode()==PlatformEnum.MACOS.getPlatformCode())
           {

           }
           else if(platformType.getPlatformCode()==PlatformEnum.WEB.getPlatformCode())
           {

           } else if(platformType.getPlatformCode()==PlatformEnum.ANDROID.getPlatformCode())
           {

           } else if(platformType.getPlatformCode()==PlatformEnum.LINUX.getPlatformCode())
           {

           } else if(platformType.getPlatformCode()==PlatformEnum.WINDOWS.getPlatformCode())
           {

           }
       }

       if(filteredRoleCodeMaps.size()>0){
           return  filteredRoleCodeMaps;
       } else {
           return  roleCodeMaps;
       }

   }

  public String encodeRole(HashSet<String> roles){

        StringBuilder stringBuilder = new StringBuilder();
        roles.forEach(role ->{
            roleCodeMaps.forEach((s, s2) -> {
                if (s2.matches(role)) {
                    stringBuilder.append(s);
                }
            });
        } );
        return stringBuilder.toString();
    }

  public List<String> decodeRolesFromRoleCode(String authCode) {

      List<String> allRoles = new ArrayList<>();
      List<String> allRoleCodes = new ArrayList<>();

      if(authCode.length()%3==0){
          for(int i=0;i<authCode.length();i+=3){
              allRoleCodes.add(authCode.substring(i,i+3));
          }
      }

       allRoleCodes.forEach(roleCode -> {
           roleCodeMaps.forEach((s, s2) -> {
               if (s.matches(roleCode)) {
                   allRoles.add(s2);
               }
           });
       });
      return allRoles;
  }

  public List<String> differentiateRoles(HashSet<String> roles, int extraRoleNumber){

      if(roles.toArray().length>extraRoleNumber){
          List<String> allRoles = roles.stream().toList();
          List<String> differentiateRoles = new ArrayList<>();

          for (int i=extraRoleNumber;i<allRoles.toArray().length;i++){
              differentiateRoles.add(allRoles.get(i));
          }
          return  differentiateRoles;
      }
      else {
      return List.of();
    }}

}
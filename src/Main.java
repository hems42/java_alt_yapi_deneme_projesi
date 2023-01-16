import constants.coreConstants.CoreAllAuthCodes;
import constants.coreConstants.CoreAllExceptionCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CoreAllAuthCodes coreAllAuthCodes = new CoreAllAuthCodes();
        String roleCode= "000002009011012019020025026056059";
        HashSet<String> roleList = new HashSet<>();
        roleList.add("AUTH_STAGE_20_F");
        roleList.add("AUTH_STAGE_19_F");
        roleList.add("AUTH_STAGE_15_F");
        roleList.add("AUTH_STAGE_11_W");
        roleList.add("AUTH_STAGE_11_W");
        roleList.add("AUTH_STAGE_11_W");
        roleList.add("AUTH_STAGE_11_W");
        roleList.add("AUTH_STAGE_11_W");
        roleList.add("AUTH_STAGE_10_R");
        roleList.add("AUTH_STAGE_5_R");



      String encodedRoles =    coreAllAuthCodes.encodeRole(roleList);

        System.out.println("roleKodu : " + encodedRoles);

        List<String> roles =   coreAllAuthCodes.decodeRolesFromRoleCode(encodedRoles);

        roles.forEach(s -> {
            System.out.println(s);
        });
    /*   CoreAllExceptionCodes coreAllExceptionCodes = new CoreAllExceptionCodes();
        String errorCode= CoreAllExceptionCodes.B_FORBIDDEN_EXCEPTION_ERROR_CODE+
                CoreAllExceptionCodes.T_ACCESS_TOKEN+
                CoreAllExceptionCodes.D_CONFIRMATION_TOKEN_ALREADY_USED;

      String sonuc =  coreAllExceptionCodes.decodeError(errorCode);

        System.out.println(sonuc);*/
    }
}

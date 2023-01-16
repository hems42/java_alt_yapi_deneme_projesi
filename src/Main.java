import constants.coreConstants.RoleCodeManager;
import constants.coreConstants.ExceptionCodeManager;

import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        authDeneme();
       // exceptionDeneme();
    }

    private static void exceptionDeneme() {
        ExceptionCodeManager exceptionCodeManager = new ExceptionCodeManager();
        String errorCode= ExceptionCodeManager.B_FORBIDDEN_EXCEPTION_ERROR_CODE+
                ExceptionCodeManager.T_ACCESS_TOKEN+
                ExceptionCodeManager.D_CONFIRMATION_TOKEN_ALREADY_USED;

        String sonuc =  exceptionCodeManager.decodeError(errorCode);

        System.out.println(sonuc);
    }

    private static void authDeneme() {
        RoleCodeManager roleCodeManager = new RoleCodeManager();
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


        String encodedRoles =    roleCodeManager.encodeRole(roleList);

        System.out.println("roleKodu : " + encodedRoles);

        List<String> roles =   roleCodeManager.decodeRolesFromRoleCode(encodedRoles);

        roles.forEach(s -> {
            System.out.println(s);
        });
    }
}

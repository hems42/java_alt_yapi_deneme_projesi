package ui;

import managers.RoleCodeManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.HashSet;

public class ui_deneme  {
    private JButton button1;
    private JPanel panel1;





    /*   CoreAllExceptionCodes coreAllExceptionCodes = new CoreAllExceptionCodes();
        String errorCode= CoreAllExceptionCodes.B_FORBIDDEN_EXCEPTION_ERROR_CODE+
                CoreAllExceptionCodes.T_ACCESS_TOKEN+
                CoreAllExceptionCodes.D_CONFIRMATION_TOKEN_ALREADY_USED;

      String sonuc =  coreAllExceptionCodes.decodeError(errorCode);

        System.out.println(sonuc);*/



    public ui_deneme() {
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



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = "şifrelenmiş";

                // Encode data on your side using BASE64
                byte[] bytesEncoded = Base64.getEncoder().encode(str.getBytes());
                System.out.println("encoded value is " + new String(bytesEncoded));

// Decode data on other side, by processing encoded data
                byte[] valueDecoded = Base64.getDecoder().decode(bytesEncoded);
                System.out.println("Decoded value is " + new String(valueDecoded));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setData(ui_deneme data) {
    }

    public void getData(ui_deneme data) {
    }

    public boolean isModified(ui_deneme data) {
        return false;
    }
}

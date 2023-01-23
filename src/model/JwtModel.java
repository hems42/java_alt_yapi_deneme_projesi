package model;

import java.util.Base64;

public class JwtModel {
    private String userName;
    private  String rolName;
    private String rolCode;
    private String platformCode;
    private String deviceCode;
    private String expiryDate;
    private String loginNumber;
    private String loginCode;

    public JwtModel(String userName,
                    String rolName,
                    String rolCode,
                    String platformCode,
                    String deviceCode,
                    String expiryDate,
                    String loginNumber) {
        this.userName = userName;
        this.rolName = rolName;
        this.rolCode = rolCode;
        this.platformCode = platformCode;
        this.deviceCode = deviceCode;
        this.expiryDate = expiryDate;
        this.loginNumber = loginNumber;
        byte[] bytesEncoded = Base64.getEncoder().encode((
                  rolName
                + ","
                + rolCode
                + ","
                + platformCode
                + ","
                + deviceCode
                + ","
                + loginNumber
        ).getBytes());
        loginCode =  new String(bytesEncoded);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getRolCode() {
        return rolCode;
    }

    public void setRolCode(String rolCode) {
        this.rolCode = rolCode;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(String loginNumber) {
        this.loginNumber = loginNumber;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
}

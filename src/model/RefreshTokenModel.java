package model;

public class RefreshTokenModel {

    private String userName;
    private String rolName;
    private String rolCode;
    private String platformCode;
    private String deviceCode;
    private String expiryDate;
    private String loginNumber;
    private String refreshToken;
    private String loginCode;

    public RefreshTokenModel(String userName,
                             String rolName,
                             String rolCode,
                             String platformCode,
                             String deviceCode,
                             String expiryDate,
                             String loginNumber,
                             String refreshToken) {
        this.userName = userName;
        this.rolName = rolName;
        this.rolCode = rolCode;
        this.platformCode = platformCode;
        this.deviceCode = deviceCode;
        this.expiryDate = expiryDate;
        this.loginNumber = loginNumber;
        this.refreshToken = refreshToken;
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

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
}

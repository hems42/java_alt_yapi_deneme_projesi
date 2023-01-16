package constants.coreEnums;

public enum DeviceEnum {
    DESKTOP("DESKTOP","DVC_000"),
    MOBILE_PHONE("MOBILE_PHONE","DVC_001"),
    LAPTOP("LAPTOP","DVC_002"),
    TV("TV","DVC_003"),
    UNKNOWN("UNKNOWN","DVC_004");

    private String deviceName;
    private String deviceCode;

    DeviceEnum(String deviceName, String deviceCode) {
        this.deviceName = deviceName;
        this.deviceCode = deviceCode;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceCode() {
        return deviceCode;
    }
}

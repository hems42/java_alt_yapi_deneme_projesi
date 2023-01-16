package constants.coreEnums;

public enum PlatformEnum {
    WEB("WEB","PLT_000"),
    ANDROID("ANDROID","PLT_001"),
    IOS("IOS","PLT_002"),
    WINDOWS("WINDOWS","PLT_003"),
    MACOS("MACOS","PLT_004"),
    LINUX("LINUX","PLT_005"),
    ;

    private String platformName;
    private String platformCode;

    PlatformEnum(String platformName, String platformCode) {
        this.platformName = platformName;
        this.platformCode = platformCode;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getPlatformCode() {
        return platformCode;
    }
}

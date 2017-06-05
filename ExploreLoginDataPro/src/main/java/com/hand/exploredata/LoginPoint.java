package com.hand.exploredata;

public class LoginPoint {
	private Integer userid;
    private String openid;
    private String  username;
    private String fullname;
    private String userType;
    private String osName;
    private String osVersion;
    private String ip;
    private String platform;
    private String appName;
    private String action;
    private String actionTime;
    private String netType;
    private String language;
    private String success;
    private String errorCode;
            
    
    public LoginPoint() {
  		super();
  	} 
    
    
    
	public LoginPoint(Integer userid, String openid, String username,
			String fullname, String userType, String osName, String osVersion,
			String ip, String platform, String appName, String action,
			String actionTime, String netType, String language, String success,
			String errorCode) {
		super();
		this.userid = userid;
		this.openid = openid;
		this.username = username;
		this.fullname = fullname;
		this.userType = userType;
		this.osName = osName;
		this.osVersion = osVersion;
		this.ip = ip;
		this.platform = platform;
		this.appName = appName;
		this.action = action;
		this.actionTime = actionTime;
		this.netType = netType;
		this.language = language;
		this.success = success;
		this.errorCode = errorCode;
	}






	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}

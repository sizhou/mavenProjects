package com.hand.exploredata;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class LoadData {
	private static String murl;
	private static String muser;
	private static String mpassword;

	public LoadData() {
		InputStream in = LoadData.class.getClassLoader().getResourceAsStream(
				"jdbc.properties");
		Properties properties = new Properties();
		try {
			properties.load(in);
			murl = properties.getProperty("url");
			muser = properties.getProperty("user");
			mpassword = properties.getProperty("password");
			System.out.println("===" + murl + "===" + muser + "===="
					+ mpassword);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	};

	public List<LoginPoint> getData() {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		List<LoginPoint> list = new ArrayList<LoginPoint>();
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("SELECT  ");
		sqlBuffer.append("userID, openID, username, fullname, userType, osName, osVersion, IP, platform, appName, [action], actionTime, netType, [language], isSuccess, errorCode ");
		sqlBuffer.append("FROM  ");
		sqlBuffer.append("LoginDateBuryingPoint  ");
		sqlBuffer.append("WHERE actionTime > DATEADD(DAY, -7, DATEADD(HOUR, 8, GETUTCDATE())) ");
		sqlBuffer.append("AND actionTime < DATEADD(HOUR, 8, GETUTCDATE())");
		try {
			conn = DriverManager.getConnection(murl, muser, mpassword);
			stmt = conn.createStatement();
			String sql=sqlBuffer.toString();
//			System.out.print("sql======"+sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				LoginPoint temp = new LoginPoint();
				if(null != rs.getString("userID")){
					temp.setUserid(Integer.parseInt(rs.getString("userID")));
				}
				
				if (null != rs.getString("openID")
						&& !(rs.getString("openID").isEmpty())
						&& !("".equals(rs.getString("openID").trim()))) {
					temp.setOpenid(rs.getString("openID"));
				}
				if (null != rs.getString("username")
						&& !(rs.getString("username").isEmpty())
						&& !("".equals(rs.getString("username").trim()))) {
					temp.setUsername(rs.getString("username"));
				}
				if (null != rs.getString("fullname")
						&& !(rs.getString("fullname").isEmpty())
						&& !("".equals(rs.getString("fullname").trim()))) {
					temp.setFullname(rs.getString("fullname"));
				}
				if (null != rs.getString("userType")
						&& !(rs.getString("userType").isEmpty())
						&& !("".equals(rs.getString("userType").trim()))) {
					temp.setUserType(rs.getString("userType"));
				}
				if (null != rs.getString("osName")
						&& !(rs.getString("osName").isEmpty())
						&& !("".equals(rs.getString("osName").trim()))) {
					temp.setOsName(rs.getString("osName"));
				}
				if (null != rs.getString("osVersion")
						&& !(rs.getString("osVersion").isEmpty())
						&& !("".equals(rs.getString("osVersion").trim()))) {
					temp.setOsVersion(rs.getString("osVersion"));
				}
				if (null != rs.getString("IP")
						&& !(rs.getString("IP").isEmpty())
						&& !("".equals(rs.getString("IP").trim()))) {
					temp.setIp(rs.getString("IP"));
				}
				if (null != rs.getString("platform")
						&& !(rs.getString("platform").isEmpty())
						&& !("".equals(rs.getString("platform").trim()))) {
					temp.setPlatform(rs.getString("platform"));
				}
				if (null != rs.getString("appName")
						&& !(rs.getString("appName").isEmpty())
						&& !("".equals(rs.getString("appName").trim()))) {
					temp.setAppName(rs.getString("appName"));
				}
				if (null != rs.getString("action")
						&& !(rs.getString("action").isEmpty())
						&& !("".equals(rs.getString("action").trim()))) {
					temp.setAction(rs.getString("action"));
				}
				if (null != rs.getDate("actionTime")
						&& !("".equals(rs.getDate("actionTime")))) {
					temp.setActionTime(rs.getDate("actionTime").toString());
				}
				if (null != rs.getString("netType")
						&& !(rs.getString("netType").isEmpty())
						&& !("".equals(rs.getString("netType").trim()))) {
					temp.setNetType(rs.getString("netType"));
				}
				if (null != rs.getString("language")
						&& !(rs.getString("language").isEmpty())
						&& !("".equals(rs.getString("language").trim()))) {
					temp.setLanguage(rs.getString("language"));
				}
				if (null != rs.getString("isSuccess")
						&& !(rs.getString("isSuccess").isEmpty())
						&& !("".equals(rs.getString("isSuccess").trim()))) {
					temp.setSuccess(rs.getString("isSuccess"));
				}
				if (null != rs.getString("errorCode")
						&& !(rs.getString("errorCode").isEmpty())
						&& !("".equals(rs.getString("errorCode").trim()))) {
					temp.setErrorCode(rs.getString("errorCode"));
				}
				
				int sOf = rs.getInt("isSuccess");
				if (sOf == 1)
					temp.setSuccess("成功");
				if (sOf == 0)
					temp.setSuccess("失败");

				list.add(temp);
			}
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			System.out.println("���ݿ�����ʧ��");
		}
		return list;
	}
}

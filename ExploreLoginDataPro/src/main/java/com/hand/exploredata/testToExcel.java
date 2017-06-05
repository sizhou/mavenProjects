package com.hand.exploredata;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




public class testToExcel {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		LoadData ld = new LoadData();
		List<LoginPoint> list = ld.getData();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		Date nowtime = new Date(); 
		String dateStr = sdf.format(nowtime);  
		String fileName = dateStr+".xls";
		File os = new File(fileName);
		WritableWorkbook workbook = Workbook.createWorkbook(os);
        WritableSheet sheet = workbook.createSheet("Sheet1",0);
        
        Label userid = new Label(0,0,"用户ID");
        sheet.addCell(userid);
        Label openid = new Label(1,0,"openid");
        sheet.addCell(openid);
        Label username = new Label(2,0,"账号");
        sheet.addCell(username);
        Label fullname = new Label(3,0,"用户姓名");
        sheet.addCell(fullname);
        Label userType = new Label(4,0,"用户角色");
        sheet.addCell(userType);
        Label osName = new Label(5,0,"IOS/Android");
        sheet.addCell(osName);
        Label osVersion = new Label(6,0,"版本号");
        sheet.addCell(osVersion);
        Label Ip = new Label(7,0,"Ip");
        sheet.addCell(Ip);
        Label platform = new Label(8,0,"平台");
        sheet.addCell(platform);
        Label appName = new Label(9,0,"appName");
        sheet.addCell(appName);
        Label actionTime = new Label(10,0,"actionTime");
        sheet.addCell(actionTime);
        Label action = new Label(11,0,"action");
        sheet.addCell(action);
        Label netType = new Label(12,0,"网络类型");
        sheet.addCell(netType);
        Label language = new Label(13,0,"语言");
        sheet.addCell(language);
        Label isSuccess = new Label(14,0,"是否成功");
        sheet.addCell(isSuccess);
        Label errorCode = new Label(15,0,"错误码");
        sheet.addCell(errorCode);
        for(int i=0;i<list.size();i++)
        {
//        	System.out.println(null!=list.get(i).getUserid()?list.get(i).getUserid():null);
        	WritableCell cell1 =  new jxl.write.Number(0, i+1, null!=list.get(i).getUserid()?list.get(i).getUserid():0);
            sheet.addCell(cell1);
            
            Label t2 = new Label(1,i+1,null!=list.get(i).getOpenid()?list.get(i).getOpenid():null);
            sheet.addCell(t2);     
            
            Label t3 = new Label(2,i+1,null!=list.get(i).getUsername()?list.get(i).getUsername():null);
            sheet.addCell(t3);
            
            Label t4 = new Label(3,i+1,null!=list.get(i).getFullname()?list.get(i).getFullname():null);
            sheet.addCell(t4);
            
            Label t16 = new Label(4,i+1,null!=list.get(i).getUserType()?list.get(i).getUserType():null);
            sheet.addCell(t16);  
            
            Label t5 = new Label(5,i+1,null!=list.get(i).getOsName()?list.get(i).getOsName():null);
            sheet.addCell(t5);
            
            Label t6 = new Label(6,i+1,null!=list.get(i).getOsVersion()?list.get(i).getOsVersion():null);
            sheet.addCell(t6);  
            
            Label t7 = new Label(7,i+1,null!=list.get(i).getIp()?list.get(i).getIp():null);
            sheet.addCell(t7);
            
            Label t8 = new Label(8,i+1,null!=list.get(i).getPlatform()?list.get(i).getPlatform():null);
            sheet.addCell(t8);  
            
            Label t9 = new Label(9,i+1,null!=list.get(i).getAppName()?list.get(i).getAppName():null);
            sheet.addCell(t9);
            
            Label t10 = new Label(10,i+1,null!=list.get(i).getActionTime()?list.get(i).getActionTime():null);
            sheet.addCell(t10);  
            Label t11 = new Label(11,i+1,null!=list.get(i).getAction()?list.get(i).getAction():null);
            sheet.addCell(t11);
            Label t12 = new Label(12,i+1,null!=list.get(i).getNetType()?list.get(i).getNetType():null);
            sheet.addCell(t12);  
            Label t13 = new Label(13,i+1,null!=list.get(i).getLanguage()?list.get(i).getLanguage():null);
            sheet.addCell(t13);
            Label t14 = new Label(14,i+1,null!=list.get(i).getSuccess()?list.get(i).getSuccess():null);
            sheet.addCell(t14);  
            Label t15 = new Label(15,i+1,null!=list.get(i).getErrorCode()?list.get(i).getErrorCode():null);
            sheet.addCell(t15); 
        }
        workbook.write();
        workbook.close();
	}

}

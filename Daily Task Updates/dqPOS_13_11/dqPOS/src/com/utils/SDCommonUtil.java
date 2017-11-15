 package com.utils;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;

import com.commons.Constants;
import dqpos.DBConnect;
//import com.dataaccess.DataAccess;
import java.sql.Connection;

public class SDCommonUtil {

	/*
	 * Converts the given InputStream to a StringBuffer and returns it.
	 */
	public static StringBuffer converttoSB(InputStream is) throws Exception {

        StringBuffer _data = new StringBuffer();
        char data;
        int dt;
        while((dt = is.read()) != -1) {
            data = (char) dt;
            _data.append(data);
        }
        return _data;
	}
	
	public static String convertBlankToNull(String f_strInputValue, boolean f_blnQuotesFlag){
		if( f_strInputValue != null) { 					
			if(!f_strInputValue.trim().equals(Constants.EMPTY_STRING)) {
				if(f_blnQuotesFlag){
					return Constants.SINGLE_QUOTE + f_strInputValue + Constants.SINGLE_QUOTE;
				}
				return f_strInputValue;
			}
		}
		return null;
	}
	
	public static String convertNullToBlank(String f_strInputValue, boolean f_blnQuotesFlag){
		if(f_strInputValue == null) {
			return Constants.EMPTY_STRING;	
		}
		if(f_blnQuotesFlag){
			if(f_strInputValue.startsWith(Constants.SINGLE_QUOTE) && f_strInputValue.endsWith(Constants.SINGLE_QUOTE)){
				f_strInputValue = f_strInputValue.substring(1, f_strInputValue.length()-1);
			}
		}
		return f_strInputValue;
	}	


        public static int convertNullTOZero(String f_strInputValue){
                if(f_strInputValue == null || f_strInputValue.equals("")){
                    return 0;
                }
                return Integer.parseInt(f_strInputValue);
        }

	public static String convertValuesForValueAndID(Statement f_objStatement, String f_strTableName, String f_strInputType, 
			String f_strResultType, String f_strValue, boolean f_blnQuotesFlag){
	if(f_strValue != null && f_strValue.equals("")==false){
			String l_strResult = Constants.EMPTY_STRING;
			String l_strQuery = Constants.EMPTY_STRING;
			if(!f_blnQuotesFlag){
				f_strInputType = Constants.UPPER + Constants.OPEN_BRACKET + f_strInputType + Constants.CLOSE_BRACKET;
				f_strValue = Constants.UPPER + Constants.OPEN_BRACKET + f_strValue + Constants.CLOSE_BRACKET;
			}
			l_strQuery = Constants.SELECT + Constants.SINGLE_SPACE 
			+ f_strResultType + Constants.SINGLE_SPACE + Constants.FROM + Constants.SINGLE_SPACE 
			+ f_strTableName + Constants.SINGLE_SPACE + Constants.WHERE + Constants.SINGLE_SPACE 
			+ f_strInputType 
			+ Constants.SINGLE_SPACE + Constants.EQUALS_SIGN + Constants.SINGLE_SPACE 
		    + f_strValue; 		    
			try {
                                   
                               
				f_objStatement.execute(l_strQuery);
				ResultSet l_objResultSet = f_objStatement.getResultSet();
				if(l_objResultSet != null){			
					while(l_objResultSet.next()){
						l_strResult = l_objResultSet.getString(f_strResultType);
						
						if(f_blnQuotesFlag && l_strResult != null){
							
							return Constants.SINGLE_QUOTE + l_strResult + Constants.SINGLE_QUOTE;
						}
                                               
						return l_strResult;
					}
					
				}
			}catch(SQLException expSQL){
                System.out.println("Getting Error here.in SDCOmmon.......");
                            
				//expSQL.printStackTrace();
			}

			return l_strResult;
		}
		return null;
	}
	
	public static List fillSelectBoxesWithDBValues(Statement f_objStatement, String f_strQuery, String f_strValueType){
		List l_objTempList  = new ArrayList();		
		
		try {
		f_objStatement.execute(f_strQuery);
		ResultSet l_objResultSet = f_objStatement.getResultSet();
		if(l_objResultSet != null){
			l_objTempList.clear();
			while(l_objResultSet.next()){
				l_objTempList.add(l_objResultSet.getString(f_strValueType));
			}				
		}
		}catch(SQLException expSQL){
			expSQL.printStackTrace();			
		}
		return l_objTempList;
	}
	
	public static String convertDBToSDFormatDate(String f_strDBDate){
		if(f_strDBDate!=null) {
			f_strDBDate.trim();
			if(!f_strDBDate.equals(Constants.EMPTY_STRING)) {
                            if(f_strDBDate.contains(Constants.HYPHEN))
                            {
				StringTokenizer strTokenizer=new StringTokenizer(f_strDBDate, Constants.HYPHEN);
				String l_strYear = strTokenizer.nextToken();		
				int l_nMonth = Integer.parseInt(strTokenizer.nextToken());		
				String l_strMonth = getMonthAsString(l_nMonth - 1);
				String l_strDate = strTokenizer.nextToken();
				return l_strDate + Constants.HYPHEN + l_strMonth + Constants.HYPHEN + l_strYear;
                            }
                            if(f_strDBDate.contains(Constants.FORWARD_SLASH))
                            {
				StringTokenizer strTokenizer=new StringTokenizer(f_strDBDate, Constants.FORWARD_SLASH);
				String l_strYear = strTokenizer.nextToken();
				int l_nMonth = Integer.parseInt(strTokenizer.nextToken());
				String l_strMonth = getMonthAsString(l_nMonth - 1);
				String l_strDate = strTokenizer.nextToken();
				return l_strDate + Constants.FORWARD_SLASH + l_strMonth + Constants.FORWARD_SLASH + l_strYear;
                            }

			}			
		}
		return f_strDBDate;
	}
	
	public static String convertSDFormatToDBDate(String f_strSDFormatDate){
		if(f_strSDFormatDate!=null) {
			f_strSDFormatDate.trim();
			if(!f_strSDFormatDate.equals(Constants.EMPTY_STRING)) {
                            if(f_strSDFormatDate.contains(Constants.HYPHEN))
                            {
				StringTokenizer strTokenizer=new StringTokenizer(f_strSDFormatDate, Constants.HYPHEN);
				String l_strDate = strTokenizer.nextToken();		
				String l_strMonth = strTokenizer.nextToken();		
				l_strMonth = String.valueOf(getMonthAsInt(l_strMonth) + 1);
				String l_strYear = strTokenizer.nextToken();
				return l_strYear + Constants.HYPHEN + l_strMonth + Constants.HYPHEN + l_strDate;
                            }
                            if(f_strSDFormatDate.contains(Constants.FORWARD_SLASH))
                            {
				StringTokenizer strTokenizer=new StringTokenizer(f_strSDFormatDate, Constants.FORWARD_SLASH);
				String l_strDate = strTokenizer.nextToken();
				String l_strMonth = strTokenizer.nextToken();
				l_strMonth = String.valueOf(getMonthAsInt(l_strMonth) + 1);
				String l_strYear = strTokenizer.nextToken();
				return l_strYear + Constants.FORWARD_SLASH + l_strMonth + Constants.FORWARD_SLASH + l_strDate;
                            }
			}
		} 
		return f_strSDFormatDate;
	}
	
	public static String getMonthAsString(int f_nMonth){
		
		switch(f_nMonth) {
		case Calendar.JANUARY:
			return "JAN";					
		case Calendar.FEBRUARY:
            return "FEB";
		case Calendar.MARCH:
            return "MAR";
        case Calendar.APRIL:
            return "APR";
        case Calendar.MAY:
            return "MAY";
        case Calendar.JUNE:
            return "JUN";
        case Calendar.JULY:
            return "JUL";
        case Calendar.AUGUST:
            return "AUG";
        case Calendar.SEPTEMBER:
            return "SEP";
        case Calendar.OCTOBER:
            return "OCT";
        case Calendar.NOVEMBER:
            return "NOV";
        case Calendar.DECEMBER:
            return "DEC";
        default:
            return "JAN";
		}
    }
	
	public static int getMonthAsInt(String f_strMonth){
		if("JAN".equalsIgnoreCase(f_strMonth))
			return Calendar.JANUARY; 
		else if("FEB".equalsIgnoreCase(f_strMonth))
			return Calendar.FEBRUARY;
		else if("MAR".equalsIgnoreCase(f_strMonth))
			return Calendar.MARCH;
		else if("APR".equalsIgnoreCase(f_strMonth))
			return Calendar.APRIL;
		else if("MAY".equalsIgnoreCase(f_strMonth))
			return Calendar.MAY;
		else if("JUN".equalsIgnoreCase(f_strMonth))
			return Calendar.JUNE;
		else if("JUL".equalsIgnoreCase(f_strMonth))
			return Calendar.JULY;
		else if("AUG".equalsIgnoreCase(f_strMonth))
			return Calendar.AUGUST;
		else if("SEP".equalsIgnoreCase(f_strMonth))
			return Calendar.SEPTEMBER;
		else if("OCT".equalsIgnoreCase(f_strMonth))
			return Calendar.OCTOBER;
		else if("NOV".equalsIgnoreCase(f_strMonth))
			return Calendar.NOVEMBER;
		else if("DEC".equalsIgnoreCase(f_strMonth))
			return Calendar.DECEMBER;
                else if("01".equalsIgnoreCase(f_strMonth))
			return Calendar.JANUARY;
		else if("02".equalsIgnoreCase(f_strMonth))
			return Calendar.FEBRUARY;
		else if("03".equalsIgnoreCase(f_strMonth))
			return Calendar.MARCH;
		else if("04".equalsIgnoreCase(f_strMonth))
			return Calendar.APRIL;
		else if("05".equalsIgnoreCase(f_strMonth))
			return Calendar.MAY;
		else if("06".equalsIgnoreCase(f_strMonth))
			return Calendar.JUNE;
		else if("07".equalsIgnoreCase(f_strMonth))
			return Calendar.JULY;
		else if("08".equalsIgnoreCase(f_strMonth))
			return Calendar.AUGUST;
		else if("09".equalsIgnoreCase(f_strMonth))
			return Calendar.SEPTEMBER;
		else if("10".equalsIgnoreCase(f_strMonth))
			return Calendar.OCTOBER;
		else if("11".equalsIgnoreCase(f_strMonth))
			return Calendar.NOVEMBER;
		else if("12".equalsIgnoreCase(f_strMonth))
			return Calendar.DECEMBER;
        //default
        return Calendar.JANUARY;
	}
	
	public static String calculateTimeSpent(String f_strDate1, String f_strTime1, String f_strDate2, String f_strTime2, String f_strPreviousTTS ){
		String l_strDate = Constants.EMPTY_STRING;		
		String l_strMonth = Constants.EMPTY_STRING;		
		String l_strYear = Constants.EMPTY_STRING;
		String l_strHour = Constants.EMPTY_STRING;		
		String l_strMinute = Constants.EMPTY_STRING;		
		String l_strSecond = Constants.EMPTY_STRING;
		if(f_strDate1!=null) {
			f_strDate1.trim();
			if(!f_strDate1.equals(Constants.EMPTY_STRING)) {
				StringTokenizer strTokenizer=new StringTokenizer(f_strDate1, Constants.HYPHEN);
				l_strDate = strTokenizer.nextToken();		
				l_strMonth = strTokenizer.nextToken();		
				l_strMonth = String.valueOf(getMonthAsInt(l_strMonth));
				l_strYear = strTokenizer.nextToken();
			}
		}
		if(f_strTime1!=null) {
			f_strTime1.trim();
			if(!f_strTime1.equals(Constants.EMPTY_STRING)) {
				StringTokenizer strTokenizer=new StringTokenizer(f_strTime1, Constants.COLON);
				l_strHour = strTokenizer.nextToken();		
				l_strMinute = strTokenizer.nextToken();		
				l_strSecond = strTokenizer.nextToken();
			}
		}
		Date l_objDate1 = new GregorianCalendar(Integer.parseInt(l_strYear),Integer.parseInt(l_strMonth),Integer.parseInt(l_strDate),Integer.parseInt(l_strHour),Integer.parseInt(l_strMinute),Integer.parseInt(l_strSecond)).getTime();
		if(f_strDate2!=null) {
			f_strDate2.trim();
			if(!f_strDate2.equals(Constants.EMPTY_STRING)) {
				StringTokenizer strTokenizer=new StringTokenizer(f_strDate2, Constants.HYPHEN);
				l_strDate = strTokenizer.nextToken();		
				l_strMonth = strTokenizer.nextToken();		
				l_strMonth = String.valueOf(getMonthAsInt(l_strMonth));
				l_strYear = strTokenizer.nextToken();
			}
		}
		if(f_strTime2!=null) {
			f_strTime2.trim();
			if(!f_strTime2.equals(Constants.EMPTY_STRING)) {
				StringTokenizer strTokenizer=new StringTokenizer(f_strTime2, Constants.COLON);
				l_strHour = strTokenizer.nextToken();		
				l_strMinute = strTokenizer.nextToken();		
				l_strSecond = strTokenizer.nextToken();
			}
		}
		Date l_objDate2 = new GregorianCalendar(Integer.parseInt(l_strYear),Integer.parseInt(l_strMonth),Integer.parseInt(l_strDate),Integer.parseInt(l_strHour),Integer.parseInt(l_strMinute),Integer.parseInt(l_strSecond)).getTime();
		System.out.println(l_objDate1.toString());
		System.out.println(l_objDate2.toString());
		long actualSeconds = l_objDate2.getTime() - l_objDate1.getTime();
		actualSeconds = actualSeconds/1000;
		
		if(f_strPreviousTTS != null){
			if(!f_strPreviousTTS.equals(Constants.EMPTY_STRING)){
				long previousTimeInSeconds = getTimeValueInSeconds(f_strPreviousTTS);
				actualSeconds = previousTimeInSeconds + actualSeconds;
			}
		}
		
		String strHours = "00";
		String strMinutes = "00";
		String strSeconds = "00";

		long noOfHours = 0;
		long timeFactor = 0;
		long noOfFactor = 0;
		long extraSeconds = actualSeconds;
		timeFactor = 86400;
		if (actualSeconds >= timeFactor) {			
			noOfFactor = actualSeconds/ timeFactor;
			extraSeconds = getTimeFactor(actualSeconds, timeFactor, noOfFactor);
			noOfHours = noOfFactor * 24;
		} 
		timeFactor = 3600;
		if(extraSeconds >= timeFactor) {
			noOfFactor = extraSeconds/ timeFactor;
			extraSeconds = getTimeFactor(extraSeconds, timeFactor, noOfFactor);
			noOfHours = noOfHours + noOfFactor;			
		}
		strHours = noOfHours < 10?"0"+String.valueOf(noOfHours):String.valueOf(noOfHours);		
		timeFactor = 60;
		if(extraSeconds >= timeFactor) {
			noOfFactor = extraSeconds/ timeFactor;
			extraSeconds = getTimeFactor(extraSeconds, timeFactor, noOfFactor);
			strMinutes = noOfFactor < 10?"0"+String.valueOf(noOfFactor):String.valueOf(noOfFactor);
		} 
		timeFactor = 60;
		if(extraSeconds < timeFactor) {
			strSeconds = extraSeconds < 10?"0"+String.valueOf(extraSeconds):String.valueOf(extraSeconds);
		}
		
		return (strHours + ":" + strMinutes + ":" + strSeconds);		
	}
	
	public static long getTimeFactor(long actualSeconds, long timeFactor, long noOfFactor ){
		long extraSeconds = actualSeconds - (timeFactor * noOfFactor);
		return extraSeconds;
	}
	public static long getTimeValueInSeconds(String f_strTimeValue){
		StringTokenizer strTokenizer=new StringTokenizer(f_strTimeValue, Constants.COLON);
		String l_strHour = strTokenizer.nextToken();		
		String l_strMinute = strTokenizer.nextToken();		
		String l_strSecond = strTokenizer.nextToken();
		long valueInSeconds = (Integer.parseInt(l_strHour) * 3600) + (Integer.parseInt(l_strMinute) * (60)) + (Integer.parseInt(l_strSecond));
		return valueInSeconds;
	}
	
    public static String getStringwithCommas(ArrayList<String> input)
    {
        
        String output="";
        int size=input.size();
        
        for(int i=0;i<size;i++)
        {
            output=output+input.get(i); 
            if(i!=size-1)
            {
                output=output+" , ";
            }
        }
        
        return output;
    }
     public static String getLoginName(String id,String role) throws Exception
    {
         String l_strUserName=null;
         try
                        {
                 Connection l_objConnection = DBConnect.getConnection();
                Statement l_objStatement1 = l_objConnection.createStatement();

                if(role.equals(Constants.USER))
                {
                    l_strUserName = SDCommonUtil.convertNullToBlank(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, "SDSCHEMA.REQUESTORMASTER", "USERID", "LOGINID", id, true), true);
                }
               else
                {
                    l_strUserName = SDCommonUtil.convertNullToBlank(SDCommonUtil.convertValuesForValueAndID(l_objStatement1, "SDSCHEMA.ITSTAFFMASTER", "ITSTAFFID", "LOGINID", id, true), true);
                }
                l_objConnection.close();
                        }

                        catch(SQLException ex)
                        {

                        }
         return l_strUserName;

    }
    public static ArrayList<String> getIdList(Statement f_objStatement, String tableName ,String  outputColName,String inputColName,String value)
    {
        String l_strQuery="SELECT "+outputColName+" FROM "+tableName+" WHERE " +inputColName+" = '"+value+"'";
        ArrayList<String> idLst=new ArrayList<String>();
        try {
            f_objStatement.execute(l_strQuery);
            ResultSet l_objResultSet = f_objStatement.getResultSet();
            if(l_objResultSet != null){         
                while(l_objResultSet.next()){
                    idLst.add(l_objResultSet.getString(1));
                    
                  }
                
            }
        }catch(SQLException expSQL){
            expSQL.printStackTrace();           
        }
        
        return idLst;
    }
    public static ArrayList<String> getIdListCaseInSensitive(Statement f_objStatement, String tableName ,String  outputColName,String inputColName,String value)
    {

        String l_strQuery="SELECT "+outputColName+" FROM SDSCHEMA.REQUESTORMASTER WHERE LOWER("+inputColName+") LIKE '%"+value+"%'";
        ArrayList<String> idLst=new ArrayList<String>();
        try {
            f_objStatement.execute(l_strQuery);
            ResultSet l_objResultSet = f_objStatement.getResultSet();
            if(l_objResultSet != null){
                while(l_objResultSet.next()){
                    idLst.add(l_objResultSet.getString(1));

                  }

            }
        }catch(SQLException expSQL){
            expSQL.printStackTrace();
        }

        return idLst;
    }
    public static String checkEscapeSequenceCharacter(String f_strInputValue){
		if( f_strInputValue != null) {
                    String l_strInputString=Constants.EMPTY_STRING;
                    while(f_strInputValue.contains("\\")) {
//                            if(!f_strInputValue.contains("\\\\")) {
                                int index=f_strInputValue.indexOf('\\', 0);
                                l_strInputString=l_strInputString+f_strInputValue.substring(0, index)+"\\\\";
                                f_strInputValue=f_strInputValue.substring(index+1, f_strInputValue.length());

//                            }
			}
                    f_strInputValue=l_strInputString+f_strInputValue;
                    l_strInputString=Constants.EMPTY_STRING;
			while(f_strInputValue.contains("'")) {
//                            if(!f_strInputValue.contains("\\'")) {
                                int index=f_strInputValue.indexOf('\'', 0);
                                l_strInputString=l_strInputString+f_strInputValue.substring(0, index)+"\\'";
                                f_strInputValue=f_strInputValue.substring(index+1, f_strInputValue.length());

//                            }
			}
                    f_strInputValue=l_strInputString+f_strInputValue;
		}
                return f_strInputValue;
    }

    public static String getAssetDetail(Statement f_objStatement, String assetId ,String  columnName){
        String l_strResult="";
        if(assetId!=null && assetId.equals("")==false)
        {
            String l_strQuery="select "+columnName+" from "+Constants.DB_NAME+".cmdbassetdata_cad "
                    + " where AssetID="+SDCommonUtil.convertBlankToNull(assetId, true);
            try {
                    f_objStatement.execute(l_strQuery);
                    ResultSet l_objResultSet = f_objStatement.getResultSet();
                    if(l_objResultSet != null){
                        while(l_objResultSet.next()){
                            l_strResult = l_objResultSet.getString(1);
                        }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return l_strResult;
    }
    

}

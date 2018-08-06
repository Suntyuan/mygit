package y2ssh.zhangcuishan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JbUtils {
	public static long parseLong(String str){
		long ret = -1;
		try{
			ret = Long.parseLong(str);
		}catch(Exception e){
			ret = -1;
		}
		return ret;
	}
	
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	public static Date parseDate(String str){
		Date ret = null;
		try {
			ret = df.parse(str);
		} catch (ParseException e) {
			//e.printStackTrace();
		}
		return ret;
	} 
	public static String formatDate(Date date){
		String ret = "?";
		try {
			ret = df.format(date);
		}catch (Exception e) {
			//e.printStackTrace();
			ret = "?";
		}
		return ret;
	}
	
	public static String now(){
		return df.format(new Date());
	}
}

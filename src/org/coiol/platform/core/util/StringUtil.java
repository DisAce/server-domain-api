/**   
* @Project: PlatFormCore 
* @Title: StringUtil.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月20日 下午10:18:44 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;

/** 
 * @ClassName StringUtil  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月20日 
 * 
 */
public class StringUtil
{

	 private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(StringUtil.class);

	  private static final String[] CHS = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };

	  public static boolean validate(String str)
	  {
	    return (str != null) && (!str.equals("")) && (!str.equalsIgnoreCase("null")) && (str.trim().length() >= 1);
	  }

	  public static boolean validate(Object str)
	  {
	    return str != null;
	  }

	  public static boolean validate(int str)
	  {
	    return (str != 0);
	  }

	  public static boolean validate(StringBuffer str)
	  {
	    return (str != null) && (!"".equalsIgnoreCase(str.toString())) && (str.toString().trim().length() >= 1);
	  }

	  public static boolean validate(List<?> str)
	  {
	    return (str != null) && (str.size() != 0);
	  }

	  public static boolean validate(String[] str)
	  {
	    return (str != null) && (str.length != 0);
	  }

	  public static String formatStrGBK(String str)
	  {
	    String result = "";
	    try
	    {
	      if (validate(str))
	      {
	        result = new String(str.getBytes("ISO-8859-1"), "GBK");
	      }
	    }
	    catch (Exception ex)
	    {
	      log.error(ex.toString(), new Object[] { "" });
	    }
	    return result.trim();
	  }

	  public static String formatStrUTF(String str)
	  {
	    String result = "";
	    try
	    {
	      if (validate(str))
	      {
	        result = new String(str.getBytes("ISO-8859-1"), "UTF-8");
	      }
	    }
	    catch (Exception ex)
	    {
	      log.error(ex.toString(), new Object[] { "" });
	    }
	    return result.trim();
	  }

	  public static String formatStrUTF(StringBuffer str)
	  {
	    String result = "";
	    try
	    {
	      if (validate(str))
	      {
	        result = new String(str.toString().getBytes("GBK"), "UTF-8");
	      }
	    }
	    catch (Exception ex)
	    {
	      log.error(ex.toString(), new Object[] { "" });
	    }
	    return result.trim();
	  }

	  public static String formatNullStr(String str)
	  {
	    return (str == null) || (str.toUpperCase().equals("NULL")) ? "" : str.trim();
	  }

	  public static String formatLengthStr(String str, int length, String age0, boolean isBefore)
	  {
	    String newStr = str == null ? "" : str.trim();

	    while (newStr.length() < length)
	    {
	      if (isBefore)
	      {
	        newStr = age0 + newStr;
	      }
	      else
	      {
	        newStr = newStr + age0;
	      }
	    }
	    if (newStr.length() > length)
	    {
	      if (isBefore)
	      {
	        newStr = newStr.substring(newStr.length() - length);
	      }
	      else
	      {
	        newStr = newStr.substring(0, length);
	      }
	    }
	    return newStr;
	  }

	  public static StringBuffer deleteDuplicate(StringBuffer str)
	  {
	    if (!validate(str)) return null;
	    StringBuffer sb = new StringBuffer();
	    boolean flag = false;
	    String[] tmpStr = str.toString().split(",");
	    for (int i = 0; i < tmpStr.length; i++)
	    {
	      for (int j = i + 1; j < tmpStr.length; j++)
	      {
	        if (!tmpStr[i].equalsIgnoreCase(tmpStr[j]))
	          continue;
	        flag = true;
	        break;
	      }

	      if (!flag)
	      {
	        if (!validate(sb))
	        {
	          sb.append(tmpStr[i]);
	        }
	        else
	        {
	          sb.append(",").append(tmpStr[i]);
	        }
	      }
	      flag = false;
	    }
	    return sb;
	  }

	  public static String formatDbColumn(int str)
	  {
	    return String.valueOf(str);
	  }

	  public static String formatDbColumn(Object str)
	  {
	    return validate(str) ? String.valueOf(str).trim() : "";
	  }

	  public static String formatDbColumn(String str)
	  {
	    return str != null ? str.trim() : "";
	  }

	  public static boolean isContaints(String list, String str)
	  {
	    if (!validate(list)) return false;
	    if (!validate(str)) return false;
	    String[] tmp = list.split(",");
	    for (int i = 0; i < tmp.length; i++)
	    {
	      if (str.equalsIgnoreCase(tmp[i])) return true;
	    }
	    return false;
	  }

	  public static String toUpperCase(String str)
	  {
	    if (validate(str)) return str.trim().toUpperCase();
	    return "";
	  }

	  public static String toLowerCase(String str)
	  {
	    if (validate(str)) return str.trim().toLowerCase();
	    return "";
	  }

	  public static void setStringBufferValue(StringBuffer sb, String value)
	  {
	    if (!validate(sb))
	    {
	      sb.append(value);
	    }
	    else
	    {
	      sb.append(",").append(value);
	    }
	  }

	  public static void setStringBufferValue(StringBuffer sb, String value, String regex)
	  {
	    if (!validate(sb))
	    {
	      sb.append(value);
	    }
	    else
	    {
	      sb.append(regex).append(value);
	    }
	  }

	  public static String format(String regex, String[] value)
	  {
	    String str = regex;
	    for (int i = 0; i < value.length; i++)
	    {
	      if (!regex.contains("{" + i + "}"))
	        continue;
	      str = str.replaceAll("\\{" + i + "}", value[i]);
	    }

	    return str;
	  }

	  public static String format(String regex, String value)
	  {
	    String str = regex;
	    String[] valu = value.split(",");
	    for (int i = 0; i < valu.length; i++)
	    {
	      if (!regex.contains("{" + i + "}"))
	        continue;
	      str = str.replaceAll("\\{" + i + "}", valu[i]);
	    }

	    return str;
	  }

	  public static String substrByBytelength(String str, int byteLeng)
	  {
	    if ((str != null) && (str.trim().length() > 0))
	    {
	      int count = 0;
	      String strA = "";
	      for (int i = 0; i < str.length(); i++)
	      {
	        char c = str.charAt(i);
	        count += String.valueOf(c).getBytes().length;
	        if (count > byteLeng) return strA;
	        strA = strA + String.valueOf(c);
	      }
	      return strA;
	    }
	    return "";
	  }

	  public static boolean validateInt(String strInt)
	  {
	    try
	    {
	      if (validate(strInt))
	      {
	        Integer.parseInt(strInt);
	        return true;
	      }
	    }
	    catch (Exception e)
	    {
	      log.info("系统错误：{}", new Object[] { e.toString() });
	    }
	    return false;
	  }

	  public static boolean validateDouble(String strDouble)
	  {
	    try
	    {
	      Double.parseDouble(strDouble);
	    }
	    catch (Exception e)
	    {
	      return false;
	    }
	    return true;
	  }

	  public static boolean validateDate(String strDate)
	  {
	    try
	    {
	      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	      df.setLenient(false);
	      Date d = df.parse(strDate);
	      df.format(d);
	    }
	    catch (Exception e)
	    {
	      return false;
	    }
	    return true;
	  }

	  public static boolean validateTime(String strDateTime)
	  {
	    try
	    {
	      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      df.setLenient(false);
	      Date d = df.parse(strDateTime);
	      df.format(d);
	    }
	    catch (Exception e)
	    {
	      return false;
	    }
	    return true;
	  }

	  public static boolean validate(byte[] str)
	  {
	    return (str != null) && (str.length != 0);
	  }

	  public static String deleteItem(String list, String item)
	  {
	    if (isContaints(list, item))
	    {
	      if (list.startsWith(item + ","))
	      {
	        list = list.substring(item.length() + 1, list.length());
	      }
	      else if (list.endsWith("," + item))
	      {
	        list = list.substring(0, list.length() - item.length() - 1);
	      }
	      else if (list.equals(item))
	      {
	        list = "";
	      }
	      else
	      {
	        list = list.replace(item + ",", "");
	      }
	    }
	    return list;
	  }

	  public static String addItem(String list, String item)
	  {
	    StringBuffer sb = new StringBuffer();
	    if (validate(list))
	    {
	      sb.append(list).append(",").append(item);
	    }
	    else
	    {
	      sb = new StringBuffer(item);
	    }
	    return sb.toString();
	  }

	  public static String replace(String s, char oldSub, char newSub)
	  {
	    return replace(s, oldSub, Character.valueOf(newSub).toString());
	  }

	  public static String replace(String s, char oldSub, String newSub)
	  {
	    if ((s == null) || (newSub == null)) return null;

	    char[] c = s.toCharArray();

	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < c.length; i++)
	    {
	      if (c[i] == oldSub)
	      {
	        sb.append(newSub);
	      }
	      else
	      {
	        sb.append(c[i]);
	      }
	    }

	    return sb.toString();
	  }

	  public static String replace(String s, String oldSub, String newSub)
	  {
	    if ((s == null) || (oldSub == null) || (newSub == null)) return null;

	    int y = s.indexOf(oldSub);

	    if (y >= 0)
	    {
	      StringBuffer sb = new StringBuffer();

	      int length = oldSub.length();
	      int x = 0;

	      while (x <= y)
	      {
	        sb.append(s.substring(x, y));
	        sb.append(newSub);
	        x = y + length;
	        y = s.indexOf(oldSub, x);
	      }

	      sb.append(s.substring(x));

	      return sb.toString();
	    }
	    return s;
	  }

	  public static String replace(String s, String[] oldSubs, String[] newSubs)
	  {
	    if ((s == null) || (oldSubs == null) || (newSubs == null)) return null;

	    if (oldSubs.length != newSubs.length) return s;

	    for (int i = 0; i < oldSubs.length; i++)
	    {
	      s = replace(s, oldSubs[i], newSubs[i]);
	    }

	    return s;
	  }

	  public static String[] spliceString(String s, String delimiter)
	  {
	    if (validate(s)) return s.split(delimiter);
	    return null;
	  }

	  public static String formatStrGb2312(String str)
	  {
	    String result = "";
	    try
	    {
	      if (validate(str))
	      {
	        result = new String(str.toString().getBytes(), "gb2312");
	      }
	    }
	    catch (Exception ex)
	    {
	      log.error(ex.toString(), new Object[] { "" });
	    }
	    return result.trim();
	  }

	  public static String formatCurrencyNum(String symbolCurr)
	  {
	    StringBuffer retStr = new StringBuffer();
	    try
	    {
	      symbolCurr = symbolCurr.trim();
	      String ntNumber = symbolCurr.replaceAll("\\D", "");
	      if (symbolCurr.contains("."))
	      {
	        String digits = symbolCurr.substring(symbolCurr.indexOf(".") + 1, symbolCurr.length());
	        String integer = ntNumber.substring(0, ntNumber.lastIndexOf(digits));
	        retStr.append(integer).append(".").append(digits);
	      }
	      else
	      {
	        retStr.append(ntNumber);
	      }
	    }
	    catch (Exception e)
	    {
	      log.error(e.toString(), new Object[] { "" });
	    }
	    return retStr.toString();
	  }

	  public static String encode(String input)
	  {
	    if (!validate(input)) return input;
	    char[] hexDigits = 
	      { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	    try
	    {
	      byte[] strTemp = input.getBytes();
	      MessageDigest mdTemp = MessageDigest.getInstance("MD5");
	      mdTemp.update(strTemp);
	      byte[] md = mdTemp.digest();
	      int j = md.length;
	      char[] str = new char[j * 2];
	      int k = 0;
	      for (int i = 0; i < j; i++)
	      {
	        byte byte0 = md[i];
	        str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
	        str[(k++)] = hexDigits[(byte0 & 0xF)];
	      }
	      return new String(str);
	    }
	    catch (Exception e) {
	    }
	    return null;
	  }

	  public static String formatToCMoney(String money)
	  {
	    StringBuffer chRMB = new StringBuffer();
	    money = money.replaceAll("[,，]", "");
	    double t = Double.parseDouble(money);
	    if (t < 0.0D) return "金额不能是负的！";
	    int dotPos = money.indexOf('.');
	    String strz;
	    if (dotPos == -1)
	    {
	      strz = money;
	    }
	    else
	    {
	      strz = money.substring(0, dotPos);
	    }
	    StringBuffer sb = new StringBuffer(strz);
	    while ((sb.length() >= 1) && (sb.charAt(0) == '0'))
	    {
	      sb.deleteCharAt(0);
	    }
	    if (sb.length() == 0)
	    {
	      return "零";
	    }
	    strz = sb.toString();
	    String cur = "";
	    boolean zero = false;

	    while (strz.length() > 0)
	    {
	      String digits;
	      if (strz.length() >= 4)
	      {
	        digits = strz.substring(strz.length() - 4);
	        strz = strz.substring(0, strz.length() - 4);
	      }
	      else
	      {
	        digits = strz;
	        strz = "";
	      }

	      String temp = fourMaxChange(digits);
	      if (temp.equals("零"))
	      {
	        if (cur.equals("亿"))
	        {
	          chRMB.insert(0, "亿");
	        }
	        if (zero)
	        {
	          if (!chRMB.substring(0, 1).equals("零"))
	          {
	            chRMB.insert(0, "零");
	          }
	          zero = false;
	        }
	      }
	      else
	      {
	        temp = temp + cur;
	        chRMB.insert(0, temp);
	        if (digits.charAt(0) == '0')
	        {
	          if ((chRMB.length() >= 1) && (!chRMB.substring(0, 1).equals("零")))
	          {
	            chRMB.insert(0, "零");
	          }
	        }
	        zero = true;
	      }

	      if (cur.equals(""))
	      {
	        cur = "万";
	      }
	      else if (cur.equals("亿"))
	      {
	        cur = "万";
	      }
	      else
	      {
	        cur = "亿";
	      }

	    }

	    if (dotPos != -1)
	    {
	      String strx = money.substring(dotPos + 1);
	      if (strx.length() > 2) return "金额只允许两位小数！";
	      int xiaoshu = Integer.parseInt(strx);
	      if ((xiaoshu == 0) || (strx.length() == 0))
	      {
	        chRMB.append("圆整");
	      }
	      else
	      {
	        chRMB.append("圆");
	      }
	      if (strx.length() == 1)
	      {
	        chRMB.append(CHS[xiaoshu]).append("分");
	      }
	      else
	      {
	        if (xiaoshu / 10 != 0)
	        {
	          chRMB.append(CHS[(xiaoshu / 10)]).append("角");
	        }
	        else
	        {
	          chRMB.append("零");
	        }
	        if (xiaoshu % 10 != 0)
	        {
	          chRMB.append(CHS[(xiaoshu % 10)]).append("分");
	        }
	      }
	    }
	    else
	    {
	      chRMB.append("圆整");
	    }

	    return chRMB.toString();
	  }

	  public static String fourMaxChange(String number)
	    throws NumberFormatException
	  {
	    StringBuffer rs = new StringBuffer();

	    int money = Integer.parseInt(number);
	    boolean zero = false;
	    if (money / 1000 != 0)
	    {
	      zero = true;
	      rs.append(CHS[(money / 1000)]).append("仟");
	      money %= 1000;
	    }
	    if (money / 100 != 0)
	    {
	      zero = true;
	      rs.append(CHS[(money / 100)]).append("佰");
	      money %= 100;
	    }
	    else if (zero)
	    {
	      rs.append(CHS[0]);
	      money %= 100;
	    }

	    if (money / 10 != 0)
	    {
	      zero = true;
	      rs.append(CHS[(money / 10)]).append("拾");
	      money %= 10;
	    }
	    else if ((zero) && (!rs.substring(rs.length() - 1).equals("零")))
	    {
	      rs.append(CHS[0]);
	      money %= 10;
	    }
	    if (money != 0)
	    {
	      zero = true;
	      rs.append(CHS[money]);
	    }
	    else if ((zero) && (rs.substring(rs.length() - 1).equals("零")))
	    {
	      rs.delete(rs.length() - 1, rs.length());
	    }
	    if (zero) return rs.toString();
	    return CHS[0];
	  }
}

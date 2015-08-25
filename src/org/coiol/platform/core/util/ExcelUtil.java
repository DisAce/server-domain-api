/**   
* @Project: PlatFormCore 
* @Title: ExcelUtil.java 
* @Package com.coiol.platform.core.util 
* @Description: TODO 
* @author Yin MingXing master@coiol.com 
* @date 2015年7月17日 下午10:23:36 
* @Copyright: 2015  
* @version V1.0 
 */
package org.coiol.platform.core.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;

/** 
 * @ClassName ExcelUtil  
 * @Description TODO 
 * @author Yin MingXing master@coiol.com 
 * @date 2015年7月17日 
 * 
 */
public class ExcelUtil
{

	private static final PlatFormLogger log = PlatFormLoggerFactory.getPlatFormLogger(ExcelUtil.class);

	  public Workbook exportSheet(Workbook workbook, String sheetName, List<Map> rs, String[] columnNames, String[] columnCodes)
	  {
	    int rowNum = 1;

	    Sheet sheet = null;
	    Row row = null;
	    CellStyle headStyle = getCellStyle(workbook, 1);
	    CellStyle dataStyle = getCellStyle(workbook, 2);

	    sheet = workbook.createSheet(sheetName);
	    row = sheet.createRow(rowNum - 1);
	    Cell cell;
	    for (int i = 0; i < columnNames.length; i++)
	    {
	      cell = row.createCell(i);
	      cell.setCellStyle(headStyle);
	      cell.setCellValue(columnNames[i]);
	    }

	    try
	    {
	      for (Map m : rs)
	      {
	        row = sheet.createRow(rowNum);

	        for (int i = 0; i < columnCodes.length; i++)
	        {
	          cell = row.createCell(i);
	          cell.setCellStyle(dataStyle);
	          cell.setCellValue(convertStr(m.get(columnCodes[i])));
	        }

	        if (rowNum % 10000 == 0)
	        {
	          this.log.debug("已写完" + rowNum / 10000 + "万行数据", columnCodes);
	          System.out.println("已写完" + rowNum / 10000 + "万行数据");
	        }
	        rowNum++;
	      }
	      this.log.debug("已写完" + rowNum + "行数据", columnCodes);
	      System.out.println("已写完" + rowNum + "行数据");

	      for (int i = 0; i < columnNames.length; i++)
	      {
	        sheet.autoSizeColumn(i);
	      }
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    return workbook;
	  }

	  /***
	  public Workbook exportSheet(Workbook workbook, String sheetName, List<Map> rs, Map columns)
	  {
	    int rowNum = 1;

	    Sheet sheet = null;
	    Row row = null;
	    CellStyle headStyle = getCellStyle(workbook, 1);
	    CellStyle dataStyle = getCellStyle(workbook, 2);
	    Set<String> hs = columns.keySet();

	    sheet = workbook.createSheet(sheetName);
	    row = sheet.createRow(rowNum - 1);
	    int maxColumnNum = columns.size();
	    if (rowNum > 1000000)
	    {
	      rowNum = 1;
	    }
	    int c = 0;
	    for (String s : hs)
	    {
	      Cell cell = row.createCell(c);
	      cell.setCellStyle(headStyle);
	      cell.setCellValue(s);
	      c++;
	    }

	    try
	    {
	      for (??? = rs.iterator(); ???.hasNext(); )
	      {
	    	  Map m = (Map)???.next();

	        row = sheet.createRow(rowNum);
	        int c2 = 0;
	        for (String s : hs)
	        {
	          Cell cell = row.createCell(c2);
	          cell.setCellStyle(dataStyle);
	          cell.setCellValue(convertStr(m.get(columns.get(s))));
	          c2++;
	        }

	        if (rowNum % 10000 == 0)
	        {
	          this.log.debug("已写完" + rowNum / 10000 + "万行数据");
	          System.out.println("已写完" + rowNum / 10000 + "万行数据");
	        }
	        rowNum++;
	      }
	      this.log.debug("已写完" + rowNum + "行数据");
	      System.out.println("已写完" + rowNum + "行数据");

	      for (int i = 0; i < hs.size(); i++)
	      {
	        sheet.autoSizeColumn(i);
	      }
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    return workbook;
	  }
	   **/
	  private String convertStr(Object o)
	  {
	    if (o == null) return "";
	    try
	    {
	      return ((BigDecimal)o).toString();
	    }
	    catch (Exception e) {
	    }
	    return o.toString();
	  }

	  private CellStyle getCellStyle(Workbook workbook, int type)
	  {
	    CellStyle cellStyle = workbook.createCellStyle();
	    Font font = workbook.createFont();
	    if (type == 1)
	    {
	      font.setFontName("宋体");
	      font.setFontHeightInPoints((short) 10);
	      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

	      cellStyle.setFont(font);

	      cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
	      cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

	      cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setLeftBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setRightBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setTopBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setBottomBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);

	      cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
	      cellStyle.setFillForegroundColor(HSSFColor.WHITE.index);
	    }
	    else if (type == 2)
	    {
	      font.setFontName("宋体");
	      font.setFontHeightInPoints(HSSFCellStyle.BORDER_DASH_DOT);
	      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

	      cellStyle.setFont(font);

	      cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
	      cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);

	      cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
	      cellStyle.setLeftBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setRightBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setTopBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	      cellStyle.setBottomBorderColor(HSSFCellStyle.BORDER_MEDIUM_DASHED);
	    }
	    return cellStyle;
	  }

	  public static InputStream getDownloadFile(String realPath, byte[] fileContents)
	    throws Exception
	  {
	    InputStream stream = null;

	    if ((realPath == null) && (fileContents == null)) throw new Exception("not found stream Contents");

	    if ((realPath != null) && (!"".equals(realPath)))
	    {
	      try
	      {
	        File readFile = new File(realPath);
	        FileInputStream fis = new FileInputStream(readFile);

	        byte[] buffer = new byte[(int)readFile.length()];
	        fis.read(buffer);

	        fis.close();
	        stream = new ByteArrayInputStream(buffer);
	      }
	      catch (FileNotFoundException e)
	      {
	        throw e;
	      }

	    }
	    else
	    {
	      stream = new ByteArrayInputStream(fileContents);
	    }

	    return stream;
	  }
}

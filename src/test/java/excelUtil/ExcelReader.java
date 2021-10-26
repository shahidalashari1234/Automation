package excelUtil;

import org.asynchttpclient.util.DateUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/*
public class ExcelReader {
    private FileInputStream fis;
    private FileOutputStream fileOut;
    private Workbook wb;
    private Sheet sh;
    private  Cell cell;
    private Row row;
    private CellStyle cellstyle;
    private Color mycolor;
    private String excelFilePath;
    private Map<String,Integer> columns = new HashMap<>();
    public  void setExcelFile(String ExcelPath, String SheetName) throws Exception {
        try {
            File fis = new File(ExcelPath);
            wb = WorkbookFactory.create(fis);
            sh = wb.getSheet(SheetName);
       /* sh = wb.getSheetAt(0); // 0- index of first sheet
        if (sh==null){
            sh = wb.createSheet(SheetName);
        }*/
           /* this.excelFilePath = ExcelPath;
            //adding all the column header names to the map 'columns'
            sh.getRow(i:0).forEach(cell -> {
                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public  String getCellData(int rownum, int colnum) throws Exception{
        try {
            cell = sh.getRow(rownum).getCell(colnum);
            String CellData = null;
            switch (cell.getCellType())
            {
                case STRING:
                    CellData = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtils.isCellDateFormatted(cell)) {
                        CellData = String.valueOf(cell.getDateCellValue());
                    }
                    else
                    {
                        CellData = String.valueOf((long) cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    CellData = boolean.toString(cell.getBooleanCellVAlue());
                    break;
                case BLANK:
                    CellData = "";
                    break;
            }
            return CellData;

        }
        catch (Exception e)
        {
            return "";
        }
    }
    public String getCellData(String columnName, int rownum) throws Exception {
       return getCellData(rownum, columns.get(columnName));
    }
    public static void main(String[] args) throws Exception{
        ExcelReader excel = new ExcelReader();
        excel.setExcelFile(ExcelPath:"./testData.xlsx", SheetName:"sheet1");
        int columnName;
        System.out.println(excel.getCellData(columnName:"fullname"));
        System.out.println(excel.getCellData(columnName:"email"));
        System.out.println(excel.getCellData(columnName:"telephone"));
    }
    public  int getNoOfRows()
    {
        return  sh.getPhysicalNumberOfRows();
    }
    public  int getNoOfColumns()
    {
        return  sh.getRow(i:0).getLastCellNum();
    }
    public Object[][] to2DArray() throws Exception {
     int noOfRows = getNoOfRows();
     int noOfcells = getNoOfColumns();
     Object obj[][]= new Object[noOfRows][noOfcells];
     for (int i=0;i<noOfRows;i++)
     {
        // row = sh.getRow(i);
         for (int j=0;j<noOfcells;j++)
         { obj[i][j]= getCellData(i,j); }
     }
        return obj;
    }

    }*/







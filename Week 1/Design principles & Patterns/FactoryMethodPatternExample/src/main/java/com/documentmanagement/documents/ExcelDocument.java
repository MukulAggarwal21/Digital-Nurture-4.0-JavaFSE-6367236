package com.documentmanagement.documents;


public class ExcelDocument extends Document {
    
    public ExcelDocument(String name) {
        super(name);
    }
    
    @Override
    public void create() {
        System.out.println("Creating Excel document: " + name + ".xlsx");
        System.out.println("Setting up Excel workbook...");
    }
    
    @Override
    public void open() {
        System.out.println("Opening Excel document: " + name + ".xlsx");
        System.out.println("Loading Excel calculation engine...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Excel document: " + name + ".xlsx");
        System.out.println("Recalculating formulas...");
    }
    
    @Override
    public void close() {
        System.out.println("Closing Excel document: " + name + ".xlsx");
    }
    
    @Override
    public String getFileExtension() {
        return ".xlsx";
    }
    
    public void addChart() {
        System.out.println("Adding chart to Excel document");
    }
    
    public void createPivotTable() {
        System.out.println("Creating pivot table in Excel document");
    }
}

package com.documentmanagement.documents;


public abstract class Document {
    protected String name;
    protected String content;
    
    public Document(String name) {
        this.name = name;
        this.content = "";
    }
    
    public abstract void create();
    public abstract void open();
    public abstract void save();
    public abstract void close();
    public abstract String getFileExtension();
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getName() {
        return name;
    }
    
    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Document: " + name + getFileExtension();
    }
}

package com.myblog.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private Long fieldvalue;

    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldvalue){
        super(String.format("%s Not Found With %s : '%s'",resourceName,fieldName,fieldvalue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldvalue = fieldvalue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Long getFieldvalue() {
        return fieldvalue;
    }
}

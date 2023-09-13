package com.example.javapatternprogram;

public class Pattern_java2 {
    private  String NameOfCode;
    private  String CodeDesc;

    public Pattern_java2(String nameOfCode, String codeDesc) {
        NameOfCode = nameOfCode;
        CodeDesc = codeDesc;
    }

    public String getNameOfCode() {
        return NameOfCode;
    }

    public void setNameOfCode(String nameOfCode) {
        NameOfCode = nameOfCode;
    }

    public String getCodeDesc() {
        return CodeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        CodeDesc = codeDesc;
    }
}

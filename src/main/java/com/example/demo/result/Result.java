package com.example.demo.result;

public class Result {
    //响应码
    private int code;
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Result(int code, String data) {
        this.code = code;
        this.data = data;
    }

}


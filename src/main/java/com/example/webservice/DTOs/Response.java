package com.example.webservice.DTOs;

import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "AddResponse")
public class Response {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
package com.example.springrestexample;

public class Hello {

    private String title;
    private String value;

    public Hello(String greetings, String value) {
        this.title = greetings;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

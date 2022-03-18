package com.example.magic.model;

public class PostResponse {

    Integer id;
    String message;
    String extra;

    public PostResponse() {
    }

    public PostResponse(Integer id, String message, String extra) {
        this.id = id;
        this.message = message;
        this.extra = extra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }


}

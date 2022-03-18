package com.example.magic.model;


//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

public class SampleResponse {

    private String message;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public SampleResponse() {
    }

    public SampleResponse(String message, Long id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

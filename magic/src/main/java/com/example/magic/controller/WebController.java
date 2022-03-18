package com.example.magic.controller;


import com.example.magic.model.PostRequest;
import com.example.magic.model.PostResponse;
import com.example.magic.model.SampleResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @RequestMapping("/sample")
    public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Robot") String name){
        SampleResponse response = new SampleResponse();
        response.setId(1L);
        response.setMessage("your name is "+ name);

        return response;

    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayload){
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId()*100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Some Text");

        return response;

    }
}

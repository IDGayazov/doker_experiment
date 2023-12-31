package myApplication.app1.controllers;

import myApplication.app1.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Message> hello(){

        Message message = new Message();
        message.setMessage("hello, world");

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(message);
    }
}

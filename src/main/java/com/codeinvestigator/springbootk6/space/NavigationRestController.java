package com.codeinvestigator.springbootk6.space;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class NavigationRestController {


    @GetMapping("/api/navigation")
    public ResponseEntity<String> destination(){
        int i = new Random().nextInt()%3;
        if (i == 1)
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>("Mars", HttpStatus.OK);
    }
}

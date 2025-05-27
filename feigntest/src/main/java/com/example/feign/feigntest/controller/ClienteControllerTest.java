package com.example.feign.feigntest.controller;

import com.example.feign.feigntest.dto.ResponseFeign;
import com.example.feign.feigntest.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/feign", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ClienteControllerTest {

    @Autowired
    private MiServicio miServicio;

    @GetMapping("/test")
    public ResponseEntity<ResponseFeign> obtenerDatos(){
        ResponseFeign response = miServicio.getResponse();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }


}

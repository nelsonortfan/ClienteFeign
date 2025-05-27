package com.example.feign.feigntest.service;

import com.example.feign.feigntest.client.MiClienteFeign;
import com.example.feign.feigntest.dto.ResponseFeign;
import org.springframework.stereotype.Service;

@Service
public class MiServicio {

    private final MiClienteFeign miClienteFeign;

    public MiServicio(MiClienteFeign miClienteFeign){
        this.miClienteFeign = miClienteFeign;
    }

    public ResponseFeign getResponse(){
        return miClienteFeign.obtenerRespuesta();
    }

}

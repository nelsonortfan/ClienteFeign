package com.example.feign.feigntest.client;

import com.example.feign.feigntest.dto.ResponseFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="miCliente", url="${accounts.url}")
public interface MiClienteFeign {

    @GetMapping("/fetch?mobileNumber=4355437687")
    ResponseFeign obtenerRespuesta();

}

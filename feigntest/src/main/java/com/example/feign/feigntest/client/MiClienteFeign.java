package com.example.feign.feigntest.client;

import com.example.feign.feigntest.dto.ResponseFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="miCliente", url="${accounts.url}")
public interface MiClienteFeign {

    @GetMapping("/fetch")
    ResponseFeign obtenerRespuesta(@RequestParam("mobileNumber") String mobileNumber);

}

package com.kunluntop.feignClient;


import com.kunluntop.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "CARSYSTEM", fallbackFactory= CarClientServiceFallbackFactory.class)
public interface CarClientService {

@RequestMapping(value = "/cars/ListCars" ,method = RequestMethod.GET)
Result getCarList();

@RequestMapping(value = "/cars/add" ,method = RequestMethod.GET)
Result add();

}

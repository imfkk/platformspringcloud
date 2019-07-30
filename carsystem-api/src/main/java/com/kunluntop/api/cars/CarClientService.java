package com.kunluntop.api.cars;


import com.kunluntop.response.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "carsystem", fallbackFactory= CarClientServiceFallbackFactory.class)
public interface CarClientService {

@RequestMapping(value = "/cars/ListCars" ,method = RequestMethod.POST)
Result getCarList();

}

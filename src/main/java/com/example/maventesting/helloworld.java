package com.example.maventesting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
@RequestMapping("/")  
public String hello()   
{  
return "Hello javaTpoint";  
}  

@RequestMapping("/path1")  
public String hellopath()   
{  
return "Hello javaTpoint path1";  
}  
    
}

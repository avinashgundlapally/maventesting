package com.example.maventesting;

import java.util.List;  
public interface IProductService   
{  
List<Product> findAll();  
Product findById(String id);
}  

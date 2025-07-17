package com.kafka_practice_app.productmicroservice.service;


import com.kafka_practice_app.productmicroservice.model.CreateProductRestModel;

public interface ProductService {

    String createProduct(CreateProductRestModel productRestModel) throws Exception ;

}
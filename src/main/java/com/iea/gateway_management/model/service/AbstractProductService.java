package com.iea.gateway_management.model.service;

import com.google.gson.JsonElement;
import com.iea.gateway_management.channel.model.repository.ProductServiceCallable;
import org.springframework.beans.factory.annotation.Autowired;

// ***13 -> ProductServiceCallable
public abstract class AbstractProductService implements EntityService<JsonElement, Integer>
{
    @Autowired
    protected ProductServiceCallable productServiceCallable;
}

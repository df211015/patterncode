package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.constants.EShape;
import com.example.dto.Shape;
import com.example.factoryPattern.v1.SimpleShapeFactory;
import com.example.factoryPattern.v2.ConcreteCreator;
import com.example.factoryPattern.v2.ConcreteProduct1;
import com.example.factoryPattern.v2.Creator;
import com.example.factoryPattern.v2.Product;
import com.example.factoryPattern.v3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/factory")
public class FactoryPatternController {

    /**
     * 简单工厂模式
     *
     * @param param
     * @return
     */
    @GetMapping(value = "/getsimplefactory")
    public String getSimpleFactory(@RequestParam String param) {
        Shape shapeInstance = SimpleShapeFactory.getShapeInstance(EShape.circle);
        String json = JSON.toJSONString(shapeInstance);
        return json;
    }

    @GetMapping(value = "/getfactorymethod")
    public Product getFactoryMethod(){
        Creator creator = new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
        return product;
    }

    @GetMapping(value = "getabstractfactory")
    public String getAbstractFactory(){
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        AbstractProductA productA = creator1.createProductA();
        AbstractProductB productB = creator1.createProductB();

        AbstractProductA productA1 = creator2.createProductA();
        AbstractProductB productB1 = creator2.createProductB();

        return "";
    }
}

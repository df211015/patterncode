package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.constants.EShape;
import com.example.dto.Shape;
import com.example.factoryPattern.v1.SimpleShapeFactory;
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
    @GetMapping(value = "/v1")
    public String v1(@RequestParam String param) {
        Shape shapeInstance = SimpleShapeFactory.getShapeInstance(EShape.circle);
        String json = JSON.toJSONString(shapeInstance);
        return json;
    }
}

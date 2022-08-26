package com.example.factoryPattern.v1;

import com.example.constants.EShape;
import com.example.dto.Circle;
import com.example.dto.Rect;
import com.example.dto.Shape;
import com.example.dto.Triangle;

public class SimpleShapeFactory {
    /**
     * 通过静态方式封装实例的产生过程
     *
     * @param shape
     * @return
     */
    public static Shape getShapeInstance(EShape shape) {
        Shape myShape = null;
        if (EShape.circle.equals(shape)) {
            myShape = new Circle();
        } else if (EShape.rect.equals(shape)) {
            myShape = new Rect();
        } else if (EShape.tri.equals(shape)) {
            myShape = new Triangle();
        }

        return myShape;
    }
}
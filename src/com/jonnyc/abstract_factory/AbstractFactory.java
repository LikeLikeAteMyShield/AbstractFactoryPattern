package com.jonnyc.abstract_factory;

import com.jonnyc.abstract_factory.model.Color;
import com.jonnyc.standard_factory.model.Shape;

public abstract class AbstractFactory {

    protected abstract Color getColor(String color);
    protected abstract Shape getShape(String shape);
}

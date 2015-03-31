package com.jonnyc.abstract_factory;

import com.jonnyc.abstract_factory.model.Blue;
import com.jonnyc.abstract_factory.model.Color;
import com.jonnyc.abstract_factory.model.Green;
import com.jonnyc.abstract_factory.model.Red;
import com.jonnyc.standard_factory.model.Shape;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color){

        if(color == null)
            return null;

        if(color.equalsIgnoreCase("RED"))
            return new Red();

        else if(color.equalsIgnoreCase("GREEN"))
            return new Green();

        else if(color.equalsIgnoreCase("BLUE"))
            return new Blue();

        return null;
    }

    @Override
    public Shape getShape(String shape){
        return null;
    }
}

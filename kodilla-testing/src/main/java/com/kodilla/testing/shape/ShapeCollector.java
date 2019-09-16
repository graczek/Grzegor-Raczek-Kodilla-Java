package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<Shape>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public boolean removeFigure(int n){
        if(shapeList.size() <= 0){
            return false;
        } else {
            shapeList.remove(n);
            return true;
        }
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public void showFigures(){
        for (Shape figure: shapeList){
            System.out.println(figure.getShapeName());
        }
    }
}

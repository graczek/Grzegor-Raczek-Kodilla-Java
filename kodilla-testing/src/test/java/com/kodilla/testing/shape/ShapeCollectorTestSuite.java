package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = shapeCollector.getShapeList();
        //when
        shapeCollector.addFigure(circle);
        //then
        Assert.assertEquals(1, shapeList.size());
    }

    @Test
    public void testRemoveFigureWhenNoneOnList(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = shapeCollector.getShapeList();
        //when
        boolean result = shapeCollector.removeFigure(0);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigureWhenExisting(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = shapeCollector.getShapeList();
        Shape triangle = new Triangle();
        shapeCollector.addFigure(triangle);
        int size = shapeList.size();
        //when
        boolean result = shapeCollector.removeFigure(0);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(size-1, shapeList.size());
    }

    @Test
    public void testGetFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = shapeCollector.getShapeList();
        Shape triangle = new Triangle();
        Shape square = new Square();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //when
        Shape receivedFigure = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(triangle, receivedFigure);
    }

    @Test
    public void testShowFigures(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = shapeCollector.getShapeList();
        Shape triangle = new Triangle();
        Shape square = new Square();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //when
        shapeCollector.showFigures();
        //then
        Assert.assertEquals("triangle", shapeList.get(0).getShapeName());
        Assert.assertEquals("square", shapeList.get(1).getShapeName());
    }




}

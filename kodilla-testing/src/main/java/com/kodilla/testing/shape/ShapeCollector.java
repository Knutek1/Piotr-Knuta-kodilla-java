package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
private List<Shape> list = new ArrayList<>();

     void addFigure(Shape shape){
         list.add(shape);

     }
    boolean removeFigure(Shape shape){
        boolean result = false;
        if (list.contains(shape)) {
            list.remove(shape);
            result = true;
        }
        return result;
    }
    Shape getFigure(int n){

         return list.get(n);
    }
    String showFigures(){
         StringBuilder sb = new StringBuilder();
         for(Shape o : list) {
             sb.append(o.getShapeName());
         }
         return sb.toString();
    }
    public int getShapeQuantity() {
        return list.size();

    }
}

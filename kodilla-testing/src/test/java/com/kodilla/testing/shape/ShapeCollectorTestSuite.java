package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {
@Nested
@DisplayName("circleTest")
class CircleTest {
        @Test
        void testAddShape() {
                Shape circle = new Circle(4);
                ShapeCollector shapeCollector = new ShapeCollector();

                shapeCollector.addFigure(circle);

                Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
        }

        @Test
        void testRemoveShape() {
                Shape circle = new Circle(4);
                ShapeCollector shapeCollector = new ShapeCollector();
                shapeCollector.addFigure(circle);

                boolean result = shapeCollector.removeFigure(circle);

                Assertions.assertTrue(result);
                Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
        }

        @Test
        void testGetShape() {
                Shape circle = new Circle(4);
                ShapeCollector shapeCollector = new ShapeCollector();
                shapeCollector.addFigure(circle);

                Shape shape = shapeCollector.getFigure(0);

                Assertions.assertEquals(circle, shape);
        }

        @Test
        void testShowShape() {
                Shape circle = new Circle(4);
                ShapeCollector shapeCollector = new ShapeCollector();
                shapeCollector.addFigure(circle);

                String name = circle.getShapeName();

                Assertions.assertEquals(name, shapeCollector.showFigures());
        }
}
        @Nested
        @DisplayName("squareTest")
        class SquareTest {
                @Test
                void testAddShape() {
                        Shape square = new Square(4);
                        ShapeCollector shapeCollector = new ShapeCollector();

                        shapeCollector.addFigure(square);

                        Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
                }

                @Test
                void testRemoveShape() {
                        Shape square = new Square(4);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(square);

                        boolean result = shapeCollector.removeFigure(square);

                        Assertions.assertTrue(result);
                        Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
                }

                @Test
                void testGetShape() {
                        Shape square = new Square(4);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(square);

                        Shape shape = shapeCollector.getFigure(0);

                        Assertions.assertEquals(square, shape);
                }

                @Test
                void testShowShape() {
                        Shape square = new Square(4);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(square);

                        String name = square.getShapeName();

                        Assertions.assertEquals(name, shapeCollector.showFigures());
                }
        }
        @Nested
        @DisplayName("triangleTest")
        class TriangleTest {
                @Test
                void testAddShape() {
                        Shape triangle = new Triangle(4,3);
                        ShapeCollector shapeCollector = new ShapeCollector();

                        shapeCollector.addFigure(triangle);

                        Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
                }

                @Test
                void testRemoveShape() {
                        Shape triangle = new Triangle(4,3);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(triangle);

                        boolean result = shapeCollector.removeFigure(triangle);

                        Assertions.assertTrue(result);
                        Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
                }

                @Test
                void testGetShape() {
                        Shape triangle = new Triangle(4,3);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(triangle);

                        Shape shape = shapeCollector.getFigure(0);

                        Assertions.assertEquals(triangle, shape);
                }

                @Test
                void testShowShape() {
                        Shape triangle = new Triangle(4,3);
                        ShapeCollector shapeCollector = new ShapeCollector();
                        shapeCollector.addFigure(triangle);

                        String name = triangle.getShapeName();

                        Assertions.assertEquals(name, shapeCollector.showFigures());
                }
        }
}

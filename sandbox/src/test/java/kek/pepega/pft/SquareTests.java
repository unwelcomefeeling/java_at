package kek.pepega.pft;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {


    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }

    @Test
    public void testPoint(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(-182,20);
        Assert.assertEquals(p1.distance(p2), 183.09560344257315);
    }

    @Test
    public void testPoint1(){
        Point p1 = new Point(1,2);
        Point p2 = new Point(1, 2);
        Assert.assertEquals(p1.distance(p2), 0.0);
}

    @Test
    public void testPoint2(){
        Point p1 = new Point(255,2213);
        Point p2 = new Point(15443, 59340);
        Assert.assertEquals(p1.distance(p2), 59111.50034468758);
    }

}

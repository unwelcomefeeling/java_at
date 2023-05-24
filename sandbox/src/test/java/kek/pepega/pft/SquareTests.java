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
    public void testPoint1(){
        Point d = new Point(0,0,-182,20);
        Assert.assertEquals(d.distance(), 183.09560344257315);
    }

    @Test
    public void testPoint(){
        Point d = new Point(1,2,1,2);
        Assert.assertEquals(d.distance(), 0.0);
}

    @Test
    public void testPoint2(){
        Point d = new Point(1,2,1,2);
        Assert.assertEquals(d.distance(), 0.90);
    }

}

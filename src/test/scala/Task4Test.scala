import org.junit.*
import org.junit.Assert.*

class Task4Test:

    import Shape.*;

    val rect = Rectangle(10, 5)
    val circle = Circle(4)
    val sqr = Square(5)

    @Test def getPerimeterOfRectangle() =
        assertEquals(30, perimeter(rect), 0)

    @Test def getPerimeterOfCircle() =
        assertEquals(8*Math.PI, perimeter(circle), 0.001)

    @Test def getPerimeterOfSquare() =
        assertEquals(20, perimeter(sqr), 0)

    @Test def scaleRectangle() =
        assertEquals(Rectangle(20, 10), scale(rect, 2))

    @Test def scaleCircle() =
        assertEquals(Circle(8), scale(circle, 2))
    
    @Test def scaleSquare() =
        assertEquals(Square(15), scale(sqr, 3))
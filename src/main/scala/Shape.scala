enum Shape:
    case Rectangle(width: Double, height: Double)
    case Circle(radius: Double)
    case Square(size: Double)

object Shape:
    def perimeter(shape: Shape): Double = shape match
        case Shape.Rectangle(w, h) => 2 * (w + h)
        case Shape.Circle(r) => 2 * r * Math.PI
        case Shape.Square(l) => 4 * l
    
    def scale(shape: Shape, size: Double): Shape = shape match
        case Shape.Rectangle(w, h) => Shape.Rectangle(size*w, size*h)
        case Shape.Circle(r) => Shape.Circle(size*r)
        case Shape.Square(l) => Shape.Square(l*size)
    
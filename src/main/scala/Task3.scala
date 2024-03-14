object Task3 extends App:

    @annotation.tailrec
    def gcd(a: Int, b:Int): Int = (a, b) match
        case (i, 0) => i
        case (0, i) => i
        case (a, b) if a > b => gcd(b, a % b)
        case _ => gcd(a, b % a)

    println("(gcd(12, 8)=" + gcd(12, 8))
    println("(gcd(14, 7)=" + gcd(14, 7))
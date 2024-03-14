object HelloWorld extends App:
    // exercise 1
    println("Hello World!")
    
    // exercise 3
    // a)

    def positive(i: Int): String = i match
        case i if i >= 0 => "positive"
        case _ => "negative"

    val sign: Int => String = (i: Int) => i match
        case i if i >= 0 => "positive"
        case _ => "negative"

    println("(Using def) 5 is " + positive(5))
    println("(Using lambda) 5 is " + sign(5))

    // b)
    def neg(predicate: String => Boolean): String => Boolean =
        (s: String) => !predicate(s)

    val negLambda: (String => Boolean) => (String => Boolean) = (predicate: String => Boolean) =>
        (s: String) => !predicate(s)
    
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = negLambda(empty) // which type of notEmpty?
    println(notEmpty("foo")) // true
    println(notEmpty("")) // false
    println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

    // c)
    def genericNeg[X](predicate: X => Boolean): X => Boolean =
        (x: X) => !predicate(x)

    
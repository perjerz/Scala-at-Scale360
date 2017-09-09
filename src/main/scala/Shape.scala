sealed trait TriangleType

case object Equilateral extends TriangleType
case object Isosceles extends TriangleType
case object Scalene extends TriangleType

sealed trait Shape {
    def calculateArea(): Double
    def calculateCircumstance(): Double
}

case class Circle(radius: Double) extends Shape {
    def calculateArea(): Double = math.Pi * math.pow(radius, 2) 
    def calculateCircumstance(): Double = 2 * math.Pi * radius
}


case class Triangle(w1: Int, w2: Int, w3: Int) extends Shape {
    def calculateArea(): Double = {
        val s =  (w1 + w2 + w3)/2
        math.sqrt(s*(s-w1)*(s-w2)*(s-w3))
    }
    def calculateCircumstance(): Double = w1 + w2 + w3
    def determine: TriangleType = (w1, w2, w3) match {
      case (a, b, c) if a == b && b == c => Equilateral
      case (a, b, c) if a == b || a == c || b == c => Isosceles
      case _ => Scalene
    }
    def isEquilateral() = w1 == w2 && w1 == w3
    def isIsosceles() = (w1,w2,w3) match {
        case (w1,w2,w3) if !this.isEquilateral()  => w1 == w2 || w2 == w3 || w1 == w3
        case _ => false
    }
    def isScalene() = !this.isEquilateral() && !this.isIsosceles()
}

case class Rectangle(width: Double) extends Shape {
    def calculateArea(): Double = width * width
    def calculateCircumstance(): Double = 4 * width
}

object Shape extends App {
    val t1 = Triangle(1,2,3)
    println(t1.isEquilateral())
    println(t1.determine)
}


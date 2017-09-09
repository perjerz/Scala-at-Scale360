sealed trait Pets

case class Fish(name: String) extends Pets
case class Dog(name: String, breedname: String) extends Pets
case class Cat(name: String, fishCaught: Int) extends Pets {
    def meet(pet: Pets) = pet match {
        case Cat(_,_) => this
        case Dog(_,_) => copy(fishCaught = 0)
        case Fish(_) => copy(fishCaught = fishCaught+1)
    }
}

object main extends App {
    val f1 = Fish("Fish")
    val c1 = Cat("Inw",1);
    val c2 =  Cat("Oh",2);
    var d1 = Dog("Hey","bangkaew")
    println(c1)    
    println(c1.meet(f1))
}

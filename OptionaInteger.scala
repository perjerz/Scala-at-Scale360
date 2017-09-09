sealed trait OptionalInt {
    def map(fn: Int => Int): OptionalInt 
}

case object NoInt extends OptionalInt {
    def map(fn: Int => Int) = NoInt    
}
case class HasInt(value: Int) extends OptionalInt {
    def map(fn: Int => Int) = HasInt(fn(value))
}

/*val oi: OptionalInt = HasInt(20)
oi.map(20).map(_+ 10).map(_*2)*/
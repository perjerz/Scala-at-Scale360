sealed trait Method {
    def method: String
}

case object POST  extends Method {
    def method = "POST"
}
case object GET  extends Method {
    def method = "GET"
}
case object PUT  extends Method {
    def method = "PUT"
}
case object DELETE extends Method {
    def method = "DELETE"
}

case class OTHERS(method: String) extends Method

object HttpMethod extends App {
    def setMethod(method: Method) = s"${method.method}"
    println(setMethod(new OTHERS("OTHERS")))
}
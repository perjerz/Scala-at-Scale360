sealed trait TrafficLight{
  def value: String
}

case object Red extends TrafficLight {
    def value = "RED"
}
case object Yellow extends TrafficLight {
    def value = "YELLOW"
}
case object Green extends TrafficLight {
    def value ="GREEN"
}

object TrafficLightA extends App {
    def JamePassTraffic(light: TrafficLight) =
        s"Jame passed road with ${light.value} traffic light"
    var jame = JamePassTraffic(Red)
    println(jame)
}
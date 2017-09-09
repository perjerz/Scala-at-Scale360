sealed trait BinaryTree

case class Branch(left: BinaryTree, right: BinaryTree, leaf: Leaf) extends BinaryTree
case class Leaf(value: Int) extends BinaryTree
/*object HelloSbt extends App {
    println("Sbt says hello")
}*/
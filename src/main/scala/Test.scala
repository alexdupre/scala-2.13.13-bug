import scala.collection.mutable

object Test {

  def main(args: Array[String]): Unit = {
    val builder = mutable.ArrayBuilder.make[String]
    (1 to 100).foreach { i =>
      println(s"Iteration $i")
      builder.addAll(Array.empty[String])
    }
  }

}

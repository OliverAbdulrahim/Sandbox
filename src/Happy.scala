import scala.collection.immutable.Vector

object Happy extends App {

  def format(v: Vector[_]) = v.mkString(", ")

  def testEngineerExuberance(engineers: Vector[Engineer]): Unit = {
    // _1 contains happy, _2 contains unhappy
    val splitEngineers = engineers.partition(_.isHappy)
    if (splitEngineers._1.size > splitEngineers._2.size) {
      println(s"Hooray, these people are happy: ${format(splitEngineers._1)}!")
    } else {
      println(s"Bummer, these people are upset: ${format(splitEngineers._2)}")
    }
  }

  testEngineerExuberance(Vector(new Engineer("Debbie Downer", false), new Engineer("Ulysses Upper", true)))
}

class Engineer(val name: String, val isHappy: Boolean) {
  override def toString = name
}

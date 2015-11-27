import scala.collection.immutable.Vector

object Happy extends App {

  def format(v: Vector[_]) = v.mkString(", ")

  def testEngineerExuberance(engineers: Vector[Engineer]): Unit = {
    val (happy, unhappy) = engineers partition (_.isHappy)
    if (happy.size > unhappy.size) {
      println(s"Hooray, these people are happy: ${format(happy)}!")
    } else {
      println(s"Bummer, these people are upset: ${format(unhappy)} :(")
    }
  }
  testEngineerExuberance(Vector(new Engineer("Debbie Downer", false), new Engineer("Ulysses Upper", true)))
}

class Engineer(val name: String, val isHappy: Boolean) {
  override def toString = name capitalize
}

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  val x = xc;
  val y = yc;
  def this(x:Int) {
    this(x,1)
  }

  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}



val p1 = new Point(2, 3)
val p2 = new Point(2, 4)
val p3 = new Point(3, 3)

println(p1.isNotEqual(p2))
println(p1.isNotEqual(p3))
println(p1.isNotEqual(2))
import scala.math.sqrt;

case class Point (var x:Int, var y:Int) { 
  def add(p:Point):Point = {
    Point(x + p.x, y + p.y);
  } 
  def move(dx:Int, dy:Int) = {
    x = x + dx;
    y = y + dy;
  }
  def distance(p:Point):Double = {
    sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
  }
  def invert() = {
    val temp = x;
    x = y;
    y = temp;
  }
}

object Question extends App { 
  val p1 = Point(0, 2);
  val p2 = Point(1, 3)
  println("Point 1: " + p1);
  println("Point 2: " + p2);
  
  //add two points
  println("\nPoint 3 = Point 1 + Point 2");
  val p3 = p1 add p2;
  println("Point 3: " + p3);

  //move point by dx,dy distance
  val a = 2;
  val b = 1;
  println("\nMoving " + p3 + " by (" + a + ", " + b +")");
  p3.move(a, b);
  println(p3);

  //distance between two points
  println("\nThe distance between " + p1 + " and " + p2);
  println(p2.distance(p1));

  //inverting point
  println("\nInverting " + p3);
  p3.invert();
  println(p3);
}
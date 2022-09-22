object MyProgram extends App{
  val x : Int = 1;
  val y : Int = 2;

  println(add(x,y));
  def add(x : Int, y : Int) : Int = {
    return x + y;
  }
}

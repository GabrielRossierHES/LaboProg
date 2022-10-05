object Lab2_Task8 extends App{
  var entry : Int = TextTools.readText().toInt

  val hours = entry / 3600
  val minutes = (entry % 3600) / 60
  val seconds = (entry % 3600) % 60

  val hs:String = addZero(hours)
  val ms:String = addZero(minutes)
  val ss:String = addZero(seconds)

  println(s"$hs:$ms:$ss")

  def addZero(a: Int) : String = {
    if(a < 9)
    "0" + a.toString
    else
    a.toString
  }

}

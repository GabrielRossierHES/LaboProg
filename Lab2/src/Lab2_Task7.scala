object Lab2_Task7 extends App {
 var a : String = TextTools.readText()
  var b : String = a.toUpperCase()

  println(b)
  println(b.reverse)
  println("Hello World")
  println(b.toLowerCase())
  println(TextTools.deleteConsonants(b))

  var c : String = TextTools.readText()
  var hashedString : String = TextTools.encrypt(c); // chiffrement par décalage
  println(hashedString)
  println(TextTools.decrypt(hashedString))

}

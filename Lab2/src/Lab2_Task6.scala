object Lab2_Task6 extends App{
  var a : String = TextTools.readText();

  //Version pas ouf avec une boucle
  var b: Array[Char] = a.toCharArray();
  b(0) = b(0).toUpper;
  for(i<- 0 to b.length-1){
    print(b(i));
  }
  println("");

  //Version plus ouf avec la fonction capitalise
  println(a.capitalize);
}

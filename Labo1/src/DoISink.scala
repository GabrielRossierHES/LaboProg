object DoISink extends App{
  println("Welcome to Do I Sink Program :D ")
  print("Please enter outer sphere radius (in cm): ")

  val radius : Double = Input.readDouble()

  print("Please enter surface thickness (in cm):")

  val thickness : Double = Input.readDouble()

  val volume : Double = (4.0 * math.Pi * math.pow(radius,3))/3

  val emptyVolume : Double = volume - ((4.0 * math.Pi * math.pow(radius - thickness,3))/3)

  println("The volume of the sphere is: " + volume + " cm^3")
  print("Enter material density (in g/cm3): ")

  val density : Double = Input.readDouble()

  val densityByVolume : Double = (density*emptyVolume) / volume


  if(densityByVolume > 1.0){
    println("The total density is: " + densityByVolume + " g/cm3 the object sink")
  }else{
    println("The total density is: " + densityByVolume + " g/cm3 the object float")

  }


}

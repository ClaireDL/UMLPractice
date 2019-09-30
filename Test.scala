package com.clairedl.scala

object Main extends App {

  // Exercise 1.1
  println( "Exercise 1.1" )

  val c1 = new Circle1()
  println( "The circle has radius of " + c1.radius + " and area of " + c1.area )

  val c2 = new Circle1( 2.0 )
  println( "The circle has radius of " + c2.radius + " and area of " + c2.area )

  val c3 = new Circle1( 2.50, "blue" )
  println( "The " + c3.colour + " circle has radius of " + c3.radius + " and area of " + c3.area )

  val c4 = new Circle1( 2.50, "blue" )
  c4.radius = 5.0
  // c4.radius_=(5.0)
  println( "radius is: " + c4.radius )
  c4.colour = "green"
  println( "colour is: " + c4.colour )

  val c5 = new Circle1( 5.0 )
  println( c5.toString() )

  val c6 = new Circle1( 1.2 )
  println( c6.toString() )
  println( c6 )
  println( s"Operator '+' invokes toString() too $c6" )

  // Exercise 1.2
  println( "Exercise 1.2" )

  val c7 = new Circle2(3)
  println( s"Circumference is ${c7.circumference}" )
  println( c7.toString() )

  // Exercise 2.1
  println( "Exercise 2.1" )

  val ahteck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm')
  println( ahteck )
  ahteck.email = "paulTan@nowhere.com"
  println( s"name is: ${ahteck.name}" )
  println( s"email is ${ahteck.email}" )

  val dummyBook = new Book("Scala for dummy", ahteck, 19.95, 99)
  println(dummyBook)

  dummyBook.price = 29.95
  dummyBook.quantity = 28
  println(s"name is: ${dummyBook.name}")
  println(s"price is: ${dummyBook.price}")
  println(s"quantity is: ${dummyBook.quantity}")
  println(s"Author is: ${dummyBook.author}")
  println(s"Author's name is: ${dummyBook.author.name}")
  println(s"Author's email is: ${dummyBook.author.email}")

  val anoterBook = new Book("more Scala", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95)
  println(anoterBook)

  println(dummyBook.author.name)
  println(dummyBook.author.email)

  println(authorName)
}

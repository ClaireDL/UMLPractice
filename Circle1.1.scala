package com.clairedl.scala

class Circle1(r: Double, c: String) {
  // primary constructor takes 2 parameters

  // secondary constructor, no argument, 2 default values
  def this() = this(1.0, "red")

  // secondary constructor, takes 1 argument, the other is defaul
  def this(r: Double) = this(r, "red")

  private var _radius: Double = r
  private var _colour: String = c

  // getter and setter for radius
  def radius: Double = this._radius
  // radius_ is the setter, setRadius in java
  def radius_=(value: Double): Unit = {
    // if( value <= 0.0 ) throw new RuntimeException("Radius cannot be zero or negative")
    this._radius = value
  }

  // getter and setter for colour
  def colour: String = this._colour
  def colour_=(value: String): Unit = this._colour = value

  def area: Double = this.radius * this.radius * Math.PI

  override def toString(): String = {
    s"Circle[radius= $radius colour= $colour]"
  }
}

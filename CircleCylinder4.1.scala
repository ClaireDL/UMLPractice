package com.clairedl.scala

class Circle3(var radius: Double, var colour: String) {
  def this() = this(1.0, "red")

  def this(radius: Double) = this(radius, "red")

  def area(): Double = this.radius * this.radius * Math.PI

  override def toString(): String = s"Circle[radius= $radius colour= $colour]"
}

class Cylinder(radius: Double, var height: Double, colour: String) extends Circle3(radius, colour) {
  def this() = this(1.0, 1.0, "red")

  def this(radius: Double) = this(radius, 1.0, "red")

  def this(radius: Double, height: Double) = this(radius, height, "red")

  def volume: Double = area * this.height

  override def toString(): String = s"Cylinder: ${super.toString()} height = $height"
}

package com.clairedl.scala

class Circle2(r: Double){

  def this() = this(1.0)

  private var _radius: Double = r

  def radius: Double = this._radius
  def radius_=(value: Double): Unit = this._radius = value

  def area: Double = this.radius * this.radius * Math.PI

  def circumference: Double = 2 * this.radius * Math.PI

  override def toString(): String = s"Circle[radius= $radius]"

}

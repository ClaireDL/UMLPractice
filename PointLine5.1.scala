package com.clairedl.scala

class Point(val x: Int, val y: Int){
  override def toString(): String = s"Point: ($x, $y)"
}

class Line(val begin: Point, val end: Point) {
  def this(beginX: Int, beginY: Int, endX: Int, endY: Int) =
    this(new Point(beginX, beginY), new Point(endX, endY))

  override def toString(): String =
    s"$begin is the starting point, $end is the end point"

  def length: Int = {
    val xDiff: Double = this.begin.x - this.end.x
    val yDiff: Double = this.begin.y - this.end.y
    math.sqrt((math.pow(xDiff, 2) + math.pow(yDiff, 2))).toInt
  }
}

class LineSub(x: Int, y: Int, val endX: Int, val endY: Int)
extends Point(x, y) {
  override def toString(): String =
    s"$xDiff is the starting point, $yDiff is the end point"

  val xDiff: Double = this.x - this.endX
  val yDiff: Double = this.y - this.endY

  def length: Int = {
    math.sqrt(math.pow(xDiff, 2) + math.pow(yDiff, 2)).toInt
  }
}

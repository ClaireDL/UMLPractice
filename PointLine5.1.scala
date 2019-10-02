package com.clairedl.scala

class Point(val x: Int, val y: Int){
  override def toString(): String = s"Point: ($x, $y)"
}

class Line(val begin: Point, val end: Point) {
  def this(beginX: Int, beginY: Int, endX: Int, endY: Int) = this(new Point(beginX, beginY), new Point(endX, endY))
}

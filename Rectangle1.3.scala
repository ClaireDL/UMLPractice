package com.clairedl.scala

class Rectangle(val length: Float = 1.0f, val width: Float = 1.0f) {

  def rectangle(): Unit = {
    val length: Float = 1.0f
    val width: Float = 1.0f
  }

  def rectangle(l: Float, w: Float): Unit = {
    val length: Float = l
    val width: Float = w
  }

  def getLength: Float = {
    length
  }

  def setLength(newLength: Float): Unit = {
    val length = newLength
  }

  def getWidth: Float = {
    width
  }

  def setWidth(newWidth: Float): Unit = {
    val width = newWidth
  }

  def getArea: Float = {
    length * width
  }

  def getPerimeter: Float = {
    2 * ( length + width )
  }

  override def toString(): String = {
    s"Rectangle[length $length]"
  }
}

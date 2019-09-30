package com.clairedl.scala

class MyComplex(var real: Double, var imag: Double) {
  def this() = this(0.0, 0.0)

  def value(real: Double, imag: Double): Unit = {
    this.real = real
    this.imag = imag
  }

  override def toString(): String = s"$real + ${imag}i"

  def isReal: Boolean = this.imag == 0.0

  def isImaginary: Boolean = this.real == 0.0

  def equals(real: Double, imag: Double): Boolean =
    this.real == real && this.imag == imag

  def equals(another: MyComplex): Boolean =
    this.real == another.real && this.imag == another.imag

  def magnitude: Double = Math.sqrt(
    Math.pow(this.real, 2) + Math.pow(this.imag, 2)
  )

  // atan2(y, x) avoids division by 0, which atan(Double) does not
  def argument: Double = Math.atan2(this.imag, this.real)
}

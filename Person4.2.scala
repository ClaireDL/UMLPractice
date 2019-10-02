package com.clairedl.scala

class Person(val name: String, val address: String) {
  override def toString(): String = s"Person[name = ${this.name}, address = ${this.address}]"
}

class Student(name: String, address: String, val program: String, val year: Int, val fee: Double)
extends Person(name, address) {
  override def toString(): String =
    s"""Student ${super.toString()},
    program= $program, year= $year, fee= $fee"""
}

class Staff(name: String, address: String, val school: String, val pay: Double) extends Person(name, address) {
  override def toString(): String =
    s"""Staff ${super.toString()},
    school= $school, pay= $pay"""
}

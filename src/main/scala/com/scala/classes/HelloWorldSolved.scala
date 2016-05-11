package com.scala.classes

//Task: Part I:
/**
 Implementar a Classe MyInt que recebe um inteiro e possui as seguintes funções
    add(MyInt): MyInt
    add(Int): MyInt
    sub(MyInt): MyInt
    sub(Int): MyInt   
    mult(MyInt): MyInt
    mult(Int): MyInt
    div(MyInt): MyInt
    div(Int): MyInt
 
  Imprimir o resultado de 1 add 2 mult 3, com e sem os parenteses
*/

//Task: Part II:
/**
    criar outros metodos com os operadores tradicionais (*, -, /, +)
    verificar o comportamento da mesma expressão com e sem parenteses. 
    Por que isso acontece?
    Verificar o mesmo comportamento com Int 

  Repetir com métodos terminados com _:  (sublinhado e dois-pontos)
*/

//Task: Part III
/**
 	Usar implicits e trabalhar com inteiros diretamente ao invés do MyInt (nos métodos add, sub, mult, div)
*/


object HelloWorldSolved extends App {
	implicit def intToMyInt(int: Int): MyInt = new MyInt(int)
	implicit def intToMyInt2(int: MyInt) = int.integer

  val one = new MyInt(1)
  val two = new MyInt(2)
  val three = new MyInt(3)
  
  println(one.add(two).mult(three))
  println(one add two mult three)
  
  println(one.+(two).*(three))
  println(one + two * three)
  
  println(1.+(2).*(3))
  println(1 + 2 * 3)
  
  println(one + 2)
  println(1 + two)
 
  println(one.+:(two).*:(three))
  println(one +: two *: three)

  println(one.add_:(two).mult_:(three))
  println(one add_: two mult_: three)
  
}


class MyInt(int: Int) {

  val integer: Int = int
  
  def add(other: MyInt) = new MyInt(int + other.integer)
  def sub(other: MyInt) = new MyInt(int - other.integer)
  def mult(other: MyInt) = new MyInt(int * other.integer)
  def div(other: MyInt) = new MyInt(int / other.integer)

  def add_:(other: MyInt) = new MyInt(int + other.integer)
  def sub_:(other: MyInt) = new MyInt(int - other.integer)
  def mult_:(other: MyInt) = new MyInt(int * other.integer)
  def div_:(other: MyInt) = new MyInt(int / other.integer)

//  def add(other: Int) = new MyInt(int + other)
//  def sub(other: Int) = new MyInt(int - other)
//  def mult(other: Int) = new MyInt(int * other)
//  def div(other: Int) = new MyInt(int / other)

  def +(other: MyInt) = new MyInt(int + other.integer)
  def -(other: MyInt) = new MyInt(int - other.integer)
  def *(other: MyInt) = new MyInt(int * other.integer)
  def /(other: MyInt) = new MyInt(int / other.integer)

  def +:(other: MyInt) = new MyInt(int + other.integer)
  def -:(other: MyInt) = new MyInt(int - other.integer)
  def *:(other: MyInt) = new MyInt(int * other.integer)
  def /:(other: MyInt) = new MyInt(int / other.integer)

  
  override def toString() = integer.toString()
}

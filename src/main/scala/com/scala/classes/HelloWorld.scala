package com.scala.classes


class HelloWorld(param: Int = 42, param2:Int = 43) {
  
	def mult(p1: Int) = {
	  p1
	}
}



object Test extends App {
  new HelloWorld(param2 = 11)  

  def retornaTupla: (Int, String, Int) = (42, "Mensagem", 32)
  val (x,y,z) = retornaTupla
  
  println(retornaTupla)
  println(y)
  
}

 
//TODO: proximas aulas
//TODO: verificar os resultados obtidos do exercício anterior (parte 2) e explicar a precedência de operadores


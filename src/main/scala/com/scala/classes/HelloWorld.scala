package com.scala.classes


class HelloWorld(param: Int) {
  
	val x = { println("TESTE"); 10 }
		
	def mult(p1: Int) = {
	  p1
	}

	
}

object Test extends App {
  
  def x = { println("TESTE2"); 10 }
  
  val hw = new HelloWorld(42)
  val hw2 = new HelloWorld(423)

  val y = x
  
  println(x)
  println(x)

  
}

 
//TODO: proximas aulas
//TODO: verificar os resultados obtidos do exercício anterior (parte 2) e explicar a precedência de operadores
//TODO: mostrar um exemplo sem o extends APP
//TODO: repassar a questao do cache de def X val

//TODO: Data Structures: Lists and Maps
//TODO: Flow Control: if, for, map, flatMap, forEach, fold, Pattern Matching (principles), recursion and tail recursio
//TODO: Case Class
//TODO: val e var nos parametros
//TODO: Companion Objects
//TODO: More Pattern Matching 
//TODO: apply method
//TODO: Optional (Some, None)
//TODO: partial function

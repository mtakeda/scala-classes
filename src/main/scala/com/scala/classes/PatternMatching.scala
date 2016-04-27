package com.scala.classes


case class Pessoa(nome: String, sobrenome: String)


object PatternMatching extends App {
  
  val fulano = Pessoa("Fulano", "Tal")
  val tal = Pessoa("Fulano", "Tal")
  
  println(
    fulano match {
      case Pessoa(nome,_) if nome.startsWith("F")    => "Starts with F" 
      case Pessoa("Fulano",_) => "Fulano"
      case Pessoa(_,_)        => "Pessoa"
      case `tal`              => "Tal"
      case _                  => "wherever"
    }
  )
  
}


/*
- Exercício (antes de mostrar case class e patter matching)
	- criar uma classe casa que receba dois atributos: rua: String, número: Int
	- fazer um metodo que receba duas casas e retorne "Mesmo Endereço" se elas tiverem o mesmo endereço (rua e número) ou "Diferentes" em caso contrário
	- incrementar esse método para retornar "Mesma Rua" se ela tiver apenas a rua igual
	- incrementar esse método para retornar "Mesmo número" se ela tiver apenas a rua igual
	- incrementar esse método para retornar "Rua X, Número 42" se a rua da primeira casa for "Rua X" e o número for 42
	- incrementar esse método para retornar "Rua X, número qualquer" se a rua da primeira casa for "Rua X"
	- incrementar esse método para retornar "Rua X, número ${Y}" se a rua da primeira casa for "Rua X" e o número não for 42
	- incrementar esse método para retornar "Começa com X" se a rua da primeira casa começar com "X"
	- incrementar esse método para retornar "Número maior que 42" se o número da primeira for maior que 42
	- incrementar esse método para retornar "Começa com X e é maior que 42" se a rua da primeira casa começar com "X" e o número for igual a 42 
	

- Tuplas
- Case class (compará-la com um pojo)
- Pattern Matching
	- caso simples
	- matching com case class
	- matching com tuplas
	- matching com guardas 
 
 
 - Exercício:
 	- repetir o exercício, usando case class e pattern matching
*/

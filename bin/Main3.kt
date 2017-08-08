
fun main(args : Array<String>){
	var a1 = Human()	
	a1.name = "Syauqi"
	a1.show()
	
	var a2 = Human()
	a2.name = "Rahmat"
	a2.show()
	
	var a3 = a1.plus(a2)
	a3.show()
	
	//call factorial function
	println("factorial 5 : "+factorial(5))
	
}

fun Human.plus(a : Human) : Human {
	var newHuman = Human()
	newHuman.name = this.name + " " + a.name
	
	return newHuman
}


/* jika menggunakan infix function pemanggilannya bisa : var a3 = a1 plus a2
infix fun Human.plus(a : Human) : Human {
	var newHuman = Human()
	newHuman.name = this.name + " " + a.name
	
	return newHuman
} */

/* jika menggunakan operator overloading(operator infix function) pemanggilannya bisa : var a3 = a1 + a2
operator infix fun Human.plus(a : Human) : Human {
	var newHuman = Human()
	newHuman.name = this.name + " " + a.name
	
	return newHuman
} */

//rekursif function
fun factorial(num : Int) : Int {
	if(num == 0)
		return 1
	else
		return num * factorial(num-1)
	
} 

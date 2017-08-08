//to change class name when call this class from java
@file:JvmName("MainKotlin")import kotlin.jvm.JvmOverloads

fun main(args : Array<String>) {
	var result=add(13,10)
	
	println(result)
	
	result = max(10,13)
	
	println(result)
	
	result = calAmount(100,0.03)
	println(result)
	result = calAmount(a=100)
	println(result)
	
	//string to integer
	var str : String = "4"
	// using java method --> var num : Int = Integer.parseInt(str)
	var num : Int = str.toInt();
	num++
	println(num);
	
	
	//try expression
	str = "4a"
	var number : Int = try {
		str.toInt()
	} catch(e : NumberFormatException) {
		-1
	}
	
	number++
	
	println(number)
	
}

fun add(a : Int, b : Int) = a+b

fun max(a : Int, b : Int) = if(a>b) a else b

@JvmOverloads
fun calAmount(a : Int, disc : Double = 0.04) : Int = (a+a*disc).toInt()
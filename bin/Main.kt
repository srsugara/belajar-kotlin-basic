import java.util.TreeMap

fun main(args: Array<String>) {
	println("Hello World")
	var human = Human()
	var num1 : Int = 10
	var num2 : Int = 13
	var result : Int = 0
	var str1 : String = "Syauqi"
	var str2 : String = "syauqi"
	
	human.name="Syauqi"
			
	println("Name is : "+human.name)
	println("Name is : ${human.name}")
	
	println("Addition $num1 and $num2 is ${num1 + num2}")
	
	//if else 1
//	if(num1 > num2)
//		result = num1
//	else
//		result = num2
	
	//if else 2	
	result = if(num1 > num2)
		num1
	else
		num2

	println(result)
	
	//string comparison
	if(str1.equals(str2))
		println("Same")
	else
		println("Not same")
	
	
	if(str1 == str2)
		println("Same")
	else
		println("Not same")
	
	//ignore case sensitive
	if(str1.equals(str2, true))
		println("Same")
	else
		println("Not same")
	
	//when condition
	when(num2) {
		1 -> println("satu")
		2 -> println("dua")
		13 -> println("tiga belas")
		else -> println("tidak ada nomor yang sesuai")
	}
	
	var str = when(num2) {
		1 -> "satu"
		2 -> "dua"
		13 -> "tiga belas"
		else -> "tidak ada nomor yang sesuai"
	}
	
	println("String is $str")
	
//	var nums = 1..16
//	var nums = 16 downTo 1	
	var nums = 1 until 16
	
//	for(a in nums step 2)
//		if(a!=5)
//			println(a)
	
	for(a in nums.reversed())
		println(a)
	
	
	println("List example")
	var listNum = listOf(1,2,3,4)
	for((i,e) in listNum.withIndex())
		println("index $i : value $e")
	
	println("Map example")
	var listMap = TreeMap<String, Int>()
	listMap["Syauqi"] = 21
	listMap["Hanum"] = 20
	
	for ((name,age) in listMap)
		println("Nama : $name , Umur : $age")
	
}
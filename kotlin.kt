fun main(args: Array<String>) {
    println(multiply(20,10))
}

fun multiply(n1:Int = 0,n2:Int = 0):Int {
    var total = 0;
         
    return if (n1 > 0 ){
      
         for(i in 1..n1)
         	total += n2
         
         return total 
     } else {
         val n3 = -n1
         
         for(i in 1..n3)
         	total += n2

         return - total
     }
}
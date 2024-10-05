fun main(){
    println("Введите первое число")
    val num1 = readLine()!!.toInt()
    println("Введите второе число")
    val num2 = readLine()!!.toInt()
    println("Введите третье число")
    val num3 = readLine()!!.toInt()
    val res = LCMres(num1, num2, num3)
    println("Наименьшее общее кратное равно $res")


}
//вычисление наибольшего общего делителя
fun evk(a:Int, b:Int):Int {
    if (b == 0) {
        return a
    } else {
       return evk(b, a % b)
    }
}
//вычисление наименьшего кратного числа от двух чисел
fun lcm(a:Int, b:Int):Int {
    return a*b/evk(a,b)
}
fun LCMres(a :Int, b:Int,c:Int):Int {
    return lcm(a, lcm(b,c))
}

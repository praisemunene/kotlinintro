fun main(args: Array<String>) {
    var name:String = "nesh"
    var age:Int = 100
    println("Hello "+name+",you are "+age+" years old")
    println("Hello $name,you are $age years old")
    var pi = 3.142
    var radius = 14
    var area = pi * radius *radius
    println("your area is $area")

//    calculate interest borrowed
    var p = 1000
    var r = 10
    var t = 5
    var interest = (p * r * t) / 100
    println(interest)
}

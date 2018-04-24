
import com.wcang.kotlindemo.JavaPerson;
import java.io.BufferedReader
import java.io.StringReader

fun simpleFunction(aString: String) = println(aString)

fun convertToNumber(reader: BufferedReader) = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        null
    }


fun testClassType() {
    val a = setOf(1, 'a', 'b', "Something")
    println(a)
}


fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello $name")

    var aString: String
    aString = "something"

    when (aString) {
        "something" -> println("it's something")
        else -> {
            println(aString)
        }
    }

    val aNum = 2

    when (aNum) {
        in 1..2 -> println("1 to 2")
        in 2..5 -> println("2 to 5")
    }

    for (item in 1.rangeTo(10).step(2))
        println("$item")

    simpleFunction("How do you do?")
    /* kotlin checks for null value during compile time
    var uninitializedString: String
    simpleFunction(uninitializedString)
    */
    val initLater: String
    initLater = "something"
    simpleFunction(initLater)

    val person = JavaPerson("Ang", 38)
    println("${person.name}'s age is ${person.age} ")
    person.age = 39
    println("Now his age is ${person.age}")
    println("${person}")
    testSmart()

    println(convertToNumber(BufferedReader(StringReader("Not a number"))))

    println(convertToNumber(BufferedReader(StringReader("123"))))
    testClassType()
}
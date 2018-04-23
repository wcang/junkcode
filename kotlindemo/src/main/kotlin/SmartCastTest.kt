import jdk.nashorn.internal.objects.Global.eval

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun testSmart() {
    println(eval(Sum(
            Sum(Num(1), Num(2))
            , Num(4))))
}

fun eval(e : Expr): Int {
    if (e is Num) {
        return e.value;
    }
    else if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    else {
        throw Exception("Invalid expression ${e}")
    }

}

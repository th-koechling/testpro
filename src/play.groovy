/**
 * Created by tito on 30.11.16.
 *
 */

def array = [2, 4, 1, 6, 8, 2, 1, 9]

array.each { print "${it} blah " }
String hi = "hi!!"
String out = sprintf('\n%1$s\n', hi)

def fact (num) {
    if (num <= 1) {
        return num
    }
    else {
        return num * fact(num - 1)
    }
}

println out
println fact(4)

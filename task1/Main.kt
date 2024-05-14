package task1

// Решение 1-ого задания
fun task1(arr: Array<Int>): Int? {
    // wasMet[i - 1] = true <=> число i было встречено в массиве arr
    val wasMet = Array(100) { false }

    for (number in arr) {
        if (wasMet[number - 1]) {
            return number
        } else {
            wasMet[number - 1] = true
        }
    }

    return null
}

fun main() {
    // 10
    println(task1(arrayOf(10, 2, 3, 4, 10, 5)))

    // 34
    println(task1(arrayOf(55, 66, 24, 57, 34, 12, 54, 65, 87, 45, 34, 67, 58)))

    // 1
    println(task1(Array(100) { i -> i + 1 } + 1))
}

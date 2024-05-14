package task2

// Решение 2-ого задания
fun<T> task2(arr: Array<T>) {
    // Словарь: ключ - элемент массива, значение - частота встречаемости в массиве
    val count: MutableMap<T, Int> = mutableMapOf()

    for (elem in arr) {
        count[elem] = count.getOrDefault(elem, 0) + 1
    }

    for (pair in count) {
        println("${pair.key}: ${pair.value}")
    }
}

fun main() {
    // 1: 1
    // 2: 3
    // 3: 3
    // 4: 2
    // 6: 2
    // 7: 3
    // 8: 1
    // 9: 1
    task2(arrayOf(1, 7, 3, 6, 4, 9, 4, 2, 7, 2, 6, 3, 7, 3, 8, 2))

    // lol: 2
    // hello: 2
    // hi: 1
    // 123: 2
    // world: 1
    task2(arrayOf("lol", "hello", "hi", "123", "hello", "123", "lol", "world"))
}

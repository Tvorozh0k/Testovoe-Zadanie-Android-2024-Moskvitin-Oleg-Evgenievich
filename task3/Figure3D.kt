package task3

/**
 * Интерфейс трёхмерная фигура
 */
interface Figure3D {
    /**
     * Функция вычисления объема фигуры
     */
    fun volume(): Double

    /**
     * Функция вычисления площади основания фигуры
     */
    fun baseArea(): Double
}

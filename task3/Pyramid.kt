package task3

/**
 * Абстрактный класс пирамида
 *
 * @param height Высота пирамиды
 */
abstract class Pyramid(private val height: Double): Figure3D {
    /**
     * Функция вычисления объема пирамиды
     */
    override fun volume(): Double {
        return height * baseArea() / 3.0
    }
}
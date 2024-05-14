package task3

/**
 * Абстрактный класс призма
 *
 * @param height Высота призмы
 */
abstract class Prism(private val height: Double) : Figure3D {
    /**
     * Функция вычисления объема призмы
     */
    override fun volume(): Double {
        return height * baseArea()
    }
}
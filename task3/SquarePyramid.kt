package task3

/**
 * Класс квадратная пирамида
 *
 * @param height Высота квадратной пирамиды
 * @param side Сторона основания квадратной пирамиды
 */
class SquarePyramid(height: Double, private val side: Double) : Pyramid(height) {
    /**
     * Площадь основания квадратной пирамиды
     */
    override fun baseArea(): Double {
        return side * side
    }
}
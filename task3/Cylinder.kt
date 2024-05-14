package task3

/**
 * Класс цилиндр
 *
 * @param height Высота цилиндра
 * @param radius Радиус основания цилиндра
 */
class Cylinder(height: Double, private val radius: Double) : Prism(height) {
    /**
     * Площадь основания цилиндра
     */
    override fun baseArea(): Double {
        return Math.PI * radius * radius
    }
}
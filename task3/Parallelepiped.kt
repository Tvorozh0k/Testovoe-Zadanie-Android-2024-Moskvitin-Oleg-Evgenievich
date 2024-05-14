package task3

/**
 * Класс параллелепипед
 *
 * @param length Длина параллелепипеда
 * @param width Ширина параллелепипеда
 * @param height Высота параллелепипеда
 */
class Parallelepiped(height: Double, private val length: Double, private val width: Double) : Prism(height) {
    /**
     * Площадь основания параллелепипеда
     */
    override fun baseArea(): Double {
        return length * width
    }
}
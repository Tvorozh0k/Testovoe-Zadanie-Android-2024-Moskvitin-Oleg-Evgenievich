package task3

import kotlin.math.sqrt

/**
 * Класс тетраэдр
 *
 * @param height Высота тетраэдра
 * @param a 1-ая сторона треугольника
 * @param b 2-ая сторона треугольника
 * @param c 3-ья сторона треугольника
 */
class Tetrahedron(height: Double, private val a: Double, private val b: Double, private val c: Double) :
    Pyramid(height) {
    /**
     * Площадь основания тетраэдра
     */
    override fun baseArea(): Double {
        val p = (a + b + c) / 2.0
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}
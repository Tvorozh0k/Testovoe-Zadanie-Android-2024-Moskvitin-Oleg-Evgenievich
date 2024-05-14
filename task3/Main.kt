package task3

fun main() {
    /*
    1. Пирамида: объем = 125.66370614359172, площадь основания = 12.566370614359172
    2. Параллелепипед: объем = 60.0, площадь основания = 6.0
    3. Тетраэдр: объем = 18.0, площадь основания = 6.0
    4. Квадратная пирамида: объем = 83.33333333333333, площадь основания = 25.0
     */

    val cylinder = Cylinder(10.0, 2.0)
    println("1. Пирамида: объем = ${cylinder.volume()}, площадь основания = ${cylinder.baseArea()}")

    val parallelepiped = Parallelepiped(10.0, 2.0, 3.0)
    println("2. Параллелепипед: объем = ${parallelepiped.volume()}, площадь основания = ${parallelepiped.baseArea()}")

    val tetrahedron = Tetrahedron(9.0, 3.0, 4.0, 5.0)
    println("3. Тетраэдр: объем = ${tetrahedron.volume()}, площадь основания = ${tetrahedron.baseArea()}")

    val squarePyramid = SquarePyramid(10.0, 5.0)
    println("4. Квадратная пирамида: объем = ${squarePyramid.volume()}, площадь основания = ${squarePyramid.baseArea()}")
}
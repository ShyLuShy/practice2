fun main(args: Array<String>) {

    // Задача 1.
    val Age1 = 42
    val Age2 = 21

    // Задача 2. | Константа avg1 является типом данных Int поэтому дробную часть числа она просто отбрасывает.
    val Avg1 = (42 + 21) / 2

    /* Задача 3. | Теперь правильно потому, что мы преобразовали тип данных в вещественный.

    val Age1* = 42
    val Age2 = 21
    val Avg1 = ((42 + 21) / 2).toDouble()

    */

    // Задача 4.
    val FirstName = "Макс"
    val LastName = "Ефименко"

    // Задача 5.
    val FullName = "${FirstName} ${LastName}"

    // Задача 6.
    val myDetails: String = "Привет, меня зовут ${FullName}."

    // Задача 7.
    val Triple = Triple(11,11,11)

    // Задача 8.
    val Day = Triple.first
    val Month = Triple.second
    val Year = Triple.third

    // Задача 9.
    val (_, month, year) = Triple
    println(Triple)

    // Задача 10.
    val newPair = Pair(4,year)
    println(newPair)
}
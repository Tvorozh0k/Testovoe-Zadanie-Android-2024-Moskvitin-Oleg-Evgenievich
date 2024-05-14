package task4

/**
 * Класс подписчик
 *
 * @param id Уникальный номер подписчика
 * @param lastName Фамилия
 * @param firstName Имя
 * @param patronymic Отчество
 */
class Subscriber(
    private val id: Int,
    private var lastName: String,
    private var firstName: String,
    private var patronymic: String?,
) {
    /**
     * Список уведомлений, которые пришли подписчику
     */
    private val notifications: MutableList<String> = mutableListOf()

    /**
     * Новое уведомление
     */
    fun update(message: String) {
        notifications.add(message)
    }

    /**
     * Отображаем последние новости
     */
    fun showNotifications() {
        println("Здравствуйте, $lastName $firstName $patronymic!\n")

        println("Последние новости:")
        for (i in 0..<notifications.size) {
            println("${i + 1}. ${notifications[i]}")
        }

        println()
    }

    fun getId(): Int {
        return id
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun getLastName(): String {
        return lastName
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun getFirstName(): String {
        return firstName
    }

    fun setPatronymic(patronymic: String?) {
        this.patronymic = patronymic
    }

    fun getPatronymic(): String? {
        return patronymic
    }
}
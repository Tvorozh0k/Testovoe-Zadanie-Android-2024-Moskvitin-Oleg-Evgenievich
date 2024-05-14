package task4

/**
 * Класс новость
 *
 * @param id Уникальный номер новости
 * @param title Заголовок новости
 * @param body Содержимое новости
 */
class News(private val id: Int, private var title: String, private var body: String) {
    fun getId(): Int {
        return id
    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getBody(): String {
        return body
    }

    fun setBody(body: String) {
        this.body = body
    }
}
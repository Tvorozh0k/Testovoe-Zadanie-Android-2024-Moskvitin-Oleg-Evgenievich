package task4

import java.lang.Exception

/**
 * Класс NewsPoster - издатель
 */
class NewsPoster {
    /**
     * Список подписчиков
     */
    private val subscribers: MutableList<Subscriber> = mutableListOf()

    /**
     * Список новостей
     */
    private val newsList: MutableList<News> = mutableListOf()

    /**
     * Поиск новости по уникальному номеру
     */
    private fun findNewsById(id: Int) : News? {
        return newsList.find { news -> news.getId() == id }
    }

    /**
     * Добавление новости
     */
    @Throws(Exception::class)
    fun addNews(news: News) {
        // Если эта новость еще не опубликована
        if (findNewsById(news.getId()) == null) {
            newsList.add(news)

            // Оповещаем подписчиков о новой новости
            notify(news.getTitle())
        } else {
            throw Exception("Данная новость уже была опубликована")
        }
    }

    /**
     * Оповещение всех подписчиков
     */
    fun notify(title: String) {
        for (subscriber in subscribers) {
            subscriber.update(title)
        }
    }

    /**
     * Поиск подписчика по его уникальному номеру
     */
    private fun findSubscriberById(id: Int): Subscriber? {
        return subscribers.find { subscriber -> subscriber.getId() == id }
    }

    /**
     * Добавление нового подписчика
     *
     * @param subscriber Новый подписчик
     */
    @Throws(Exception::class)
    fun addSubscriber(subscriber: Subscriber) {
        // Если подписчик еще не подписан
        if (findSubscriberById(subscriber.getId()) == null) {
            subscribers.add(subscriber)
        } else {
            throw Exception("Подписчик ${subscriber.getLastName()} ${subscriber.getFirstName()} ${subscriber.getPatronymic()} уже подписан")
        }
    }

    /**
     * Удаление подписчика
     *
     * @param subscriber Подписчик, который отписался
     */
    fun removeSubscriber(subscriber: Subscriber) {
        // Если подписчик подписан
        if (findSubscriberById(subscriber.getId()) != null) {
            subscribers.remove(subscriber)
        } else {
            throw Exception("Подписчик ${subscriber.getLastName()} ${subscriber.getFirstName()} ${subscriber.getPatronymic()} не подписан")
        }
    }


}
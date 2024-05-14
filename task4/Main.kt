package task4

fun main() {
    // Издатель
    val newsPoster = NewsPoster()

    // Новый подписчик
    val subscriber1 = Subscriber(1, "Иванов", "Иван", "Иванович")
    newsPoster.addSubscriber(subscriber1)

    // Пока ничего не пришло :(
    subscriber1.showNotifications()

    /*
    Здравствуйте, Иванов Иван Иванович!

    Последние новости:

     */

    // Новости
    val news1 = News(1, "Крокодилы умеют летать!", "К такому выводу пришли ученые из Марсианского университета...")
    val news2 = News(2, "Планета Нибиру: конец близок!", "К 2030 году планета Нибиру окажется возле Земли...")

    newsPoster.addNews(news1)
    newsPoster.addNews(news2)

    // Смотрим, что пришло
    subscriber1.showNotifications()

    /*
    Здравствуйте, Иванов Иван Иванович!

    Последние новости:
    1. Крокодилы умеют летать!
    2. Планета Нибиру: конец близок!

     */
}

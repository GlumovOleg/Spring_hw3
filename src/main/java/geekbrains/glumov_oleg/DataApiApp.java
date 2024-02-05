package geekbrains.glumov_oleg;

/**
 * Создать сервис "DataProcessingService".
 * Этот сервис должен принимать на вход список объектов типа User (с полями "name", "age", "email"),
 * и выполнять следующие операции: сортировка списка пользователей по возрасту,
 * фильтрация списка по заданному критерию (например, возраст больше 18), расчёт среднего возраста пользователей.
 */

/**
 * Создать два сервиса - "UserService" и "NotificationService".
 * UserService должен содержать метод createUser(String name, int age, String email),
 * который создает пользователя и возвращает его. NotificationService должен иметь метод notifyUser(User user),
 * который просто печатает сообщение о том, что пользователь был создан.
 * Ваша задача - использовать @Autowired в UserService для внедрения NotificationService
 * и вызвать метод notifyUser после создания нового пользователя.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DataApiApp {

    public static void main(String[] args) {

        SpringApplication.run(DataApiApp.class, args);

    }

}

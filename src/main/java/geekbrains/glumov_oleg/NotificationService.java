package geekbrains.glumov_oleg;


import geekbrains.glumov_oleg.UserApi.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("Новый пользователь создан: " + user.getName());
    }

}

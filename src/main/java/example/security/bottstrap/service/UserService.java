package example.security.bottstrap.service;

import example.security.bottstrap.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String login);

    User getUserById(long id);
}

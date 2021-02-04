package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Andrei", "Dik", (byte)18);
        service.saveUser("Ivan", "Kirk", (byte)23);
        service.saveUser("Alex", "Fork", (byte)53);
        service.saveUser("Dimitri", "Kraig", (byte)60);
        List<User> users = service.getAllUsers();
        System.out.println(users);
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}

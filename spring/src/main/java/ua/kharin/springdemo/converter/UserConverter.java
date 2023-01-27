package ua.kharin.springdemo.converter;

import ua.kharin.springdemo.controller.model.User;
import ua.kharin.springdemo.entity.UserEntity;

public class UserConverter {
    public static User fromEntity(UserEntity entity) {
        return new User(entity.getId(), entity.getFirstName(), entity.getLastName(), entity.getCity());
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getFirstName(), user.getLastName(), user.getCity());
    }
}

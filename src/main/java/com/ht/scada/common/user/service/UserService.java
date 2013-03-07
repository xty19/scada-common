package com.ht.scada.common.user.service;

import java.util.List;

import com.ht.scada.common.user.entity.User;
import com.ht.scada.common.user.entity.UserExtInfo;
import com.ht.scada.common.user.entity.UserRole;

public interface UserService {
    User getCurrentUser();

    void createUser(String username, String password);

    void addNewUser(User newUser);

    List<User> getAllUsers();

    User getUser(int userId);

    User getUserByUsername(String username);

    void deleteUser(int userId);

    void updateUser(User user);

    void createUserRole(String name, String description);

    void saveUserRole(UserRole userRole);

    UserRole getUserRoleByName(String name);

    void updateUserPassword(String password, int id);

    List<UserExtInfo> getAllUserExtInfo();

    List<UserRole> getAllUserRole();

    void saveUserExtInfo(UserExtInfo newUser);

    UserRole getUserRoleById(int id);

    UserExtInfo findUserExtInfoByUserID(int id);

    void deleteUserRole(int id);
    
    
}
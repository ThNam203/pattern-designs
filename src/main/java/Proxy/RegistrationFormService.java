package Proxy;

import java.util.ArrayList;
import java.util.List;

class RegistrationFormService implements RegistrationForm {
    private final List<String> registeredUsers = new ArrayList<>();

    @Override
    public String register(String userName) {
        registeredUsers.add(userName);
        return "User " + userName + " registered successfully!";
    }

    public int getRegisteredUserCount() {
        return registeredUsers.size();
    }
}
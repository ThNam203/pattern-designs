package Proxy;

public class Main {
    public static void main(String[] args) {
        RegistrationFormService formService = new RegistrationFormService();
        RegistrationFormProxy formProxy = new RegistrationFormProxy(formService, 5);

        String[] users = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace"};

        for (String user : users) {
            System.out.println(formProxy.register(user));
        }
    }
}
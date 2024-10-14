package Proxy;

class RegistrationFormProxy implements RegistrationForm {
    private final RegistrationFormService formService;
    private final int maxCapacity;

    public RegistrationFormProxy(RegistrationFormService formService, int maxCapacity) {
        this.formService = formService;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String register(String userName) {
        if (formService.getRegisteredUserCount() >= maxCapacity) {
            return "Sorry, registration is full. User " + userName + " cannot register.";
        }

        return formService.register(userName);
    }
}
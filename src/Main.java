public class Main {

    private static void clientValidator(Client client) {
        ClientValidator clientValidator = new ClientValidator();

        clientValidator.validateEmail(client);
        clientValidator.validateIP(client);
        System.out.println(clientValidator.validateUrl(client));
        clientValidator.validateAddress(client);
    }

    public static void main(String[] args) {
        Client client = new Client("a@inbox.ru", "127.0.0.1", "", "http://a.ru");

        clientValidator(client);
    }
}
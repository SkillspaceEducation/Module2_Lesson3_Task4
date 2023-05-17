public class ClientTest {

    private static void clientValidator(Client client) {
        ClientValidator clientValidator = new ClientValidator();

        clientValidator.validateEmail(client);
        clientValidator.validateIP(client);
        clientValidator.validateUrl(client);
        clientValidator.validateAddress(client);
    }

    public static void main(String[] args) {
        Client client = new Client("a1@inbox.ru", "127.0.0.1", "", "https://a.ru");

        clientValidator(client);


    }
}
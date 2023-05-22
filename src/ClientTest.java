public class ClientTest {

    private static void clientValidator(Client client) {
        ClientValidator clientValidator = new ClientValidator();

        clientValidator.validateEmail(client);
        clientValidator.validateIP(client);
        clientValidator.validateUrl(client);
        clientValidator.validateAddress(client);
    }

    public static void main(String[] args) {
        Client client = new Client(
                "tr.murtazin@yandex.ru", // адрес электронной почты
                "255.255.255.255",      // ip-адрес
                "",                     // адрес проживания
                "https://hr-vector.com/java/regulyarnye-vyrazheniya-primery");      // URL-адрес

        clientValidator(client);
    }
}
public class ClientTest {

    private static void clientValidator(Client client) {
        ClientValidator clientValidator = new ClientValidator();

        clientValidator.validateEmail(client);
        clientValidator.validateIP(client);
        clientValidator.validateUrl(client);
        clientValidator.validateAddress(client);
    }

    public static void main(String[] args) {
        Client client1 = new Client("Клиент 1",
                "tr.murtazin@yandex.ru", // адрес электронной почты
                "255.255.255.255",      // ip-адрес
                "   РФ, @!#г.Санкт-Петербург,     Ленинский проспект, 57/2",                     // адрес проживания
                "https://vk.com/im?sel=c46");      // URL-адрес
        System.out.println(client1.getAddress());
        clientValidator(client1);
        System.out.println(client1.getAddress());

    }
}
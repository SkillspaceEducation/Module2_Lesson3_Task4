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
                "tr.murtazin@yandex.ru",                                 // адрес электронной почты
                "255.255.255.255",                                             // ip-адрес
                "РФ, @!#г.Санкт-Петербург,     ул.Ленинский проспект, 57",   // адрес проживания
                "https://github.com/murtazintagir");                           // URL адрес
        clientValidator(client1);

        Client client2 = new Client("Клиент 2",
                "@.es",                                 // адрес электронной почты
                "727.0.0.255",                                             // ip-адрес
                "Испания, г.Барселона, ул.Майорка, 401",   // адрес проживания
                "https://sagradafamilia.org/en/?lang=");                           // URL адрес
        clientValidator(client2);

        Client client3 = new Client("Клиент 3",
                "vel_luk@.es",                                 // адрес электронной почты
                "127.0.0.255",                                             // ip-адрес
                "РФ, г.Велики Луки, ул.Пушкина, 3/",   // адрес проживания
                "");                           // URL адрес
        clientValidator(client3);
    }
}
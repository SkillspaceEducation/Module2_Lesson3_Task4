import java.util.regex.Pattern;

public class ClientValidator {
    public static void validateEmail(Client client) {
        boolean result;
        String regex = "[a-z0-9-_\\.]@.[a-z]{2,6}.ru";
        result = Pattern.matches(regex, client.getEmail());
        if (result) {
            System.out.println("Valide email");
        } else {
            System.out.println("Invalide email");
        }
    }

    public static void validateIP(Client client) {
        boolean result;
        String regex = "((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}";
        result = Pattern.matches(regex, client.getIp());
        if (result) {
            System.out.println("Valide ip");
        } else {
            System.out.println("Invalide ip");
        }
    }

    public static void validateUrl(Client client) {
        boolean result;
        String regex = ".*http://.*";
        result = Pattern.matches(regex, client.getUrl());
    }

    public static void validateAddress(Client client) {
        boolean result = false;
        client.getAddress();
    }
}

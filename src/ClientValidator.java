import java.util.regex.Pattern;

public class ClientValidator {
    boolean validateEmail(Client client) {
        boolean result = false;
        client.getEmail();
        return result;
    }

    boolean validateIP(Client client) {
        boolean result = false;
        client.getIp();
        return result;
    }

    boolean validateUrl(Client client) {
        String regex = ".*http://.*";
        return Pattern.matches(regex, client.getUrl());
    }

    boolean validateAddress(Client client) {
        boolean result = false;
        client.getAddress();
        return result;
    }
}

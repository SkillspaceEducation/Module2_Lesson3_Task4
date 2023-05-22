import java.util.regex.Pattern;

class ClientValidator {
    public void validateEmail(Client client) {
        boolean result;
        String regex = "^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2})*)*)$";
        result = Pattern.matches(regex, client.getEmail());
        if (result) {
            System.out.println("Valide email");
        } else {
            System.out.println("Invalide email");
        }
    }

    public void validateIP(Client client) {
        boolean result;
        String regex = "^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$";
        result = Pattern.matches(regex, client.getIp());
        if (result) {
            System.out.println("Valide ip");
        } else {
            System.out.println("Invalide ip");
        }
    }

    public void validateUrl(Client client) {
        boolean result;
        String regex = "^(http|https):/{2}[\\w]+(/{2}|\\.[a-z]+)$";
        result = Pattern.matches(regex, client.getUrl());
        if (result) {
            System.out.println("Valide url");
        } else {
            System.out.println("Invalide url");
        }
    }

    public void validateAddress(Client client) {
        boolean result = false;
        client.getAddress();
    }
}

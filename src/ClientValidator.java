import java.util.regex.Pattern;

class ClientValidator {
    public void validateEmail(Client client) {
        boolean result;
        String regex = "^([a-zA-Z]+[\\w.-]+@[a-zA-Z]+[\\w.-]+\\.(com|ru|net|org))$";
        result = Pattern.matches(regex, client.getEmail());
        if (result) {
            System.out.println("У клиента " + client.getName() + " адрес электронной почты корректен");
        } else {
            System.out.println("Адрес электронной почты некорректен");
        }
    }

    public void validateIP(Client client) {
        boolean result;
        String regex = "^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$";
        result = Pattern.matches(regex, client.getIp());
        if (result) {
            System.out.println("IP-адрес корректен");
        } else {
            System.out.println("IP-адрес некорректен");
        }
    }

    public void validateUrl(Client client) {
        boolean result;
        // https://vk.com/im?sel=c46
        String regex = "^((http|https):/{2})?(([a-zA-Z].)+|\\w+.)(com|ru|)/?\\w+/*$";//+(/{2}|\\.[a-z]+)$";
        result = Pattern.matches(regex, client.getUrl());
        if (result) {
            System.out.println("Адрес URL корректен");
        } else {
            System.out.println("Адрес URL некорректен");
        }
    }

    public void validateAddress(Client client) {
        boolean result;
        // ^(([А-Я][а-я]+( [А-Я][а-я]+)*)|[А-Я]{2,}), (г.[А-Я][а-я]+[ -][А-Я][а-я]*)$
        String regex = "^(([А-Я][а-я]+( [А-Я][а-я]+)*)|[А-Я]{2,}), (г.[А-Я][а-я]+[ -][А-Я][а-я]*)," +
                " ([ул.]?[А-Я]?[а-я]+[ -][А-Я]?[а-я]+), (\\d+(/\\d+)*)$";
        String address = client.getAddress().replaceAll("[%$@<>?*()^#!]+", " ")
                .replaceAll(" {2,}", " ")
                .trim();
        result = Pattern.matches(regex, address);
        if (result) {
            System.out.println("Адрес проживания корректен");
            client.setAddress(address);
        } else {
            System.out.println("Адрес проживания некорректен");
        }
    }
}

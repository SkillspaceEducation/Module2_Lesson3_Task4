import java.util.regex.Pattern;

class ClientValidator {
    public void validateEmail(Client client) {
        boolean result;
        String regex1 = "^[a-zA-Z]+[\\w.-]+";
        String regex2 = "@[a-zA-Z]+[\\w.-]+.(com|ru|net|org)$";
        result = Pattern.matches(regex1 + regex2, client.getEmail());
        if (result) {
            System.out.println("У пользователя " + client.getName() + " адрес электронной почты корректен");
        } else {
            System.out.println("У пользователя " + client.getName() + " адрес электронной почты некорректен");
        }
    }

    public void validateIP(Client client) {
        boolean result;
        String regex1 = "^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}";
        String regex2 = "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$";
        result = Pattern.matches(regex1 + regex2, client.getIp());
        if (result) {
            System.out.println("У пользователя " + client.getName() + " IP-адрес корректен");
        } else {
            System.out.println("У пользователя " + client.getName() + " IP-адрес некорректен");
        }
    }

    public void validateUrl(Client client) {
        boolean result;
        String regex1 = "^((http|https):/{2})?";
        String regex2 = "(([\\w-]+[.])+([a-z]{2,6})/?|" +
                "w{3}.([\\w-]+[.])+[a-z]{2,6}/?)";
        String regex3 = "(([\\w-.]+/?)+|(([?]?[\\w-=.]+)/?)+)$";
        result = Pattern.matches(regex1 + regex2 + regex3, client.getUrl());
        if (result) {
            System.out.println("У пользователя " + client.getName() + " адрес URL корректен");
        } else {
            System.out.println("У пользователя " + client.getName() + " адрес URL некорректен");
        }
    }

    public void validateAddress(Client client) {
        boolean result;
        String regex1 = "^(([А-Я][а-я]+( [А-Я][а-я]+)*)|[А-Я]{2,}),"; // РВ для проверки страны
        String regex2 = " (г.[А-Я][а-я]+([ -][А-Я][а-я]+)*),";           // РВ для проверки города
        String regex3 = " ((ул.)?[А-Я]?[а-я]+([ -][А-Я]?[а-я]+)*), (\\d+(/\\d+)*)$"; // РВ для проверки улицы и дома
        // Удаляем спец. символы и лишние пробелы
        String address = client.getAddress().replaceAll("[%$@<>?*()^#!{}]+", " ")
                .replaceAll(" {2,}", " ")
                .trim();
        result = Pattern.matches(regex1 + regex2 + regex3, address);
        if (result) {
            System.out.println("У пользователя " + client.getName() + " адрес проживания корректен");
            client.setAddress(address); // записываем адрес после удаления лишних символов
        } else {
            System.out.println("У пользователя " + client.getName() + " адрес проживания некорректен");
        }
    }
}

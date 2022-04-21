import java.util.Arrays;
import java.util.Objects;

public class Hw8 {
    //////////////////////////////////////////////////////////////////////////// Задание 1
    public static void dz1() {
        int age = 2022; /// выбранный год;

        if (yesNo(age)) {
            consoll(age, true);
        } else {
            consoll(age, false);
        }
    }

    public static boolean yesNo(int age) {
        boolean age1 = false;
        if ((age % 4 == 0 && age % 100 != 0 || age % 400 == 0)) {
            age1 = true;
        } else {
            age1 = false;
        }
        return age1;
    }

    public static void consoll(int age, boolean yyy) {
        if (yyy) {
            System.out.println(age + " — високосный год.");
        } else {
            System.out.println(age + " —  не високосный год.");
        }
    }

    //////////////////////////////////////////////////////////////////////////// Задание 2
    public static void dz2() {
        //int currentYear = LocalDate.now().getYear();
        int clientOS = 1; // 0 — iOS, 1 — Android;
        int clientDeviceYear = 2013;

        clientAge(clientOS, clientDeviceYear);
    }

    public static void clientAge(int clientOS, int clientDeviceYear) {
        boolean ioUp = clientOS == 0 && clientDeviceYear >= 2015;
        boolean ioDown = clientOS == 0 && clientDeviceYear < 2015;
        boolean adUp = clientOS == 1 && clientDeviceYear >= 2015;
        boolean adDown = clientOS == 1 && clientDeviceYear < 2015;
        if (ioUp) {
            System.out.println("Установите версию Pro приложения для iOS по ссылке:____");
        } else if (ioDown) {
            System.out.println("Установите версию Lite приложения для iOS по ссылке:____");
        } else if (adUp) {
            System.out.println("Установите версию Pro приложения для Android по ссылке:____");
        } else if (adDown)
            System.out.println("Установите версию Lite приложения для Android по ссылке:____");
    }

    //////////////////////////////////////////////////////////////////////////// Задание 3
    public static void dz3() {

        float deliveryDistance = 100f;
        int day = dayDist(deliveryDistance);

        //dayDist(deliveryDistance);
        if (day == 1) {
            System.out.println("Доставим Вашу карту через " + day + " день!");
        } else if (day == 2) {
            System.out.println("Доставим Вашу карту через " + day + " дня!");
        } else if (day == 3) {
            System.out.println("Доставим Вашу карту через " + day + " дня!");
        } else
            System.out.println("Разве карта уже не у Вас ?");
    }

    public static int dayDist(float distance) {
        int day = 0;
        if (distance < 20 && distance != 0) {
            day = 1;
        } else if (distance >= 20 && distance < 60) {
            day = 2;
        } else if (distance >= 60 && distance <= 100) {
            day = 3;
        }
        return day;
    }
    //////////////////////////////////////////////////////////////////////////// Задание 4 (через массив символов)
    public static void dz4() {

        String text1 = "qwertghj";
        textDoble1(text1);
    }
    public static void textDoble1(String text1) {
        char[] textNew = text1.toCharArray();
        boolean error =  true;
        char simbol = 0;

        for (int i = 0; i < textNew.length-1; i++) {
            if (textNew[i] == textNew[i+1]){
                error = true;
                simbol = textNew[i];
                break;
            }else
                error = false;
        }
        if (error){
            System.out.println("Найден дубликат : " + simbol);
        }else
            System.out.println("Дубликат в " + text1 + " не обнаружен!");

    }
//////////////////////////////////////////////////////////////////////////// Задание 4_1 (через массив строк и bool)
    public static void dz4_1 () {

        String text = "qwertrtytuyt";
        if (textConvert(text)) {
            System.out.println("Дубль не обнаружен! Строка имеет значение:" + text);
        }
    }
    public static boolean textConvert (String text){
            boolean a = true;
            String[] words = text.split("");
            for (int i = 0; i != words.length - 1; i++) {
                if (Objects.equals(words[i], words[i + 1])) {
                    System.out.println("В строке найдел дубль: символ " + "\"" + words[i] + "\"");
                    a = false;
                    break;
                }
            }
            return a;
     }
//////////////////////////////////////////////////////////////////////////// Задание 5
    public static void dz5 () {
        int[] arr = {3, 2, 1, 6, 5, 7, 9, 0};
        arrRevers(arr);
    }
    public static void arrRevers(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            int a = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}















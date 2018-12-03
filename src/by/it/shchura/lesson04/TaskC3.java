package by.it.shchura.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            DigitsInWords x = DigitsInWords.byValue(i);
            for (int j = 1; j <= 10; j++) {
                DigitsInWords y = DigitsInWords.byValue(j);
                System.out.println(x.toString().toLowerCase().replace("_", " ")
                        + " умножить на " + y.toString().toLowerCase().replace("_", " ")
                        + " равно " + DigitsInWords.byValue(
                                x.getValue() * y.getValue()).toString().toLowerCase().replace("_", " "));
            }
        }
    }
}

enum DigitsInWords {

    ОДИН(1), ДВА(2), ТРИ(3), ЧЕТЫРЕ(4), ПЯТЬ(5), ШЕСТЬ(6), СЕМЬ(7), ВОСЕМЬ(8), ДЕВЯТЬ(9), ДЕСЯТЬ(10),
    ДВЕНАДЦАТЬ(12), ЧЕТЫРНАДЦАТЬ(14), ПЯТНАДЦАТЬ(15), ШЕСТНАДЦАТЬ(16), ВОСЕМНАДЦАТЬ(18), ДВАДЦАТЬ(20),
    ДВАДЦАТЬ_ОДИН(21), ДВАДЦАТЬ_ЧЕТЫРЕ(24), ДВАДЦАТЬ_ПЯТЬ(25), ДВАДЦАТЬ_СЕМЬ(27), ДВАДЦАТЬ_ВОСЕМЬ(28),
    ТРИДЦАТЬ(30), ТРИДЦАТЬ_ДВА(32), ТРИДЦАТЬ_ПЯТЬ(35), ТРИДЦАТЬ_ШЕСТЬ(36), СОРОК(40),
    СОРОК_ДВА(42), СОРОК_ПЯТЬ(45), СОРОК_ВОСЕМЬ(48), СОРОК_ДЕВЯТЬ(49),
    ПЯТЬДЕСЯТ(50), ПЯТЬДЕСЯТ_ЧЕТЫРЕ(54), ПЯТЬДЕСЯТ_ШЕСТЬ(56), ШЕСТЬДЕСЯТ(60), ШЕСТЬДЕСЯТ_ТРИ(63), ШЕСТЬДЕСЯТ_ЧЕТЫРЕ(64),
    СЕМЬДЕСЯТ(70),СЕМЬДЕСЯТ_ДВА(72), ВОСЕМЬДЕСЯТ(80), ВОСЕМЬДЕСЯТ_ОДИН(81), ДЕВЯНОСТО(90), СТО(100);

    private int value;

    DigitsInWords(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public static DigitsInWords byValue(int v) {
        switch (v) {
            case 1:
                return ОДИН;
            case 2:
                return ДВА;
            case 3:
                return ТРИ;
            case 4:
                return ЧЕТЫРЕ;
            case 5:
                return ПЯТЬ;
            case 6:
                return ШЕСТЬ;
            case 7:
                return СЕМЬ;
            case 8:
                return ВОСЕМЬ;
            case 9:
                return ДЕВЯТЬ;
            case 10:
                return ДЕСЯТЬ;
            case 12:
                return ДВЕНАДЦАТЬ;
            case 14:
                return ЧЕТЫРНАДЦАТЬ;
            case 15:
                return ПЯТНАДЦАТЬ;
            case 16:
                return ШЕСТНАДЦАТЬ;
            case 18:
                return ВОСЕМНАДЦАТЬ;
            case 20:
                return ДВАДЦАТЬ;
            case 21:
                return ДВАДЦАТЬ_ОДИН;
            case 24:
                return ДВАДЦАТЬ_ЧЕТЫРЕ;
            case 25:
                return ДВАДЦАТЬ_ПЯТЬ;
            case 27:
                return ДВАДЦАТЬ_СЕМЬ;
            case 28:
                return ДВАДЦАТЬ_ВОСЕМЬ;
            case 30:
                return ТРИДЦАТЬ;
            case 32:
                return ТРИДЦАТЬ_ДВА;
            case 35:
                return ТРИДЦАТЬ_ПЯТЬ;
            case 36:
                return ТРИДЦАТЬ_ШЕСТЬ;
            case 40:
                return СОРОК;
            case 42:
                return СОРОК_ДВА;
            case 45:
                return СОРОК_ПЯТЬ;
            case 48:
                return СОРОК_ВОСЕМЬ;
            case 49:
                return СОРОК_ДЕВЯТЬ;
            case 50:
                return ПЯТЬДЕСЯТ;
            case 54:
                return ПЯТЬДЕСЯТ_ЧЕТЫРЕ;
            case 56:
                return ПЯТЬДЕСЯТ_ШЕСТЬ;
            case 60:
                return ШЕСТЬДЕСЯТ;
            case 63:
                return ШЕСТЬДЕСЯТ_ТРИ;
            case 64:
                return ШЕСТЬДЕСЯТ_ЧЕТЫРЕ;
            case 70:
                return СЕМЬДЕСЯТ;
            case 72:
                return СЕМЬДЕСЯТ_ДВА;
            case 80:
                return ВОСЕМЬДЕСЯТ;
            case 81:
                return ВОСЕМЬДЕСЯТ_ОДИН;
            case 90:
                return ДЕВЯНОСТО;
            case 100:
                return СТО;
            default:
                throw new EnumConstantNotPresentException(DigitsInWords.class, String.valueOf(v));
        }
    }
}

package ProjektyJAVA;

public class PentlaWhile {
    public static void main(String[] args) {
        String[] days = {"Poniedzialek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        int index = 0;
        while (index < days.length) {
            System.out.println(days[index]);
            index++;
        }
    }
}
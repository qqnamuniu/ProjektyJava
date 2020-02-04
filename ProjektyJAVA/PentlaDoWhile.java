package ProjektyJAVA;

public class PentlaDoWhile {
    public static void main(String[] args) {
        String[] days = {"Poniedzialek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        int index = 0;
        do {
            System.out.println(days[index]);
            index++;
        } while (index < days.length);
    }
}
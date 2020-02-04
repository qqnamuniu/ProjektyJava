package ProjektyJAVA;

public class PentlaFor {
    public static void main(String[] args) {
        String[] days = {"Poniedzialek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};

        int index = 0;
        for (; ; ) {
            if (index < days.length) {
                System.out.println(days[index]);
                index++;
            } else {
                break;
            }
        }
    }
}

package ProjektyJAVA;

public class ContinueBreakCase {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i >= 10) {
                break;
            }
            System.out.println(i);
        }
    }
}
// String v = "a";
// switch (v) {
//      case "a":
//      case "b":
//      case "c":
//          break;
// }
package ProjektyJAVA;

import java.math.BigDecimal;

public class TypyZmiennoprzecinkowe {

    float  f1 = 1.4E-45F,  f2 = 3.4E+38F;   // rozmiar 32 bitow (4 bajty)
    double d1 = 4.9E-324,  d2 = 1.79E+308;  // rozmiar 64 bitow (8 bajtow)

    // 2E+2 == 2 * 20^2.
    // 2E-5 == 2 * 10^(1/5).

    // gdy wymagana jest przeogromna precyzja korzystajmy z klasy BigDecimal.
    BigDecimal bigDecimal = new BigDecimal(10);
}

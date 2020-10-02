package be.pxl.ja.streamingservice.model;

import java.math.BigDecimal;

public enum StreamingPlan {
    BASIC(1, 7.99),
    STANDAARD(2, 11.99),
    PREMIUM(4, 15.99);

    int aantalProfielen;
    double prijs;

    StreamingPlan(int aantalProfielen, double prijs) {
        this.aantalProfielen = aantalProfielen;
        this.prijs = prijs;
    }
}

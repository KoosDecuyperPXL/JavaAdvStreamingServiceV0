package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class PaymentInfo {
    String cardNumer;
    CreditCardType type;
    String firstName;
    String lastName;
    LocalDate expirationDate;
    int securityCode;

    public String getCardNumer() {
        return cardNumer;
    }

    public void setCardNumer(String cardNumer) {
        this.cardNumer = cardNumer;
    }

    public CreditCardType getType() {
        return type;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public void setType(CreditCardType value) {
        if (value.toString().equals(CreditCardType.MASTERCARD.name())) {
            this.type = CreditCardType.MASTERCARD;
        } else {
            this.type = CreditCardType.VISA;
        }
    }
}

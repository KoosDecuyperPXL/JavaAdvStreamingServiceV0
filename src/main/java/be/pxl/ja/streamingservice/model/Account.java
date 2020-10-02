package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.util.PasswordUtil;

import java.util.List;

public class Account {
    String email;
    String password;
    StreamingPlan plan;
    List<Profile> profiles;
    PaymentInfo info;

    public Account() {
        Profile profile1 = new Profile();
        profile1.setName("profile1");
    }

    public Account(String text, String text1) {
        Profile profile1 = new Profile();
        profile1.setName(text);
        verifyPassword(text1);
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public boolean verifyPassword(String password) {
        if (PasswordUtil.calculateStrength(password) >= 7) {
            this.password = password;
            return true;
        }
        return false;
    }

    public Profile getFirstProfile() {
        return profiles.get(0);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStreamingPlan(StreamingPlan plan) {
        for (StreamingPlan streamingPlan : StreamingPlan.values()) {
            if (plan.toString().equals(streamingPlan.name())) {
                this.plan = streamingPlan;
            }
        }
    }

    public void setInfo(PaymentInfo info) {
        this.info = info;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.info = paymentInfo;
    }
}

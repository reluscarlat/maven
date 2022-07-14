package com.example.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ExternalUserToEbayUserAdapter {

    @Getter
    @Setter
    private String userName;

    public ExternalUserToEbayUserAdapter(ExternalUser payPalUser) {
        this.userName = payPalUser.getUserName();
    }

    public EbayUser getEbayUser() {
        return new EbayUserImpl(this.userName);
    }
}

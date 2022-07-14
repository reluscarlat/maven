package com.example.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class EbayUserImpl implements EbayUser{

    @Getter
    @Setter
    private String userName;
}

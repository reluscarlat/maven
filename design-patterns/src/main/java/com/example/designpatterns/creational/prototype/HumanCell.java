package com.example.designpatterns.creational.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HumanCell implements Cloneable {

    @Getter
    @Setter
    private String dna;

    // all complex objects must be recreated (lists, maps, POJOs)
    public Object clone() throws CloneNotSupportedException {
        return new HumanCell(dna);
    }

}

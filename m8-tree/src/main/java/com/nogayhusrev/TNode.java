package com.cydeo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@Data
public class TNode {

    int value;
    TNode left,right;

    int height;

    public TNode(int value) {
        this.value = value;
    }
}

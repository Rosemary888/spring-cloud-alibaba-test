package com.zlm.provider.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private long id ;
    private String username ;
    private String password ;
}

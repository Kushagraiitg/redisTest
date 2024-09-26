package com.kpdev.redisexample;

import java.io.Serializable;

@Setters
@Getters
public class User implements Serializable {
    private String id;
    private String name;
}

package com.dmdev.oop.lesson25.hw.model;

import java.util.Arrays;
import java.util.List;

public enum RobotDetail {
    HEAD,
    BODY,
    LEFT_ARM,
    RIGHT_ARM,
    LEFT_LEG,
    RIGHT_LEG,
    CPU,
    RAM,
    HDD;

    public static final List<RobotDetail> CASHED_VALUES = Arrays.asList(values());
}

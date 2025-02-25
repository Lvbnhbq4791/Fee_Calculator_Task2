package ru.netology.service;

public class CustomsService {
    public static final int DUTIES_PER_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        return price / 100 + weight * DUTIES_PER_WEIGHT;
    }
}

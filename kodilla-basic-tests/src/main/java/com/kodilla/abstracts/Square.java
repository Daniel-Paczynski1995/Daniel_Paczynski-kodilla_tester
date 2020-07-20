package com.kodilla.abstracts;

public class Square {
    public static void main(String[] args) {
        Request request = new Request(4*5, 5*5);
        request.giveSquareParameiter();
        request.giveSurfaceAreaSquare();
    }
}
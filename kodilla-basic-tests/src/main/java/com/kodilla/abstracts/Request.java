package com.kodilla.abstracts;

public class Request extends shape {
    public Request(int SquareParameiter, int SurfaceAreaSquare) {
        super(SquareParameiter, SurfaceAreaSquare);
    }

    @Override
    public void giveSquareParameiter() {
System.out.println(" O = 4 * 5 = 20");
    }

    @Override
    public void giveSurfaceAreaSquare() {
System.out.println("P = 4 * 5 = 25");
    }
}

package com.kodilla.abstracts;

public  abstract class shape {
    private int SquareParameiter;
    private int SurfaceAreaSquare;

    public shape(int SquareParameiter, int SurfaceAreaSquare) {
        this.SquareParameiter = SquareParameiter;
        this.SurfaceAreaSquare = SurfaceAreaSquare;
    }

    public int getSquareParameiter() {
        return SquareParameiter;
    }

    public int getSurfaceAreaSquare() {
        return SurfaceAreaSquare;
    }

    public abstract void giveSquareParameiter();

    public abstract void giveSurfaceAreaSquare();
}

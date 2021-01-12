package com.project.agungbudiplibrary;

public class Matematika {

    private Double bil1, bil2;

    public Matematika() {
    }

    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public Double getBil1() {
        return bil1;
    }

    public void setBil1(Double bil1) {
        this.bil1 = bil1;
    }

    public Double getBil2() {
        return bil2;
    }

    public void setBil2(Double bil2) {
        this.bil2 = bil2;
    }

    public double getTambah() {
        return bil1 + bil2;
    }

    public double getKurang() {
        return bil1 - bil2;
    }

    public double getKali() {
        return bil1 * bil2;
    }

    public double getBati() {
        return bil1 / bil2;
    }
}


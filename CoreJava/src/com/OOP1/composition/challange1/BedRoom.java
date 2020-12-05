package com.OOP1.composition.challange1;

public class BedRoom {

    private int bed;
    private int bathroom;
    private int walls;
    private int windwos;
    private int tv;
    private int laptops;
    private int table;



    public BedRoom(int bed, int bathroom, int walls, int windwos, int tv, int laptops, int table) {
        this.bed = bed;
        this.bathroom = bathroom;
        this.walls = walls;
        this.windwos = windwos;
        this.tv = tv;
        this.laptops = laptops;
        this.table = table;
    }

    public void openWindow(int function) {

        switch (function) {
            case 0:
                System.out.println("The windwo is close");
                break;
            case 1:
                System.out.println("The windows is Open");
                break;
            default:
                System.out.println("No any responce");
                break;
        }
    }

    public int getBed() {
        return bed;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindwos() {
        return windwos;
    }

    public int getTv() {
        return tv;
    }

    public int getLaptops() {
        return laptops;
    }

    public int getTable() {
        return table;
    }
}

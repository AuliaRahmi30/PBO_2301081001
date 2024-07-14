/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_27April2024;

/**
 *
 * @author LENOVO
 */
public class Square extends Shape{
    private static double phi = 3.14;
    private int sisi;
    
    public Square(int par) {
        sisi=0;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi=sisi;
    }
    
    public String getName() {
        return "Square";
    }
    
    public float getArea() {
        return sisi*sisi;
    }
    public static void main(String[] args) {
        Square square = new Square(4);
        square.setSisi(4);
        System.out.println("Nama    :"+square.getName());
        System.out.println("Luas    :"+square.getArea());
    }

    public String getSide() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

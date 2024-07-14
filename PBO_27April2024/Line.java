/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_27April2024;

/**
 *
 * @author LENOVO
 */
public class Line implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public Line(){
        
    }
    
    public Line (double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getLength(){
        double length = Math.sqrt((x2 - x1)*(x2 - x1)
                + (y2 - y1)* (y2 - y1));
        return length;
    }
    
    public boolean isGreater(Object a, Object b){
        double aLen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (aLen > blen);
    }
    
    public boolean isLess(Object a, Object b){
        double aLen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (aLen < blen);
    }
    
    public boolean isEqual(Object a, Object b){
        double aLen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (aLen == blen);
    }

    @Override
    public boolean isEsqual(Object a, Object b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
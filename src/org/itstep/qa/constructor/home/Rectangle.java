package org.itstep.qa.constructor.home;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int x2, int y2) {
        x1 = 0;
        y1 = 0;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(){
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    public String getRectPrint(){
        String str = "x1 = " + x1 + ", y1 = " + y1 + "\nx2 = " + x2 + ", y2 = " + y2;
        return str;
    }

    public void getMove(int dx, int dy){
        this.x1 = x1 + dx;
        this.y1 = y1 + dy;
        System.out.println("x1 = " + x1 + ", y1 = " + y1);
        this.x2 = x2 + dx;
        this.y2 = y2 + dy;
        System.out.println("x2 = " + x2 + ", y2 = " + y2);
    }
}



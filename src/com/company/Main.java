package com.company;
interface imp{
     public void abc();
}
abstract  class outer implements imp {
    private int a=2;
    protected int b=4;
    public int e=9;
    int d=8;
    static public void print(){
        int z=100;
        System.out.println("z="+z);
    }
    //simple nested inner class
     abstract class inner extends outer {
        public void show() {
            int c;
            c=a+b;
            System.out.println("\nsum="+c+"\ne="+e+"\nd="+d);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        outer.inner in = new outer() {
            @Override
            public void abc() {

            }
        }.new inner() {
            @Override
            public void abc() {

            }
        };
        in.show();
        outer.print();


    }
}
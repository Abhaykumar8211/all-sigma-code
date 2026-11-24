//object nad class
//  public class day21_OOP {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.color = "Blue";
//         System.out.println(p1.color);

//         p1.tip = 5;
//         System.out.println(p1.tip);

//         p1.color = "yellow";
//         System.out.println(p1.color);
        
//     }
    
// }

// class Pen {
//     String color;
//     int tip;

//     void setcolor(String newcolor){
//         color = newcolor;
//     }

//     void settip(int newtip){
//         tip = newtip;
//     }
// }


// getter and setter
// public class day21_OOP {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setcolor("Blue");
//         System.out.println(p1.getcolor());

//         p1.settip(5);
//         System.out.println(p1.gettip());

//         p1.setcolor("yellow");
//         System.out.println(p1.getcolor());
        
//     }
    
// }

// class Pen {
//     private String color;
//     private int tip;

//     String getcolor(){
//         return this.color;
//     }
//     int gettip(){
//         return this.tip;
//     }

//     void setcolor(String newcolor){
//         color = newcolor;
//     }
//     void settip(int newtip){
//         tip = newtip;
//     }
// }

class complex{
    int real;
    int imaginary;

    public complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static complex addition(complex c1, complex c2){
        complex result = new complex(0, 0);

        result.real = c1.real + c2.real;
        result.imaginary = c1.imaginary + c2.imaginary;

        return result;
    }
    
    public static complex substaction(complex c1, complex c2){
        complex result = new complex(0, 0);

        result.real = c1.real + c2.real;
        result.imaginary = c1.imaginary + c2.imaginary;

        return result;
    }

    void print(){
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class day21_OOP {

    public static void main(String[] args) {

        complex c1 = new complex(2, 3);
        complex c2 = new complex(1, 4);

        complex result1 = complex.addition(c1, c2);
        complex result2 = complex.substaction(c1, c2);

        System.out.println("Addition:");
        result1.print();
        System.out.println("Substraction");
        result2.print();

    }
}
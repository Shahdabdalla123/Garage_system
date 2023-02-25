import java.util.Scanner;

public class vehicle {
    private String Model;
    private int Year;
    protected float length;
    protected float width;
    private int hours;
    private int minuts;
    private int endhours;
    private int endminutes;

    public int getEndhours() {
        return endhours;
    }

    public int getEndminutes() {
        return endminutes;
    }



    public void setEnd() {
        Scanner in = new Scanner(System.in);
        System.out.println("time departure in hours : ");
        endhours = in.nextInt();
        System.out.println("time departure in minutes : ");
        endminutes = in.nextInt();
    }
    public int fees(){
        int t,t2;
        if(endhours>hours){
            t=endhours-hours;
            t2=endminutes-minuts;
        }else{
            t=endhours+24-hours;
            t2=endminutes-60+minuts;
        }
        if(t2!=0){
            t++;
        }

        return t*5;
    }

    private String User;


    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public final void Data() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name : ");
        User = in.nextLine();
        System.out.println("Enter car model : ");
        Model = in.nextLine();
        System.out.println("Enter model year: ");
        Year = in.nextInt();
        System.out.println("time arrival in hours : ");
        hours = in.nextInt();
        System.out.println("time arrival in minutes : ");
        minuts = in.nextInt();
    }

    public int getHours() {
        return hours;
    }

    public int getMinuts() {
        return minuts;
    }


    public final void Booked() {
        System.out.println(" Booked Successfully  .. ");
    }

    public final void Dimension() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter car Dimension ....");
        System.out.println("enter length : ");
        length = in.nextFloat();
        System.out.println("enter width : ");
        width = in.nextFloat();
    }

    public final void park_in2() {
        System.out.print(" ");
        System.out.println("client name: " + User);
        System.out.println("model year: " + Year);
        System.out.println("Car model: " + Model);
        System.out.println("arrive time: " + hours + ":" + minuts);
        System.out.println("depth: " + width);
        System.out.println("length: " + length);
    }

    public final void car_area() {
        System.out.println("area : " + (length * width));
    }

}
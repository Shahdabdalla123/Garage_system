import java.util.Objects;
import java.util.Scanner;

class garage extends vehicle {
    public  int income=0;
    public  int num=0;

    public Slot [] arrayOfVehicles;
    private int G_area;

    public int getNum() {
        return num;
    }

    public void setNum() {
        num+=1;
    }

    public  void  setIncome(int ff) {
        income+=ff;
    }

    public int getIncome() {
        return income;
    }

    private int maxx;
    private int SlotArea;
    public void makeGarage(int max){
        maxx=max;
        Scanner in = new Scanner(System.in);
        Float w,d;
        boolean c;
        arrayOfVehicles=new Slot[max];
        for (int i=0;i<max;i++) {
            arrayOfVehicles[i] = new Slot();
            System.out.printf("enter width of slot %d",i);
            System.out.println(" ");
            w = in.nextFloat();
            System.out.printf("enter depth of slot %d",i);
            System.out.println(" ");
            d = in.nextFloat();
            arrayOfVehicles[i].setDepth(d);
            arrayOfVehicles[i].setWidth(w);
            arrayOfVehicles[i].setCheckcar(false);
        }


    }
     public void park_in(garage g,int choice,int a){
        switch (choice){
            case 1:
                parking_in neww=new first();
                neww.park_in(g, a, maxx);
                break;
            case 2:
                parking_in neww2=new best();
                neww2.park_in(g, a, maxx);
                break;
        }


    }
    public void park_out(garage p){
        Scanner in = new Scanner(System.in);
        int slot;
        System.out.println("please enter the id of your slot : ");
        slot = in.nextInt();
        while(slot>num||slot<0||!p.arrayOfVehicles[slot].isCheckcar()){
            System.out.println("invalid id please try again");
            System.out.println("please enter the id of your slot : ");
            slot = in.nextInt();
        }
        vehicle temo=p.arrayOfVehicles[slot].getMy_car();
        temo.setEnd();
        System.out.print("youu fees = "+temo.fees());
        setIncome(temo.fees());
        p.arrayOfVehicles[slot].setCheckcar(false);
        p.arrayOfVehicles[slot].setMy_car(null);
        num--;

    }


    public final void availableArea() {
        for(int i=0;i<maxx;i++){
            if(!arrayOfVehicles[i].isCheckcar()){
                System.out.print("slot with id "+i+" is empty");
                System.out.println(" ");
            }
        }


    }



}

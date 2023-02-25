import java.util.Objects;

public class best implements parking_in{

    public void park_in(garage g,int a,int maxx){

        int temp=0;
        vehicle newcar2=new vehicle();
        newcar2.Data();
        boolean chk2=false;
        newcar2.Dimension();
        for(int i=0;i<maxx;i++){
            if(!g.arrayOfVehicles[i].isCheckcar()&& Objects.equals(g.arrayOfVehicles[i].getWidth(),newcar2.getWidth()) &&Objects.equals(g.arrayOfVehicles[i].getDepth(), newcar2.getLength())){

                g.arrayOfVehicles[i].setCheckcar(true);
                g.arrayOfVehicles[i].setid(a);
                g.arrayOfVehicles[i].setMy_car(newcar2);
                chk2=true;
                temp=i;
                g.arrayOfVehicles[temp].setid(temp);
                g.setNum();
                break;
            }

        }
        if(!chk2){
            for(int i=0;i<maxx;i++){
                if(!g.arrayOfVehicles[i].isCheckcar()&&g.arrayOfVehicles[i].getWidth()>newcar2.getWidth()&&g.arrayOfVehicles[i].getDepth()>newcar2.getLength()){
                    g.arrayOfVehicles[i].setCheckcar(true);
                    g.arrayOfVehicles[i].setid(a);
                    g.arrayOfVehicles[i].setMy_car(newcar2);
                    chk2=true;
                    temp=i;
                    g.arrayOfVehicles[temp].setid(temp);
                    g.setNum();
                    break;
                }

            }
        }

        if(!chk2) {
            System.out.print("sorry there is no places for you car dimension");
        }else {
            System.out.printf("success your vehicle can park in now in slot with id %d",g.arrayOfVehicles[temp].getid());
        }
    }


}

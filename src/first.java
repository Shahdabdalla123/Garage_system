public class first implements parking_in{
    public void park_in(garage g,int a,int maxx){
        int tempp=0;
        vehicle newcar=new vehicle();
        newcar.Data();
        boolean chk=false;
        newcar.Dimension();
        for(int i=0;i<maxx;i++){
            if(!g.arrayOfVehicles[i].isCheckcar()&&g.arrayOfVehicles[i].getWidth()>=newcar.getWidth()&&g.arrayOfVehicles[i].getDepth()>=newcar.getLength()){
                g.arrayOfVehicles[i].setCheckcar(true);
                g.arrayOfVehicles[i].setid(a);
                g.arrayOfVehicles[i].setMy_car(newcar);
                chk=true;

                tempp=i;
                g.arrayOfVehicles[tempp].setid(tempp);
                g.setNum();
                break;
            }

        }
        if(!chk) {
            System.out.print("sorry there is no places for you car dimension");
        }else {
            System.out.printf("success your vehicle can park in now in slot with id %d",g.arrayOfVehicles[tempp].getid());
        }
    }


}

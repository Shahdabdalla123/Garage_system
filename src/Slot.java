public class Slot {
    private Float width;
    private Float depth;
    private int Carid;
private vehicle my_car;

    public vehicle getMy_car() {
        return my_car;
    }

    public void setMy_car(vehicle my_car) {
        this.my_car = my_car;
    }

    public void setid(int carid) {
        Carid = carid;
    }

    public int getid() {
        return Carid;
    }

    private boolean checkcar;

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

    public Float getDepth() {
        return depth;
    }

    public boolean isCheckcar() {
        return checkcar;
    }

    public void setCheckcar(boolean checkcar) {
        this.checkcar = checkcar;
    }
}

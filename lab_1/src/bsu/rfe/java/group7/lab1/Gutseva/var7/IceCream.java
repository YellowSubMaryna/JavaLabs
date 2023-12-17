package bsu.rfe.java.group7.lab1.Gutseva.var7;

public class IceCream extends Food{
    private String sirup;
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
    public String getSirup() {
        return sirup;
    }
    public void setSirup(String sirup) {
        this.sirup = sirup;
    }
    public IceCream(String sirup) {
        super("Мороженное");
        this.sirup = sirup;
    }
    public String toString() {
        return super.toString() + " с сиропом '" + sirup.toUpperCase() + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return sirup.equals(((IceCream)arg0).sirup);
        } else
            return false;
    }
}

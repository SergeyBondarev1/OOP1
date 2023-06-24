import java.util.Objects;

public class Puffinduy extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffinduy(String name, String faculty, int powerMagic, int transgressionDistance) {
        super(name, faculty, powerMagic, transgressionDistance);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int sum(){
        return loyalty+honesty+industriousness;
    }
    public void compered(Puffinduy o){
        if(sum() > o.sum()){
            System.out.println(getName() + " лучший Пуфиндуец, чем " +o.getName());
        } else {
            System.out.println(o.getName() + " лучший Пуфиндуец, чем " + getName());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puffinduy puffinduy = (Puffinduy) o;
        return industriousness == puffinduy.industriousness && loyalty == puffinduy.loyalty && honesty == puffinduy.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Puffinduy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}

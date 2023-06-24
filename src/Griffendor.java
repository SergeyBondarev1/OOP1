import java.util.Objects;

public class Griffendor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffendor(String name, String faculty, int powerMagic, int transgressionDistance) {
        super(name, faculty, powerMagic, transgressionDistance);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public int sum(){
        return nobility+honor+courage;
    }
    public void compered(Griffendor o){
        if(sum() > o.sum()){
            System.out.println(getName() + " лучший Грифендорец, чем " +o.getName());
        } else {
            System.out.println(o.getName() + " лучший Грифендорец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffendor that = (Griffendor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }
}

import java.util.Objects;

public class Hogwarts {
private String name;
private String faculty;
private int powerMagic;
private int transgressionDistance;

    public Hogwarts(String name, String faculty, int powerMagic, int transgressionDistance) {
        this.name = name;
        this.faculty = faculty;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    public int sum(){
        return transgressionDistance+powerMagic;
    }
    public void compered(Hogwarts o){
        if(this.getPowerMagic()>o.getPowerMagic()){
            System.out.println(name + " обладает большей мошьностью магии, чем " +o.name);
        } else {
            System.out.println(o.name + " обладает большей мошьностью магии, чем " + name);
        }
        if (this.getTransgressionDistance()>o.getTransgressionDistance()){
            System.out.println(name+ " обладает большей дистанцией чем" + o.name);
        } else {
            System.out.println(o.name+ " обладает большей дистанцией чем" + name);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerMagic == hogwarts.powerMagic && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name) && Objects.equals(faculty, hogwarts.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, powerMagic, transgressionDistance);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}

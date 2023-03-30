package tire;

public class Tire /*implements Comparable<Tire>*/{

    private int id;
    private double width;
    private double weight;
    private String mark;


    public Tire() {
    }


    public Tire(int id, double width, double weight, String mark) {
        this.id = id;
        this.width = width;
        this.weight = weight;
        this.mark = mark;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getMark() {
        return mark;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }




    @Override
    public String toString() {
        return "Tire [id=" + id + ", width=" + width + ", weight=" + weight + ", mark=" + mark + "]";
    }


    // @Override
    // public int compareTo(Tire o) {
        
    //     if ( )

    // } 

}

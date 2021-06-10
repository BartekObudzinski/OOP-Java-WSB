import java.io.Serializable;

public class Audi implements Serializable {
    int modelYear;
    String modelName;
    public Audi(int year, String name) {
        this.modelYear = year;
        this.modelName = name;
      }

      
}

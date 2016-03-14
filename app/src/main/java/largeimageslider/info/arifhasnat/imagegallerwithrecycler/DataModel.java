package largeimageslider.info.arifhasnat.imagegallerwithrecycler;

/**
 * Created by User1 on 3/9/2016.
 */
public class DataModel {


    int id_;
    int image;

    public DataModel(int id_, int image) {

        this.id_ = id_;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
package sample;

import javafx.scene.image.ImageView;

public class CustomImage {
    private ImageView image;

    CustomImage(ImageView image){
        this.image = image;
    }

    public void setImage(ImageView value){
        this.image = value;
    }
    public ImageView getImage(){
        return this.image;
    }
}

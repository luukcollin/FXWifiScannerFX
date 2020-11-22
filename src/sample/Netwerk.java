package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Netwerk {
    public final Integer signaalsterkte;
    public final String naam;
    public final String encryptie;
    private ImageView image;

    public Netwerk(String naam, int signaalSterkte, String encryptie ){
        this.naam =  naam;
        this.signaalsterkte =  signaalSterkte;
        this.encryptie =  encryptie;
        setImage();
    }

    @Override
    public String toString() {
        return "Netwerk{" +
                "signaalSterkte=" + signaalsterkte +
                ", naam='" + naam + '\'' +
                ", encryptie='" + encryptie + '\'' +
                '}';
    }

    public String getEncryptie(){
        return this.encryptie.toString();
    }

    public String getNaam(){
        return this.naam.toString();
    }

    public String getSignaalsterkte(){
        return this.signaalsterkte.toString();
    }

    public void setImage(){
        this.image = new ImageView();
        if(signaalsterkte <= 30){
            this.image.setImage(new Image(this.getClass().getResourceAsStream("../img/signal_small.png")));
        }else if(signaalsterkte > 30 && signaalsterkte <= 70){
            this.image.setImage(new Image(this.getClass().getResourceAsStream("../img/signal_medium.png")));
        }else{
            this.image.setImage(new Image(this.getClass().getResourceAsStream("../img/signal_big.png")));
        }
        this.image.setFitHeight(90);
        this.image.setFitWidth(90);
    }

    public ImageView getImage(){
        return this.image;
    }
}

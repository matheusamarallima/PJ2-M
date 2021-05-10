package entities;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Image {

    String imageName;
    final String extension = ".png";
    final double size = 5.3;
    String url = "photoshock.com";

    public static Set<Image> imageList = new HashSet<>();

    public Image() {
    }

    public Image(String imageName, String url) {
        this.imageName = imageName;
        this.url = url;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}




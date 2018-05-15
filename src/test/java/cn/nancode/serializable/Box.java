package cn.nancode.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(1000);
        myBox.setHeight(2000);

        try {
            FileOutputStream fs = new FileOutputStream("test.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(fs);
            os.close();

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

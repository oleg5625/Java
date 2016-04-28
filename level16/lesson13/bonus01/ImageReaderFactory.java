package com.javarush.test.level16.lesson13.bonus01;


import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by oleg on 04.09.2014.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes form){
        ImageReader reader;
        if (form == ImageTypes.BMP){
            reader = new BmpReader();
        }
        else if (form == ImageTypes.JPG){
            reader = new  JpgReader();
        }
        else if (form == ImageTypes.PNG){
            reader = new PngReader();
        }
        else throw new IllegalArgumentException("Неизвестный тип картинки");

        return reader;
    }


}

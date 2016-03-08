package com.goit.filedepository;

import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class FileDepository {

    private List<File> Files;

    public List<File> getFiles() {
        return Files;
    }

    public void setFiles(List<File> files) {
        Files = files;
    }

    public String Content="Content:";
    public String Txt="AboutMe.doc";
    public String Jpg="Yaremche.jpg";
    public String Mp3="SpanishSahara.mp3";

    public void Content(){
        System.out.println(Content);
        System.out.println(Txt);
        System.out.println(Jpg);
        System.out.println(Mp3);

    }


}

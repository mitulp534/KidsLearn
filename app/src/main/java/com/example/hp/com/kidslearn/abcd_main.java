package com.example.hp.com.kidslearn;

public class abcd_main {
    private String DefaultAlphabet;//a
    private String NamedAlphabet;//apple
    private int ImageResourceID=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;


    public abcd_main(String defaultAlphabet, String namedAlphabet) {
        DefaultAlphabet = defaultAlphabet;
        NamedAlphabet = namedAlphabet;
    }

    public String getDefaultAlphabet() {
        return DefaultAlphabet;
    }

    public String getNamedAlphabet() {
        return NamedAlphabet;
    }

   public abcd_main(String defaultAlphabet,String namedAlphabet,int imageResourceID){
        DefaultAlphabet=defaultAlphabet;
        NamedAlphabet=namedAlphabet;
        ImageResourceID=imageResourceID;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public boolean hasImage(){
        return ImageResourceID != NO_IMAGE_PROVIDED;
    }


}




package com.company;

public class KnowingMyVariables2 {
    public static void main(String[] args) {


        // Call all of our methods from here.
        knowingMyVariables2Test();
    }
      //Write all of our methods out here
    public static void  knowingMyVariables2Test(){
        MyFavorite Michael = new MyFavorite();

        Michael.setMyName("Moody");
        Michael.setFavFood("PB&J");
        Michael.setFavColor("Orange");
        Michael.setFavArtist("Kdot");

        System.out.println(Michael.getMyName());
        System.out.println(Michael.getFavColor());
        System.out.println(Michael.getFavFood());
        System.out.println(Michael.getFavArtist());
        Michael.playFavSong("Backseat Freestyle");

    }

}
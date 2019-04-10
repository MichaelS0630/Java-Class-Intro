package com.company;

public class MyFavorite {

    private String myName = "Michael";
    private String favFood = "Shrimp Fried Rice";
    private String favColor = "White";
    private String favArtist = "Kendrick Lamar";

    public String getMyName() {
        return myName;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public String getFavFood(){
        return favFood;
    }
    public void setFavFood(String favFood) {
        this.favFood =favFood;
    }
    public String getFavColor(){
        return favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
    public String getFavArtist(){
        return favArtist;
    }
    public void setFavArtist(String favArtist) {
        this.favArtist = favArtist;
    }
    public void playFavSong(String favSong){
        System.out.println("Playing your favorite song: " +favSong);
    }
}

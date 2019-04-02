package demo;

public class Artist {
//variables
    private String firstName;
    private String lastName;
    private String[] songName;

    //defult contructor
    public Artist(){
    }
    //constructor
    public Artist(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Artist(String firstName, String lastName, String[] songName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.songName = songName;
    }


    String nameMySongs(String w, String x, String y, String z) {

        String[] mySongs = {w, x, y, z};

        String names = "Avonte' songs are: ";

        for (int i = 0; i < mySongs.length; i++) {

            names = names + mySongs[i];
        }
        return names;
    }



    //GETTERS AND SETTERS
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String[] getSongName(){
        return songName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String artist){
        this.firstName = firstName;
    }

    public void setSongName(String[] songName){
        this.songName = songName;
    }

}

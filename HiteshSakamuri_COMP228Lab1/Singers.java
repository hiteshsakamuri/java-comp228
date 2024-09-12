public class Singers {
    private int id;
    private String name;
    private String address;
    private int dob;
    private int albums;

    public Singers(){}

    public Singers(int id){
        this.id = id;
    }
    public Singers(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Singers(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Singers(int id, String name, String address, int dob){
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }
    public Singers(int id, String name, String address, int dob, int albums){
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albums = albums;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setDob(int dob){
        this.dob = dob;
    }
    public void setAlbums(int albums){
        this.albums = albums;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getDob(){
        return dob;
    }
    public int getAlbums(){
        return albums;
    }



}

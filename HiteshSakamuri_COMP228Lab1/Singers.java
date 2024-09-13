public class Singers {
    private int Id;
    private String Name;
    private String Address;
    private int Dob;
    private int Albums;

    public Singers(){}

    public Singers(int id){
        this.Id = id;
    }
    public Singers(int id, String name){
        this.Id = id;
        this.Name = name;
    }
    public Singers(int id, String name, String address){
        this.Id = id;
        this.Name = name;
        this.Address = address;
    }
    public Singers(int id, String name, String address, int dob){
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.Dob = dob;
    }
    public Singers(int id, String name, String address, int dob, int albums){
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.Dob = dob;
        this.Albums = albums;
    }

    public void setId(int id){
        this.Id = id;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    public void setDob(int dob){
        this.Dob = dob;
    }
    public void setAlbums(int albums){
        this.Albums = albums;
    }

    //method to set all parameters at once
//    public void setParameters(int id, String name, String address, int dob, int albums){
//        this.Id = id;
//        this.Name = name;
//        this.Address = address;
//        this.Dob = dob;
//        this.Albums = albums;
//    }

    public int getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public int getDob(){
        return Dob;
    }
    public int getAlbums(){
        return Albums;
    }



}

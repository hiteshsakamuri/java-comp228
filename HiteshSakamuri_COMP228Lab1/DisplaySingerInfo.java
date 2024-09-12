public class DisplaySingerInfo {
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer1.getId() + ", " + singer1.getName() + ", "+ singer1.getAddress() + ", "+ singer1.getDob() + ", "+ singer1.getAlbums());

        Singers singer2 = new Singers(1);
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer2.getId());

        Singers singer3 = new Singers(1, "Hitesh");
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer3.getId() + ", " + singer3.getName());

        Singers singer4 = new Singers(1, "Hitesh", "auhoi street");
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer4.getId() + ", " + singer4.getName() + ", "+ singer4.getAddress());

        Singers singer5 = new Singers(1, "Hitesh", "auhoi street", 19980101);
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer5.getId() + ", " + singer5.getName() + ", "+ singer5.getAddress() + ", "+ singer5.getDob());

        Singers singer6 = new Singers(1, "Hitesh", "auhoi street", 19980101, 5);
        System.out.println("The id, name, address, dob and albums of the singer is: " + singer6.getId() + ", " + singer6.getName() + ", "+ singer6.getAddress() + ", "+ singer6.getDob() + ", "+ singer6.getAlbums());

    }
}

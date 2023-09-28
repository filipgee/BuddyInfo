public class BuddyInfo {

    private String name;
    private String address;
    private String number;
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
    }

    public BuddyInfo() { name = "unknown"; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo obj = new BuddyInfo();
//        obj.name = "Filip";
        obj.setName("Filip");
        System.out.println("Hello "+ obj.getName() + "!");


    }
}
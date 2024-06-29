public class Demo {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("John", "Smith")
                .age(40)
                .phone("302448861")
                .address("Example City Dirt Avenue 51")
                .build();

        User user2 = new User.UserBuilder("Jakab", "Gipsz")
                .age(28)
                .address("Atlantis")
                .build();

        User user3 = new User.UserBuilder("Sheldon", "Cooper")
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

}

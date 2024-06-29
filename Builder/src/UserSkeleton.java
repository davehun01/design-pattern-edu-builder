public class User {
    private final String name; // mandatory
    private final String email; // mandatory
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional



    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }


    @Override
    public String toString() {
        return "User: "+this.name+", "+this.email +", "+this.age+", "+this.phone+", "+this.address;
    }

    public static class UserBuilder {
        //todo: variable definitions

        public UserBuilder(String name, String email) {
            //todo: implement
        }
        public UserBuilder age(int age) {
            //todo: implement
        }
        public UserBuilder phone(String phone) {
            //todo: implement
        }
        public UserBuilder address(String address) {
            //todo: implement
        }

        public User build() {
            //todo: implement
        }
    }
}
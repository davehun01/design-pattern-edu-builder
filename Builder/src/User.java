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
        private final String name;
        private final String email;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user =  new User(this);
            return user;
        }
    }
}
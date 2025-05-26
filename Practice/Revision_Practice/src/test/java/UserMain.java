public class UserMain {
    public static void main(String[] args) {
        UserForBuilder builder = new UserForBuilder.UserBuilder()
                .setName("Sushma")
                .setAge(21)
                .build();
        System.out.println(builder);

        UserForBuilder builder2 = new UserForBuilder.UserBuilder()
                .setName("Sindhu")
                .setAge(19)
                .setId(34)
                .build();
        System.out.println(builder2);

    }
}

public class UserForBuilder {
    private String name;
    private int age;
    private int id;

    private UserForBuilder(UserBuilder builder)
    {
        this.name = builder.name;
        this.age = builder.age;
        this.id = builder.id;
    }

    public static class UserBuilder{
        private String name;
        private int age;
        private int id;

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age =age;
            return this;
        }

        public UserBuilder setId(int id){
            this.id = id;
            return this;
        }

        public UserForBuilder build(){
            return new UserForBuilder(this);
        }
    }
    public String toString(){
        return "name "+name
                +" age "+age
                +" id "+id;
    }
}

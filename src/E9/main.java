package E9;

public class main {
    public static void main(String[] args) {
        Customer client_data = new Customer();
// Introduction of parameters (setters)
        client_data.setAge(18);
        client_data.setName("Cristofer");
        client_data.setPhone_number(933289204);
// Introduction of getters
        System.out.println(client_data.getAge());
        System.out.println(client_data.getName());
        System.out.println(client_data.getPhone_number());
    }
}
class Person {
    public int age;
    public String name;
    public int phone_number;
}
    class Customer extends Person {
    private int credit;
    // setters create for parameters
        public void setAge (int age){
            this.age = age;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setPhone_number (int phone_number){
            this.phone_number = phone_number;
        }
    // getters create for return setters (parameters)
        public int getAge (){
            return this.age;
        }
        public String getName (){
            return this.name;
        }
        public int getPhone_number (){
            return this.phone_number;
        }
    }

    class employee extends Person {
        private int salary;

    }
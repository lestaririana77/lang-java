public class PolymorphismApp {
    // Polymorphisme = perubahn bentuk dari satu bentuk ke bentuk lain
    // Erat kaintannya dengan sifat pewarisan
    public static void main(String[] args) {
     
        
        Employee employee = new Employee("Ana");
        employee.sayHello("Riri");

        employee = new Manager("Ana");
        employee.sayHello("Riri");

        employee = new VicePresident("Ana");
        employee.sayHello("Riri");
    }
}

public class employee {
    
    String name, city;
    int age;
    
    public void display() {
        
        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);
        
    }
    
    public static void main(String[] args) {
        
        employee emp1 = new employee();
        emp1.name = "Viswas";
        emp1.age = 32;
        emp1.city = "Mumbai";
        
      
        
        
        emp1.display();
        
        
    }
    
}
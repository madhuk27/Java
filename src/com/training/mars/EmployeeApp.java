
package com.training.mars;

import java.util.Scanner;


public class EmployeeApp {

  
    public static void main(String[] args) {
       
        Employee employee = new Employee(); 
        Menu menu = new Menu(); 
        char answer = 'n';
        Scanner input = new Scanner(System.in);
        
       try {
    	   do {
       
            menu.mainMenu();
            employee.setRecord(employee);
            
            System.out.println("\n Employee Details:");
            
            System.out.println(employee.toString());
 	   
            
            System.out.print("\nDo you want to process another record (y/n): ");
            answer = input.next().charAt(0); 
            
            if (Character.toLowerCase(answer) != 'y' 
                    && Character.toLowerCase(answer) != 'n'){
                System.out.println("Enter only Y or N!");
                System.out.print("\nDo you want to process another record (y/n): ");
                answer = input.next().charAt(0);         
            }
            
        } 
    	   while (Character.toLowerCase(answer) != 'n'); 
        menu.exitMenu(); 
    }  

       finally {
  	  input.close();
  
}
}
}
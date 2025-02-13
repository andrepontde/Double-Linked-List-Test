/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testappweek5;

/**
 *
 * @author AndrePontDeAnda
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinearListInterface myDouble = new DLList();
        myDouble.add("This is the first element",1);
        System.out.println(""+myDouble.size());
        myDouble.add("This is the second element",2);
        myDouble.add("This is the second element",3);
        myDouble.remove(1);
        System.out.println(""+myDouble.printList());
    }
    
}

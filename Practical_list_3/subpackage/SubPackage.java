// SubPackage.java
package subpackage;

import packageone.PackageOne;
import packagetwo.PackageTwo;

public class SubPackage extends PackageOne {
    @Override
    public void display() {
        System.out.println("Inside SubPackage class, overriding PackageOne");
    }

    public static void main(String[] args) {
        // Creating objects
        PackageOne packageOne = new PackageOne();
        PackageTwo packageTwo = new PackageTwo();
        SubPackage subPackage = new SubPackage();

        // Calling display() method of each class
        packageOne.display();
        packageTwo.display();
        subPackage.display(); // This will call overridden display() method in SubPackage class
    }
}


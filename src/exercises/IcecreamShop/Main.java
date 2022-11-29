package exercises.IcecreamShop;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());

        System.out.println(flavors);
        System.out.println(cones);
    }
}

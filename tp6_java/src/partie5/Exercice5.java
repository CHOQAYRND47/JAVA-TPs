package partie5;

import java.util.Map;
import java.util.TreeMap;

public class Exercice5 {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> list = new TreeMap<>();

        list.put(105, "Smail");
        list.put(101, "Said");
        list.put(110, "Houssain");
        list.put(95, "Nourddine");
        list.put(103, "Abdelkarime");

        System.out.println("================================\nLa liste triée automatiquement :");

        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            System.out.println("ID : " + entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("================================\nAfficher le premier et le dernier étudiant :");
        if (!list.isEmpty()) {
            System.out.println("Premier de la liste : " + list.firstKey() + " - " + list.get(list.firstKey()));
            System.out.println("Dernier de la liste : " + list.lastKey() + " - " + list.get(list.lastKey()));
        }


        System.out.println("================================\nExtraire les étudiants ayant un numéro supérieur à 100 :");
        Map<Integer, String> extraits = list.tailMap(101);
        for (Map.Entry<Integer, String> entry : extraits.entrySet()) {
            System.out.println("N° " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
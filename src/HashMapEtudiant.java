import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEtudiant {
    static HashMap<String, Etudiant> hashmap = new HashMap<String, Etudiant>();

    public static void alimenterMap(){
        Etudiant etd1 = new Etudiant("allaf","amine",234,"Q234");
        Etudiant etd2 = new Etudiant("allaf1","amine1",2345,"Q2345");
        hashmap.put(etd1.getCIN(),etd1);
        hashmap.put(etd2.getCIN(),etd2);

    }
    public static boolean rechercherCin(String cin){
        return hashmap.containsKey(cin);
    }

    public static boolean rechercherEtudiant(Etudiant etudiant) {
        return hashmap.containsValue(etudiant);
    }

    public static void afficherMap(){
        hashmap.forEach((k,v)-> System.out.println(k + " " + v));
    }

    public static void afficherEtudiants() {
        for (Etudiant etudiant : hashmap.values()) {
            System.out.println("CIN: " + etudiant.getCIN() + ", Nom: " + etudiant.getNom());
        }
    }

    public static Etudiant trouverEtudiantParCin(String cin) {
           return hashmap.get(cin);
    }

    public static void afficherCINs() {
        hashmap.keySet().forEach(System.out::println);
    }

    public static String trouverCIN( Etudiant etd) {
        for (Map.Entry<String, Etudiant> entry : hashmap.entrySet())
            if (entry.getValue().equals(etd))
                return entry.getKey();
        return null;
    }

    public static void ajouterEtudiant(Etudiant etd) {
        hashmap.put(etd.getCIN(), etd);
    }

    public static boolean supprimerEtudiant(String cin) {

       return hashmap.remove(cin) != null;

    }

    public static void joindreMaps(HashMap<String, Etudiant> map1) {
        hashmap.putAll(map1);
    }


    public static void main(String[] args) {
        //1


        alimenterMap();
        afficherEtudiants();

        //1
        System.out.println(rechercherCin("Q234"));
        System.out.println(trouverEtudiantParCin("Q234"));

        /*pairs.put("Q234",etd1);
        pairs.put("Q235",etd2);

        //2
        System.out.println("----2-------");
        Etudiant etd = Rechercher(pairs,"Q235");
        if(etd != null){
            System.out.println(etd.getNom());
        }else{
            System.out.println("not found");
        }

        //3
        System.out.println("----3-------");
        System.out.println(cinExists(pairs,"Q236"));

        //4
        System.out.println("----4-------");
        afficherMap(pairs);

        //5
        System.out.println("----5-------");
        afficherEtudiants(pairs);

        //6
        System.out.println("----6-------");
        afficherCINs(pairs);

        //7

        System.out.println("-----7------");
        Etudiant etd3 = getEtudiantParCin(pairs,"Q235");
        if(etd3 != null){
            System.out.println(etd);
        }else{
            System.out.println("not found");
        }

        //8

        System.out.println("-----8------");
        String cin = trouverCIN(pairs,etd1);
        if(cin != null){
            System.out.println("le cin est "+cin+" de l'étudiant "+etd1);
        }else{
            System.out.println("not found in hashmap");
        }

        //9
        System.out.println("------9-----");
        System.out.println("map before adding : \n"+pairs);
        Etudiant etd5 = new Etudiant("zaim","fatah",23459,"Q2349");
        ajouterEtudiant(pairs,"Q2349",etd5);
        System.out.println("map after adding : \n"+pairs);

        //10
        System.out.println("------10-----");
        System.out.println("map before removing : \n"+pairs);
        supprimerEtudiant(pairs,"Q2349");
        System.out.println("map after removing : \n"+pairs);

        //11
        System.out.println("-----11-----");
        HashMap<String, Etudiant> pairs1 = new HashMap<>();
        pairs1.put("Q1234",etd1);
        System.out.println("pairs1 before : \n" + pairs1);
        joindreMaps(pairs,pairs1);
        System.out.println("pairs1 after : \n" + pairs1);*/






    }
}

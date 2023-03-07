import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEtudiant {

    static TreeMap<String, Etudiant> treeMap = new TreeMap<>();
    static TreeMap<Integer, Etudiant> CneTreeMap = new TreeMap<>();

    public static void alimenterMap(){
        Etudiant etd1 = new Etudiant("allaf","amine",234,"Q234");
        Etudiant etd2 = new Etudiant("allaf1","amine1",2345,"AB123");
        treeMap.put(etd1.getCIN(),etd1);
        treeMap.put(etd2.getCIN(),etd2);

    }

    public static void alimenterMap2(){

        for(Etudiant e : treeMap.values())
            CneTreeMap.put(e.getCNE(),e);

    }


    public static Etudiant rechercherPremierEtudiant(){
        return treeMap.get(treeMap.firstKey());
    }

    public static Etudiant rechercherDernierEtudiant(TreeMap<String, Etudiant> treeMap){
        return treeMap.lastEntry().getValue();
    }

    public static void afficherEtudiants() {
        System.out.println("Liste des étudiants (triés par CIN) :");
        for (Map.Entry<String, Etudiant> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static SortedMap<String, Etudiant> getStudentsByCinRange(String minCin, String maxCin) {

        if(minCin!=null && maxCin != null && minCin.compareTo(maxCin)< 0 )
            return treeMap.subMap(minCin, maxCin);
        return null;

    }

    public static SortedMap<String, Etudiant> etudiantParMinCin(String minCin) {
        return treeMap.tailMap(minCin);
    }

    public static SortedMap<String, Etudiant> etudiantParMaxCin(String maxCin) {
        return treeMap.headMap(maxCin);
    }

    public static String trouverCinParEtudiant( Etudiant etudiant) {
        for (Map.Entry<String, Etudiant> entry : treeMap.entrySet()) {
            if (entry.getValue().equals(etudiant)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void ajouterEtudiant(TreeMap<String, Etudiant> map, String cin, Etudiant etudiant) {
        map.put(cin, etudiant);
    }

    public static void supprimerEtudiant(TreeMap<String, Etudiant> map, String cin) {
        map.remove(cin);
    }

    public static <K, V>  void joinTreeMap(TreeMap<K, V> map1, TreeMap<K, V> map2) {
        map1.putAll(map2);
    }


    public static void main(String[] args) {



        //1
        alimenterMap();
        afficherEtudiants();
        alimenterMap2();
        CneTreeMap.forEach((k,v)-> System.out.println(k + " "+ v));
        /*System.out.println("-----1-----");
        TreeMap<String, Etudiant> CinTreeMap = new TreeMap<>();

        Etudiant etd1 = new Etudiant("allaf","amine",234,"Q234");
        Etudiant etd2 = new Etudiant("allaf1","amine1",2345,"Q2345");
        Etudiant etd3 = new Etudiant("allaf2","amine2",23456,"Q23456");

        CinTreeMap.put("Q234",etd1);
        CinTreeMap.put("Q2345",etd2);
        CinTreeMap.put("Q23456",etd3);

        //2
        System.out.println("-----2------");
        Etudiant firstStudent = RechercherPremEtudiant(CinTreeMap);
        System.out.println(firstStudent);

        //3
        System.out.println("-----3------");
        Etudiant lastStudent = RechercherDernierEtudiant(CinTreeMap);
        System.out.println(lastStudent);

        //4
        System.out.println("-----4------");
        System.out.println("TreeMap sont triées par ordre croissant des clés");
        afficherEtudiants(CinTreeMap);

        //5
        System.out.println("------5--------");
        TreeMap<String, Etudiant> result = getStudentsByCinRange(CinTreeMap, "Q234", "Q2345");
        System.out.println(result);

        //6
        System.out.println("------6--------");
        TreeMap<String, Etudiant> result1 = etudiantParMinCin(CinTreeMap, "Q234");
        System.out.println(result1);

        //7
        System.out.println("-------7-------");
        TreeMap<String, Etudiant> result2 = etudiantParMaxCin(CinTreeMap, "Q2345");
        System.out.println(result2);

        //8
        System.out.println("------8------");
        Comparator comparator = CinTreeMap.comparator();
        System.out.println("Sorted by natural ordering? " + (comparator == null));


        //9
        System.out.println("-----9--------");


        //10
        System.out.println("-----10--------");
        String cin = trouverCinParEtudiant(CinTreeMap, etd1);
        System.out.println("Le CIN de " + etd1 + " est " + cin);

        //11
        System.out.println("-----11---------");
        Etudiant etd4 = new Etudiant("allaf4","amine4",234567,"Q234567");
        System.out.println("Cintree map avant l'ajout : \n" + CinTreeMap);
        ajouterEtudiant(CinTreeMap,"Q234567",etd4);
        System.out.println("Cintree map après l'ajout : \n" + CinTreeMap);

        //12
        System.out.println("-----12---------");

        System.out.println("Cintreemap avant la suppression : \n" + CinTreeMap);
        supprimerEtudiant(CinTreeMap,"Q234567");
        System.out.println("Cintree map après la suppression : \n" + CinTreeMap);

        //13
        System.out.println("-----13---------");
        TreeMap<String, Etudiant> Treemap = new TreeMap<>();
        System.out.println("Treemap avant la jointure : \n" + Treemap);
        joinTreeMap(CinTreeMap,Treemap);
        System.out.println("Treemap avant la jointure : \n" + Treemap);*/












    }
}

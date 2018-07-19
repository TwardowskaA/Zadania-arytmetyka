public class Test3 {

    public static void main(String[] args) {

        int[] tablica = {1 , 2 , 3, 3, 8, 1};

        for (int i = 0; i < tablica.length; i++) {


            if (tablica[i] != tablica[tablica.length -1 -i ]){
                System.out.println("nie jest palindromem");
                break;
            }


        }

        System.out.println("jest palindromem");
    }


}

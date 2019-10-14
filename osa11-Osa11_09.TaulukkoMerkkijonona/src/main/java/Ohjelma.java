
public class Ohjelma {

    public static void main(String[] args) {
        int rivit = 2;
        int sarakkeet = 3;
        int[][] matriisi = new int[rivit][sarakkeet];
        matriisi[0][1] = 5;
        matriisi[1][0] = 3;
        matriisi[1][2] = 7;
        System.out.println(taulukkoMerkkijonona(matriisi));
    }
    public static String taulukkoMerkkijonona(int[][] taulukko){
        StringBuilder palautettavat = new StringBuilder();
        for (int[] taulukko1 : taulukko) {
            for (int sarake = 0; sarake < taulukko1.length; sarake++) {
                palautettavat.append(taulukko1[sarake]);
            }
            palautettavat.append("\n");
        }
        return palautettavat.toString();
    }
}

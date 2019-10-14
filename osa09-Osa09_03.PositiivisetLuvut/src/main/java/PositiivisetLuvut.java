import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<>();
        luvut.add(-3);
        luvut.add(7);
        luvut.add(4);
        luvut.add(2);
        luvut.add(-6);
        System.out.println(luvut);
        positiiviset(luvut);
        System.out.println(luvut);

    }
    public static List<Integer> positiiviset(List<Integer> luvut){
        return luvut.stream().filter(luku -> luku >= 0)
                .collect(Collectors.toList());
    }
}

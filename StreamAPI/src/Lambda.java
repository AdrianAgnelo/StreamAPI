import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        //Consumer<Integer> dobrar = (v) -> {dobro.add(v*2);};
        //values.forEach(dobrar);
        
        values.forEach((v) -> {
            dobro.add(v*2);
            if (v%2 == 0) {
                par.add(v);
            }else {
                impar.add(v);
            }
        });



        System.out.println(values);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}

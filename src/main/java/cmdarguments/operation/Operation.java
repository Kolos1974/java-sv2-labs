package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++){
            String temp = args[i];
            boolean wrote = false;
            if (temp.equals("/list") && !wrote){
                System.out.println("Listázás");
                wrote = true;
            }

            if (temp.equals("/add") && !wrote){
                System.out.println("Hozzáadás");
                wrote = true;
            }

            if (temp.equals("/delete") && !wrote){
                System.out.println("Törlés");
                wrote = true;
            }

            if (!wrote){
                System.out.println("Ismeretlen művelet");
                wrote = true;
            }

        }



    }

}

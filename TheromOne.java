import java.util.ArrayList;

public class TheromOne {
    public ArrayList<ArrayList<Integer>>numsTried = new ArrayList<>();
    public String equation;
    public int a;
    public int b;

    /*
    @param numsTried: numbers already attempted to be pluged in
     */
    public TheromOne(String currentEquation, int var1, int var2){
        this.equation = currentEquation;
        this.a = var1;
        this.b = var2;
    }

    public void theromOneNums(){
        System.out.println("Why don't you work?");
        numsTried.add(new ArrayList<>());
        numsTried.add(new ArrayList<>());
        for(int i = -100; i<100; i++){
            for(int j = -100; j<100; j++){
                if((3*i) + (5*j) == 1){
                    numsTried.get(0).add(i);
                    numsTried.get(1).add(j);
                }
            }
        }
        getNums();

    }

    public String getNums(){
        System.out.print(numsTried.toString());
        sorted();
        return numsTried.toString();
    }

    public void sorted(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < numsTried.get(i).size(); j++){
                for(int k = 0; k < numsTried.get(i).size(); k++){
                    System.out.println("j " + numsTried.get(i).get(j));
                    System.out.println("i " + numsTried.get(i).get(k));
                    if(Math.abs(numsTried.get(i).get(j)) > Math.abs(numsTried.get(i).get(j))){
                        System.out.println("Bigger");
                        int temp = numsTried.get(i).get(j);
                        System.out.println(temp);
                        numsTried.get(i).set(numsTried.indexOf(j), numsTried.get(i).get(k));
                        numsTried.get(i).set(numsTried.lastIndexOf(k), temp);

                    }
                }
            }
        }
        System.out.println(numsTried.toString());
    }

    public static void main(String[] args) {
        TheromOne a = new TheromOne("3c + 5d = 1", 0, 0);
        a.theromOneNums();
    }
}

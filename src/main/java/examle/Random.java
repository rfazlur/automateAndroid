package examle;

public class Random {

    public static String index[] = new String[5];
    public static Integer random;
    public static String result;

    public static void RandomIndex(){
        index[0] = "2";
        index[1] = "4";
        index[2] = "6";
        index[3] = "8";
        index[4] = "10";

        random = (int) (Math.random()*5);
        result = index[random];
        System.out.println(result);
    }

    public static void main(String[] args){
        RandomIndex();
    }



    /*public static void main(String[]args){
        PrintResult();
        String result = index[random];
    }

    public static void PrintResult(){
        public static random;
        String[]index;
        index = new String[5];
        index[0] = "2";
        index[1] = "4";
        index[2] = "6";
        index[3] = "8";
        index[4] = "10";

        int random = (int) (Math.random()*5);
    }*/


}

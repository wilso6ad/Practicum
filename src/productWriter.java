import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;


public class productWriter {

    private static String response = "Y";
    private static int ctr = 0;
    private static int id = 00001;
    private static URI fileName;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        SafeInput SafeInput = new SafeInput();

        while(true){
            if(ctr == 0){
                String list_string = "";
                list_string += String.format("%05d", id) + ", ";
                list_string += SafeInput.getNonZeroLenString(in, "Enter name of product") + ", ";
                list_string += SafeInput.getNonZeroLenString(in, "Enter Description of product") + ", ";
                list_string += SafeInput.getNonZeroLenString(in, "Enter Cost of product") + ", ";
                list.add(list_string);
                id++;
                ctr++;
            }
            else if(ctr == 1){
                boolean res = SafeInput.getYNConfirm(in, "Do you have more records?");
                if(res){
                    String list_string = "";
                    list_string += String.format("%05d", id) + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter name of product") + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter Description of product") + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter Cost of product") + ", ";
                    list.add(list_string);
                    id++;
                }
                else if (!res)
                {
                    System.out.println("\n");
                    for(int i = 0; i < list.size(); i++){
                        System.out.println(list.get(i));
                    }
                    break;
                }}}}}


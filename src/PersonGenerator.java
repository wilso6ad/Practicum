import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonGenerator {

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
                list_string += SafeInput.getNonZeroLenString(in, "Enter First Name") + ", ";
                list_string += SafeInput.getNonZeroLenString(in, "Enter Last Name") + ", ";
                list_string += SafeInput.getNonZeroLenString(in, "Enter Title") + ", ";
                list_string += String.valueOf(SafeInput.getRangedInt(in, "Enter Date of Birth ", 1000, 9999));
                list.add(list_string);
                id++;
                ctr++;
            }
            else if(ctr == 1){
                boolean res = SafeInput.getYNConfirm(in, "Do you have more records?");
                if(res){
                    String list_string = "";
                    list_string += String.format("%05d", id) + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter First Name") + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter Last Name") + ", ";
                    list_string += SafeInput.getNonZeroLenString(in, "Enter Title") + ", ";
                    list_string += String.valueOf(SafeInput.getRangedInt(in, "Enter Date of Birth ", 1000, 9999));
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
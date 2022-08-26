package assignment.assigmet4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerFormKYC{

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(inputReader.readLine());

        Date kycDate[] = new Date[input1];
        Date currentDate[] = new Date[input1];

        for(int i = 0;i<input1 ;i++){

            String input[] = inputReader.readLine().trim().split(" ");

            String pattern = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

            kycDate[i] = simpleDateFormat.parse(input[0]);
            currentDate[i] = simpleDateFormat.parse(input[1]);

        }

        System.out.println(solution(kycDate,currentDate,input1));
    }

    static String solution(Date kycDate[] ,Date currentDate[] ,int input1){

        StringBuffer output = new StringBuffer();

        for(int i = 0 ;i<input1 ;i++){

            kycDate[i].setYear(currentDate[i].getYear());
            Date range  = kycDate[i];
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

            range.setDate((range.getDate()-30));

            if(range.compareTo(currentDate[i])>=0){
                output.append("No range"+"\n");
            }
            else {

                String format = formatter.format(range);
                output.append(format+" ");

                range.setDate(range.getDate()+60);

                if(range.compareTo(currentDate[i])>0) {
                    format = formatter.format(currentDate[i]);
                    output.append(format+"\n");
                }
                else{
                    format = formatter.format(range);
                    output.append(format+"\n");
                }
            }

        }

        return new String(output);
    }
}

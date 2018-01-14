package com.dqserv.dqpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.POSD.controllers.PrinterController;






public class Orders extends AppCompatActivity {


    public String companyName = "DigitalQ Information Services";
    public String addressLine1 = "#G2,C-Block";
    public String addressLine2 = "Hansavandhana Apartment";
    public String addressLine3 = "Naidu Shop Street";
    public String addressLine4 = "Radha Nagar, Chrompet";
    public String addressLine5 = "Chennai, India - 600 044";
    public String phonenumbers = "Phone: +91-(0)44-2265 1990";
    public String GSTNumber = "GST: 123456789012";

    public String thankyou = "Thank You !! Visit Again";

    public double width = 32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        Button btn = (Button) findViewById(R.id.button9);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add/insert item to ArrayAdapter
                // Insert at the end of ArrayAdapter
                // ArrayAdapter is zero based index
                //printer
                try {
                    PrinterController printerController = PrinterController.getInstance();


                    // connect printer
                    int flag = printerController.PrinterController_Open();

                    int centerpoint = 0;

                    PrinterController.getInstance().PrinterController_PrinterLanguage(1);
                    printerController.PrinterController_Linefeed();

                    if (companyName.trim().length() != 0) {
                        centerpoint = getCenterPoint(companyName.trim());
                        printerController.PrinterController_Print(print(addspace(0, centerpoint) + companyName));
                        printerController.PrinterController_Linefeed();
                    }

                    printerController.PrinterController_Print(print(getdashline()));
                    printerController.PrinterController_Linefeed();

                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(getApplicationContext(),
                            "Print problem" + ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    public byte[] print(String line){
        return new StringBuffer(line).reverse().toString().getBytes();
    }

    public String addspace(int start,int end){
        String space="";
        for(int i=start;i<end;i++){
            space+=" ";
        }
        return space;
    }


    public String getastriskline(){
        String line="";
        for(int i=0;i<42;i++){
            line+="*";
        }
        return line;
    }

    public String getdashline(){
        String line="";
        for(int i=0;i<32;i++){
            line+="-";
        }
        return line;
    }
    public String getABCD(){
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890ABCDEF";
    }

    public int getRightPoint(String line){
        double maxline = width;
        double actline = line.length();
        int x = ((int)maxline)-((int)actline);
        return x;
    }

    public int getCenterPoint(String line){
        double maxline = width;
        int center = (int) (maxline/2);
        int centerlength = (int) (line.length()/2);
        int x = center-centerlength;
        return x;
    }

    public String ratecheck(String rate){
        String result="";
        if(!rate.contains("."))
            rate=rate+".00";
        if(rate.contains(".")){
            int index = rate.indexOf(".");
            String beforedigit = rate.substring(0,index);
            String afterdigit = rate.substring(index+1, rate.length());
            if(afterdigit.trim().length()==1){
                afterdigit+="0";
            }

            if(beforedigit.trim().length()==1){
                String digits = "  "+beforedigit;
                beforedigit = digits;
            }
            if(beforedigit.trim().length()==2){
                String digits = " "+beforedigit;
                beforedigit = digits;
            }
            result=beforedigit+"."+afterdigit;
            System.out.println("["+result+"]");
        }
        return result;
    }

    public String amountcheck(String rate){
        String result="";
        if(!rate.contains("."))
            rate=rate+".00";
        if(rate.contains(".")){
            int index = rate.indexOf(".");
            String beforedigit = rate.substring(0,index);
            String afterdigit = rate.substring(index+1, rate.length());
            if(afterdigit.trim().length()==1){
                afterdigit+="0";
            }

            if(beforedigit.trim().length()==1){
                String digits = "   "+beforedigit;
                beforedigit = digits;
            }
            if(beforedigit.trim().length()==2){
                String digits = "  "+beforedigit;
                beforedigit = digits;
            }
            if(beforedigit.trim().length()==3){
                String digits = " "+beforedigit;
                beforedigit = digits;
            }
            result=beforedigit+"."+afterdigit;
            System.out.println("["+result+"]");
        }
        return result;
    }

    public String totalamountcheck(String rate){
        String result="";
        if(!rate.contains("."))
            rate=rate+".00";
        if(rate.contains(".")){
            int index = rate.indexOf(".");
            String beforedigit = rate.substring(0,index);
            String afterdigit = rate.substring(index+1, rate.length());
            if(afterdigit.trim().length()==1){
                afterdigit+="0";
            }
            result=beforedigit+"."+afterdigit;
            System.out.println("["+result+"]");
        }
        return result;
    }

}

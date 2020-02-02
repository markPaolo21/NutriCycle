package com.example.sloppyseconds;

import android.widget.Button;
import java.util.ArrayList;


public class GatheringData {

    Button button2 = null;

    ArrayList <String> dataList = new ArrayList<String>() ;

   public ArrayList addData(String data){
       dataList.add(data);
       return dataList;
   }

}

package com.janbask.training2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float value = (5*6)+(8%4);

        //both these are same
        value+=10;
        value=value+10;

        //all these are same
        value++;
        value+=1;
        value=value+1;

        //prefix
        ++value;

        //postfix
        value++;

        int testvalue = 10;
        int prefixed = ++testvalue;     //11
        int postfixed = testvalue++;    //11
        //testvalue = 12

        //conversion

        float operationresult;

        int operand1=5;
        int operand2=22;
        float operand=25.4876f;
        float operand3 = 5.0f;
        int integerresult;

        operationresult = 10+15;
        operationresult=operand1+operand;

        //this would give an error!
        //integerresult=operand1+operand;

        int divisionresult1 = operand2/operand1;    //4
        float divresultfloat = operand2/operand3;   //4.4
        float testdiv = operand2/operand1;      //4.0
        int testdivint = (int) (operand3/operand1);
    }
}

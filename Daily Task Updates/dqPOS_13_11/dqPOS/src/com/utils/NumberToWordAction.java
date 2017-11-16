/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

/**
 *
 * @author Mangesh
 */
public class NumberToWordAction {

    String m_strOutputNumber = "";

    public synchronized void pw(int n, String ch) {
        String one[] = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};

        String ten[] = {"", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety"};

        if (n > 19) {
            // System.out.print(ten[n/10]+" "+one[n%10]);
            m_strOutputNumber = m_strOutputNumber + "" + ten[n / 10] + "" + one[n % 10];
        } else {
            //  System.out.print(one[n]);
            m_strOutputNumber = m_strOutputNumber + "" + one[n];
        }
        if (n > 0) // System.out.print(ch);
        {
            m_strOutputNumber = m_strOutputNumber + "" + ch;
        }
    }

//    public static void main(String[] args) {
//        int num = 05;
//        NumberToWordAction a = new NumberToWordAction();
//        System.out.println(a.getNumberInWord(num)+" Rupees");
//        System.out.print(" And ");
//        num = 05;
//    }
    public synchronized String getNumberInWord(int num) {
        try {
            pw((num / 1000000000), " Hundred");
            pw((num / 10000000) % 100, " Crore");
            pw(((num / 100000) % 100), " Lakh");
            pw(((num / 1000) % 100), " Thousand");
            pw(((num / 100) % 10), " Hundred");
            pw((num % 100), "");

            return m_strOutputNumber;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m_strOutputNumber;
    }
}

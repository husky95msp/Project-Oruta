/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.Random;

/**
 *
 * @author RameshKumar
 */
public class RandomKeyGen {
    static final String block1 = "0123456789";
    static final String block2 = "ABC446878457843ijklmnopq75834584327rstuvwxyz";
    static final String block3 = "EFGH643578346573TUVWXYZabc32318740023nopqrstuvwxyz";
    static final String block4 = "ABCD98579687RSTUVWXYZabcdefghijk87569357654768vwxyz";
    static final String block5 = "75843938498QRSTU76V985769458WXjklm767nopqrstuvwxyz";
   static final String AB = "012345678911121314151617184653543535433"; 
   public static int randNum(int min, int max) {
        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
        
    }
   public static String randomAlpha(int len){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rand.nextInt(AB.length())));
        }
        return sb.toString();
    }
   public static String randomAlphaNum(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rand.nextInt(AB.length())));
        }
        return sb.toString();
    }
   public static String randomblock1(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
           sb.append(block1.charAt(rand.nextInt(block1.length())));
        }
        return sb.toString();
    } 
   public static String randomblock2(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(block2.charAt(rand.nextInt(block2.length())));
        }
        return sb.toString();
    } 
   public static String randomblock3(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(block3.charAt(rand.nextInt(block3.length())));
        }
        return sb.toString();
    } 
   public static String randomblock4(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(block4.charAt(rand.nextInt(block4.length())));
        }
        return sb.toString();
    } 
   public static String randomblock5(int len) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(block5.charAt(rand.nextInt(block5.length())));
        }
        return sb.toString();
    } 
}


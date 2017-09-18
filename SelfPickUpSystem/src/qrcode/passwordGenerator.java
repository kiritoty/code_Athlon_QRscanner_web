package qrcode;
import java.util.Random;

/**
 * Created by XIaofeng on 9/16/17.
 */
public class passwordGenerator {

    public String createPassWord(int len){
        int random = this.createRandomInt();
        return this.createPassWord(random, len);
    }

    public String createPassWord(int random,int len){
        Random rd = new Random(random);
        final int  maxNum = 62;
        StringBuffer sb = new StringBuffer();
        int rdGet;
        char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'A','B','C','D','E','F','G','H','I','J','K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y' ,'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        int count=0;
        while(count < len){
            rdGet = Math.abs(rd.nextInt(maxNum));
            if (rdGet >= 0 && rdGet < str.length) {
                sb.append(str[rdGet]);
                count ++;
            }
        }
        return sb.toString();
    }

    public int createRandomInt(){
        
        double temp = Math.random()*100000;
        
        if(temp>=100000){
            temp = 99999;
        }
        int tempint = (int)Math.ceil(temp);
        return tempint;
    }

}

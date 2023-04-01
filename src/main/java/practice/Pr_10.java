package practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Pr_10 {
    public static void main(String[]args){

        int a,b;

        System.out.println("#제2단# #제3단#  #제4단#  #제5단#  #제6단#  #제7단#  #제8단#  #제9단# ");

        for(b = 1; b <10; b++){
            for(a = 2; a<10; a++){
                System.out.printf("%dx%d=%d\t",a,b,a*b);
            }
        System.out.println();
        }
    }
}

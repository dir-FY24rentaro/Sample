package sample;

public class ForSample {

    public static void main(String[] args) {
        for (var i=1; i<=10; i++) {
            System.out.println(i);
        }
        /*for(var j=2; j<=20; j+=2) {
            System.out.println(j);
        }
        for (int i=1; i<=20;i++) {
            if(i%2!=0) {
                continue;//continueは繰り返しのスキップ
            }
        System.out.println(i);
        }
        for(int i=1; i<=100; i+=2){
             if(i>20){
             break;繰り返しから抜け出す
           　　}
           System.out.println(i);
         }*/
        var numbers=new int[] {1,2,3,4,5};
        
        for(var number :numbers) {
            System.out.println(number);
        }
    }

}

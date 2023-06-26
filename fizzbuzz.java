 class FizzBuzz {
  
  /**
   * 1から順番に数を表記する
   * その数が３で割り切れるなら"Fizz",5で割り切れるなら"FizzBuzz"と表示する
   */
   
   public static void main (String[] args){
   //変数宣言
   //ループカウンター
   int i = 0;
   //繰り返し最大数
   int loopcount = 100;
   //3の倍数
   int numFizz = 3;
   //5の倍数
   int numBuzz = 5;
   //Fizz文字列
   String strFizz = "Fizz";
   //Buzz文字列
   String strBuzz = "BUzz";
   
   for (i = 1; i <= loopcount; i++){
     if (i % (numBuzz*numFizz) == 0){
       System.out.print(strFizz + strBuzz);
     }else if (i%numFizz == 0){
       System.out.println(strFizz);
     }else if (i%numBuzz == 0){
       System.out.println(strBuzz);
     }else {
       System.out.println(i);
     }
     
     }
     }
     }
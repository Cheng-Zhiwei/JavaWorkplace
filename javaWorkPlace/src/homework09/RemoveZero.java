package homework09;

public class RemoveZero{
    public static void main(String[] args){
        int oldArr[]= {0,3,0,5,0,0,6,0,0,5,0,7,6,10,0,6};
        int count=0;
      
        //判断不为0的值的个数, 确定建立新数组的长度
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                count++;
            }
        }
        
        int newArr[]=new int[count];
        int newIndex=0;//newArr的索引值，利用newIndex++来递增索引
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                newArr[newIndex]=oldArr[i];
                newIndex++;
            }
        }
        for(int e: newArr) 
        	System.out.print(e+" ");
    }
}

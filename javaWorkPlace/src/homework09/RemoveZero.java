package homework09;

public class RemoveZero{
    public static void main(String[] args){
        int oldArr[]= {0,3,0,5,0,0,6,0,0,5,0,7,6,10,0,6};
        int count=0;
      
        //�жϲ�Ϊ0��ֵ�ĸ���, ȷ������������ĳ���
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                count++;
            }
        }
        
        int newArr[]=new int[count];
        int newIndex=0;//newArr������ֵ������newIndex++����������
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

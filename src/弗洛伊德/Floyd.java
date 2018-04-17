package ��������;
class Floyd{
	int [][]pathMatirx=new int [5][4];
	int [][] preTable=new int [5][4];
	int [][] matrix=new int [5][4];
	int MAX_WEIGHT=65536;
	public void floyd(){  
    //·������D������ʾ���㵽��������·��Ȩֵ֮�͵ľ��󣬳�ʼʱ������ͼ���ڽӾ���  
    pathMatirx = new int[matrix.length][matrix.length];  
    //ǰ����P����P[m][n] ��ֵΪ m��n�����·����ǰ�����㣬�����ֱ����ֵΪn��Ҳ���ǳ�ʼֵ  
    preTable = new int[matrix.length][matrix.length];  
      
    //��ʼ��D,P  
    for (int i = 0; i < matrix.length; i++) {  
        for (int j = 0; j < matrix.length; j++) {  
            pathMatirx[i][j] = matrix[i][j];  
            preTable[i][j] = j;  
        }  
    }  
      
    //ѭ�� �м侭������  
    for (int k = 0; k < matrix.length; k++) {  
        //ѭ������·��  
        for (int m = 0; m < matrix.length; m++) {  
              
            for (int n = 0; n < matrix.length; n++) {  
                  
                int mn = pathMatirx[m][n];  
                int mk = pathMatirx[m][k];  
                int kn = pathMatirx[k][n];  
                int addedPath = (mk == MAX_WEIGHT || kn == MAX_WEIGHT)? MAX_WEIGHT : mk + kn;  
                  
                if (mn > addedPath) {  
                    //�������k����·����ԭ����·�����̣��������Ȩֵ��Ϊ��С��һ��  
                    pathMatirx[m][n] = addedPath;  
                    //ǰ������Ϊ�����±�Ϊk�Ķ���  
                    preTable[m][n] = preTable[m][k];  
                }  
                  
            }  
        }  
    }  
}  }
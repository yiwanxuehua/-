package 弗洛伊德;
class Floyd{
	int [][]pathMatirx=new int [5][4];
	int [][] preTable=new int [5][4];
	int [][] matrix=new int [5][4];
	int MAX_WEIGHT=65536;
	public void floyd(){  
    //路径矩阵（D），表示顶点到顶点的最短路径权值之和的矩阵，初始时，就是图的邻接矩阵。  
    pathMatirx = new int[matrix.length][matrix.length];  
    //前驱表（P），P[m][n] 的值为 m到n的最短路径的前驱顶点，如果是直连，值为n。也就是初始值  
    preTable = new int[matrix.length][matrix.length];  
      
    //初始化D,P  
    for (int i = 0; i < matrix.length; i++) {  
        for (int j = 0; j < matrix.length; j++) {  
            pathMatirx[i][j] = matrix[i][j];  
            preTable[i][j] = j;  
        }  
    }  
      
    //循环 中间经过顶点  
    for (int k = 0; k < matrix.length; k++) {  
        //循环所有路径  
        for (int m = 0; m < matrix.length; m++) {  
              
            for (int n = 0; n < matrix.length; n++) {  
                  
                int mn = pathMatirx[m][n];  
                int mk = pathMatirx[m][k];  
                int kn = pathMatirx[k][n];  
                int addedPath = (mk == MAX_WEIGHT || kn == MAX_WEIGHT)? MAX_WEIGHT : mk + kn;  
                  
                if (mn > addedPath) {  
                    //如果经过k顶点路径比原两点路径更短，将两点间权值设为更小的一个  
                    pathMatirx[m][n] = addedPath;  
                    //前驱设置为经过下标为k的顶点  
                    preTable[m][n] = preTable[m][k];  
                }  
                  
            }  
        }  
    }  
}  }
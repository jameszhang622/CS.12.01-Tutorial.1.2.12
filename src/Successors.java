public class Successors {

    public static Position findPosition(int x, int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                if(arr[i][j] == x){
                    Position position = new Position(i, j);
                    return position;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] position = new Position[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                position[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }
        return position;
    }

}

// https://leetcode.com/problems/flipping-an-image/
// Flipping an Image	
public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            reverse(image[i]);
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j] = 0;
                }else if(image[i][j]==0){
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
    
}

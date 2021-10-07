public class PermutationProblem {
    //space for the permutation problem
}


/**
 * PSEUDOCODE:
 *
 * public int[] depth(Tree n){
 *     int[] end = new int[2];
 *     int val1 = 0;
 *     int val2 = 0;
 *     if(n.getLeft()!= null){
 *         val1 = 1 + max(depth(n.getLeft());
 *     }
 *     else{
 *         val1 = 1;
 *     }
 *     if(n.getRight()!= null){
 *           val2 = 1 + max(depth(n.getRight());
 *      }
 *      else{
 *         val2 = 1;
 *      }
 *      end[0] = val1; end[1] = val2;
 *      return end;
 * }
 */
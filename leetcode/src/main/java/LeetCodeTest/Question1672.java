package LeetCodeTest;

/**
 * @author PengZou
 * @create 2023-01-14 15:29
 */
public class Question1672 {

    //        1672. 最富有客户的资产总量
//        给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j]是第 i 位客户在第 j 家银行托管的资产数量。
//        返回最富有客户所拥有的 资产总量 。
//        客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
    public static int maximumWealth(int[][] accounts) {

        int[] result = new int[accounts.length];
        int max=0;

        for (int i = 0; i < accounts.length; i++) {
            int temp=0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            max = Math.max(max, temp);
            result[i] = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int i = maximumWealth(accounts);
        System.out.println(i);
    }

}

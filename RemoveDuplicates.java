import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char str[] = "malayalam".toCharArray();
        int n = str.length;
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        String res=String.valueOf(Arrays.copyOf(str, index));
        System.out.println(res);


	}

}

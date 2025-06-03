=begin
public class InsertionSort
{
    public static void insertionSort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j;
            for (j = i - 1; j >=0 && temp < a[j]; j--)
                a[j + 1] = a[j];
            a[j + 1] = temp;
        }
    }
}
=end

def insertionSort(a)
	for i in 1...a.length
		temp = a[i]
		j = i - 1
		while j >= 0 and temp < a[j]
			a[j + 1] = a[j]
			j -= 1
		end
		a[j + 1] = temp
	end
	return a
end
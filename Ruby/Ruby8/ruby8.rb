
def bubbleSort(a[])
    swap
    c = 0
    while c < a.length - 1
        d = 0
        for d < a.length - c - 1
            if (a[d] > a[d+1]) /* For descending order use < */
            {
                swap = a[d];
                a[d] = a[d + 1];
                a[d + 1] = swap;
            }
            d += 1
        c +=1
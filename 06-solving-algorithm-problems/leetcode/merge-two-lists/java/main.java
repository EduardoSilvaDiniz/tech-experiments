class MergeTwoLists
{
 public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2)
 {
        //TODO usar API lambda para simplificar o codigo
        if(list1.isEmpty() && list2.isEmpty())
            throw new IllegalArgumentException("as listas fornecidas estãos nulas");
        if (list1.isEmpty())
            return list2;
        if (list2.isEmpty())
            return list1;

        LinkedList<Integer> merge = new LinkedList<Integer>();
        int leng = 0, l1 = 0, l2 = 0;

        for (int i = 0; i < (list1.size()+list2.size()); i++) {
            if (l1 < list1.size() && l2 < list2.size()) {
                if(list1.get(l1) < list2.get(l2)) {
                    merge.add(list1.get(l1++));
                } else {
                    merge.add(list2.get(l2++));
                }
            } else {
                while ((l1 < list1.size())) {
                    merge.add(list1.get(l1++));
                }
                while (l2 < list2.size()) {
                    merge.add(list2.get(l2++));
                }
            }
        }
        return merge;
 }
}

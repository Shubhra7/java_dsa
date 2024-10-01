public class kalu {
    Node start;

    static class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data = data;
        }
    }

    static void display(kalu list){
        Node cc = list.start;
        while (cc != null){
            System.out.println(cc.data+" ");
            cc = cc.next;
        }
    }

    static kalu addLast(kalu list, int data){
        Node n = new Node(data);
        if(list.start == null)
            list.start = n;
        else{
            Node p = list.start;
            while (p.next != null) {
                p=p.next;
            }
            p.next = n;
        }
        return list;
    }
    public static void main(String args[]){
        System.out.println("Hi debjit");

        kalu obj= new kalu();
        obj = addLast(obj, 4);
        obj = addLast(obj, 5);
        obj = addLast(obj, 6);
        obj = addLast(obj, 89);

        display(obj);

    }
}
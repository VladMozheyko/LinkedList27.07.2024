public class LinkedList {

    private Item head;
    private Item temp;
    int size;          // Use optionaly


    public LinkedList() {
        size = 0;        // default size
    }

    public void add(Item item){
        if(head == null){                // Если первый элемент, то добавляем его в голову
            head = item;
        }
        else {                           // Если не первый элемент, то идем до конца списка
            temp = head;
            while (temp.next != null){  // when the end off the list is reached, break loop
                temp = temp.next;
            }
            temp.next = item;           // add item to the end
        }
        size++;
    }

    public void addToPosition(Item item, int position) throws ListException {
        if(position > size){   // break is size is out og bounds
            throw new ListException("Выход за пределы списка");
        }
        int count = 0;
        temp = head;
        while (position-1!= count){
            temp = temp.next;   // iterate the loop
            count++;
        }

        item.next = temp.next;
        temp.next = item;
    }

    public void showList() {
        temp = head;
        if (temp != null) {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;   // switch to the next item
            }

            System.out.println();
        }
    }


}

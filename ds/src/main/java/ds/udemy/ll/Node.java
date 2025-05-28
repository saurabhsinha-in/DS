package ds.udemy.ll;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
class Node {
    int value;
    Node next;

    Node(int data){
        this.value = data;
        this.next = null;
    }
}

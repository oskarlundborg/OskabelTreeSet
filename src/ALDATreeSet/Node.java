package ALDATreeSet;

/**
 * @author Mirella Isabel Diaz Johansson mijo1919
 * @author Oskar Lundborg oslu6451
 */

class Node<T extends Comparable<T>>  {
    T data;
    int color;
    Node<T> left;
    Node<T> right;
    Node<T> next;
    Node<T> prev;

    Node(T data){
        this.data = data;
    }
}
